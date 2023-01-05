package ru.fithub.snakes.core.service.other.impl

import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.core.service.other.GameService
import ru.fithub.snakes.core.service.other.JoinService
import ru.fithub.snakes.event.ReceiveAckMsgEvent
import ru.fithub.snakes.event.ReceiveEvent
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.SendJoinMsgEvent
import ru.fithub.snakes.event.basic.EventListener
import ru.fithub.snakes.event.basic.EventPublisher

class JoinServiceImpl(
    private val joinPublisher: EventPublisher<SendEvent<JoinMsg>>,
    private val applicationStateService: ApplicationStateService,
    private val gameService: GameService,
    ackMsgEventPublisher: EventPublisher<ReceiveEvent<AckMsg>>,
    errorMsgEventPublisher: EventPublisher<ReceiveEvent<ErrorMsg>>,
) : JoinService, EventListener<ReceiveAckMsgEvent> {

    private val listener1: Listener1 = Listener1(this)
    private val listener2: Listener2 = Listener2(this)

    private val joinMsgSeq = 1L
    var masterMsg: DelayedMessage<GameAnnouncement>? = null

    lateinit var joinNodeRole: NodeRole

    init {
        ackMsgEventPublisher.addListener(listener1)
        errorMsgEventPublisher.addListener(listener2)
    }

    override fun join(msg: DelayedMessage<JoinMsg>, parentMsg: GameAnnouncement) {
        masterMsg = DelayedMessage(parentMsg, msg.senderIp, msg.senderPort)
        joinNodeRole = msg.msg.requestedRole
        joinPublisher.publishAsyncEvent(
            SendJoinMsgEvent(
                GameMessage(joinMsgSeq, null, null, msg.msg),
                msg.senderIp,
                msg.senderPort
            )
        )
    }

    override fun handle(event: ReceiveAckMsgEvent) {

    }

    class Listener1(private val joinService: JoinServiceImpl) : EventListener<ReceiveEvent<AckMsg>> {
        override fun handle(event: ReceiveEvent<AckMsg>) {
            with(joinService) {
                if (event.msg.msgSeq == 1L && masterMsg != null) {
                    if (masterMsg!!.senderIp == event.receiverIp && masterMsg!!.senderPort == event.receiverPort) {
                        gameService.prepareClientGame(
                            masterMsg!!.msg.config,
                            masterMsg!!.msg.gameName,
                            masterMsg!!.senderIp,
                            masterMsg!!.senderPort
                        )
                        applicationStateService.changeState(ApplicationStateType.GAME, joinNodeRole)
                        masterMsg = null
                    }
                }
            }
        }
    }

    class Listener2(private val joinService: JoinServiceImpl) : EventListener<ReceiveEvent<ErrorMsg>> {
        override fun handle(event: ReceiveEvent<ErrorMsg>) {
            with(joinService) {
                if (event.msg.msgSeq == 1L && masterMsg != null) {
                    if (masterMsg!!.senderIp == event.receiverIp && masterMsg!!.senderPort == event.receiverPort) {
                        applicationStateService.changeState(ApplicationStateType.MAIN_MENU, null)
                        masterMsg = null
                    }
                }
            }
        }
    }
}