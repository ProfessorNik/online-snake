package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.repostiory.ClientRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.service.gamemessage.MessageFilter
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.event.SendAckMsgEvent
import ru.fithub.snakes.event.SendErrorMsgEvent
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.basic.EventPublisher

class FilterOnAnsweredMessages(
    private val ackPublisher: EventPublisher<SendEvent<AckMsg>>,
    private val errorPublisher: EventPublisher<SendEvent<ErrorMsg>>,
    private val serverRepository: ServerRepository,
    private val clientRepository: ClientRepository,
    private val applicationStateService: ApplicationStateService
) : MessageFilter {
    override fun <M> filter(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int): Boolean {
        if(clazz == AckMsg::class.java || clazz == ErrorMsg::class.java){
            return true
        }
        if (applicationStateService.applicationStateType == ApplicationStateType.GAME) {
            when (applicationStateService.nodeRole) {
                NodeRole.MASTER -> {
                    serverRepository.getConnectionByIpAndPort(ipAddress, port)?.let { connection ->
                        return filterAndSend(connection, msg, ipAddress, port)
                    }
                }
                NodeRole.VIEWER, NodeRole.NORMAL, NodeRole.DEPUTY -> {
                    val master =
                        clientRepository.master ?: throw NullPointerException("Master is missing in ClientRepository")
                    if (ipAddress == master.ipAddress && port == master.port) {
                        return filterAndSend(master, msg, ipAddress, port)
                    }
                }
                else -> {
                    return true
                }
            }
        }
        return true
    }

    private fun <M> filterAndSend(
        connection: Connection,
        msg: GameMessage<M>,
        ipAddress: String,
        port: Int
    ) : Boolean{
        connection.answeredAckMessages[msg.msgSeq]?.let {
            ackPublisher.publishAsyncEvent(SendAckMsgEvent(it, ipAddress, port))
            return false
        }
        connection.answeredErrorMessages[msg.msgSeq]?.let {
            errorPublisher.publishAsyncEvent(SendErrorMsgEvent(it, ipAddress, port))
            return false
        }
        return true
    }
}