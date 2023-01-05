package ru.fithub.snakes.core.service.other.impl

import ru.fithub.snakes.core.model.AckMsg
import ru.fithub.snakes.core.model.ApplicationStateType
import ru.fithub.snakes.core.model.ErrorMsg
import ru.fithub.snakes.core.model.NodeRole
import ru.fithub.snakes.core.repostiory.ClientRepository
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.basic.EventListener
import ru.fithub.snakes.event.basic.EventPublisher

class MessagesRegistrarImpl(
    val generalRepository: GeneralRepository,
    val clientRepository: ClientRepository,
    val serverRepository: ServerRepository,
    val applicationStateService: ApplicationStateService,
    ackPublisher: EventPublisher<SendEvent<AckMsg>>,
    errorPublisher: EventPublisher<SendEvent<ErrorMsg>>
) {
    private val registrarAck = RegistrarAck(this)
    private val registrarErr = RegistrarErr(this)

    init {
        ackPublisher.addListener(registrarAck)
        errorPublisher.addListener(registrarErr)
    }

    class RegistrarAck(private val messagesRegistrarImpl: MessagesRegistrarImpl) : EventListener<SendEvent<AckMsg>> {
        override fun handle(event: SendEvent<AckMsg>) {
            with(messagesRegistrarImpl) {
                if (applicationStateService.applicationStateType == ApplicationStateType.GAME) {
                    when (applicationStateService.nodeRole) {
                        NodeRole.MASTER -> {
                            serverRepository.getConnectionByIpAndPort(
                                event.hostAddress,
                                event.port
                            )?.answeredAckMessages?.put(event.msg.msgSeq, event.msg)
                        }
                        NodeRole.VIEWER, NodeRole.NORMAL, NodeRole.DEPUTY -> {
                            clientRepository.master?.answeredAckMessages?.put(event.msg.msgSeq, event.msg)
                        }
                        else -> {
                            //do nothing
                        }
                    }
                }
            }
        }

    }

    class RegistrarErr(private val messagesRegistrarImpl: MessagesRegistrarImpl) : EventListener<SendEvent<ErrorMsg>> {
        override fun handle(event: SendEvent<ErrorMsg>) {
            with(messagesRegistrarImpl) {
                if (applicationStateService.applicationStateType == ApplicationStateType.GAME) {
                    when (applicationStateService.nodeRole) {
                        NodeRole.MASTER -> {
                            serverRepository.getConnectionByIpAndPort(
                                event.hostAddress,
                                event.port
                            )?.answeredErrorMessages?.put(event.msg.msgSeq, event.msg)
                        }
                        NodeRole.VIEWER, NodeRole.NORMAL, NodeRole.DEPUTY -> {
                            clientRepository.master?.answeredErrorMessages?.put(event.msg.msgSeq, event.msg)
                        }
                        else -> {
                            //do nothing
                        }
                    }
                }
            }
        }

    }
}