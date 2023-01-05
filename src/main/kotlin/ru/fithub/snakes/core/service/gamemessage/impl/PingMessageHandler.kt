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

class PingMessageHandler(
    private val serverRepository: ServerRepository,
    private val generalRepository: GeneralRepository,
    private val clientRepository: ClientRepository,
    private val messageFormer: MessageFormer,
    private val sendAckMessageEventPublisher: EventPublisher<SendEvent<AckMsg>>,
    private val applicationStateService: ApplicationStateService
) : MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        if (clazz == PingMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handlePingMessage(msg as GameMessage<PingMsg>, ipAddress, port)
        }
    }

    private fun handlePingMessage(msg: GameMessage<PingMsg>, ipAddress: String, port: Int) {
        if (applicationStateService.applicationStateType == ApplicationStateType.GAME) {
            when (applicationStateService.nodeRole) {
                NodeRole.MASTER -> {
                    serverRepository.getConnectionByIpAndPort(ipAddress, port)?.playerId?.let { receiverId ->
                        replyWithAckMessage(msg.msgSeq, receiverId, ipAddress, port)
                    }
                }
                NodeRole.VIEWER, NodeRole.NORMAL, NodeRole.DEPUTY -> {
                    clientRepository.master!!.playerId!!.let { receiverId ->
                        replyWithAckMessage(msg.msgSeq, receiverId, ipAddress, port)
                    }
                }
                else -> {
                    //do nothing
                }
            }
        }
    }
    private fun replyWithAckMessage(msgSeq: Long, receiverId: Int, ipAddress: String, port: Int) {
        println("ACK ON PING")
        val response = messageFormer.ackMsg(receiverId, msgSeq)
        sendAckMessageEventPublisher.publishAsyncEvent(SendAckMsgEvent(response, ipAddress, port))
    }
}