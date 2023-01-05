package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.repostiory.ClientRepository
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.core.service.gamemessage.MessageHandler
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.event.SendAckMsgEvent
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.basic.EventPublisher

class RoleChangeMessageHandler(
    private val serverRepository: ServerRepository,
    private val generalRepository: GeneralRepository,
    private val clientRepository: ClientRepository,
    private val messageFormer: MessageFormer,
    private val applicationStateService: ApplicationStateService,
    private val sendAckMessageEventPublisher: EventPublisher<SendEvent<AckMsg>>
) : MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        if (clazz == RoleChangeMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleRoleChangeMessage(msg as GameMessage<RoleChangeMsg>, ipAddress, port)
        }
    }

    private fun handleRoleChangeMessage(msg: GameMessage<RoleChangeMsg>, ipAddress: String, port: Int) {
        if (applicationStateService.applicationStateType == ApplicationStateType.GAME) {
            when (applicationStateService.nodeRole) {
                NodeRole.MASTER -> {
                    clientBecomeViewer(msg, ipAddress, port)
                }
                NodeRole.NORMAL -> {
                    if (generalRepository.playerId == null)
                        return
                    deputyBecameMaster(msg, ipAddress, port)
                    appointmentAsDeputy(msg, ipAddress, port)
                    playerDead(msg, ipAddress, port)
                }
                NodeRole.DEPUTY -> {
                    playerDead(msg, ipAddress, port)
                    appointmentAsMaster(msg, ipAddress, port)
                }
                NodeRole.VIEWER -> {
                    deputyBecameMaster(msg, ipAddress, port)
                }
                else -> {
                    //do nothing
                }
            }

            replyWithAckMessage(msg.msgSeq, generalRepository.playerId!!, ipAddress, port)
        }
    }

    private fun deputyBecameMaster(
        msg: GameMessage<RoleChangeMsg>,
        ipAddress: String,
        port: Int
    ) {
        if (msg.msg.senderRole == NodeRole.MASTER) {
            val master = clientRepository.master
                ?: throw NullPointerException("Master is missing in ClientRepository")
            master.ipAddress = ipAddress
            master.port = port
            master.playerId = generalRepository.findPlayerIdByIpAndPort(ipAddress, port)
            master.lastMessageTime = System.currentTimeMillis()
            master.lastSeqMessage = msg.msgSeq
        }
    }

    private fun clientBecomeViewer(msg: GameMessage<RoleChangeMsg>, ipAddress: String, port: Int) {
        if (msg.msg.senderRole == NodeRole.VIEWER) {
            serverRepository.getConnectionByIpAndPort(ipAddress, port)?.let { connection ->
                connection.becomeViewer = true
            }
        }
    }

    private fun playerDead(msg: GameMessage<RoleChangeMsg>, ipAddress: String, port: Int) {
        val master = clientRepository.master ?: throw NullPointerException("Master is missing in ClientRepository")
        if (msg.msg.receiverRole == NodeRole.VIEWER && master.ipAddress == ipAddress && master.port == port) {
            applicationStateService.changeState(ApplicationStateType.GAME, NodeRole.VIEWER)
        }
    }

    private fun appointmentAsMaster(msg: GameMessage<RoleChangeMsg>, ipAddress: String, port: Int) {
        val master = clientRepository.master ?: throw NullPointerException("Master is missing in ClientRepository")
        if (msg.msg.receiverRole == NodeRole.MASTER && master.ipAddress == ipAddress && master.port == port) {
            applicationStateService.changeState(ApplicationStateType.GAME, NodeRole.MASTER)
//            serverRepository.connections.addAll(
//                generalRepository.gameState!!.players.players.filter { it.id != generalRepository.playerId }.map {
//                    if (it.id != master.playerId) {
//                        Connection(
//                            it.id,
//                            it.ipAddress,
//                            it.port,
//                            lastMessageTime = System.currentTimeMillis()
//                        )
//                    }else{
//                        Connection(
//                            it.id,
//                            master.ipAddress!!,
//                            master.port!!,
//                            lastMessageTime = System.currentTimeMillis()
//                        )}
//                })
        }
    }

    private fun appointmentAsDeputy(msg: GameMessage<RoleChangeMsg>, ipAddress: String, port: Int) {
        val master = clientRepository.master ?: throw NullPointerException("Master is missing in ClientRepository")
        if (msg.msg.receiverRole == NodeRole.DEPUTY && master.ipAddress == ipAddress && master.port == port) {
            applicationStateService.changeState(ApplicationStateType.GAME, NodeRole.DEPUTY)
        }
    }

    private fun replyWithAckMessage(msgSeq: Long, receiverId: Int, ipAddress: String, port: Int) {
        val response = messageFormer.ackMsg(receiverId, msgSeq)
        sendAckMessageEventPublisher.publishAsyncEvent(SendAckMsgEvent(response, ipAddress, port))
    }
}