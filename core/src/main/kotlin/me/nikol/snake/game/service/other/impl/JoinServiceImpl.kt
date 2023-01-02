package me.nikol.snake.game.service.other.impl

import me.nikol.snake.event.*
import me.nikol.snake.event.basic.EventListener
import me.nikol.snake.event.basic.EventPublisher
import me.nikol.snake.game.Main
import me.nikol.snake.game.StateType
import me.nikol.snake.game.infrastructure.GamePlayPresenter
import me.nikol.snake.game.model.*
import me.nikol.snake.game.service.behavior.impl.NormalBehavior
import me.nikol.snake.game.service.other.JoinService
import me.nikol.snake.net.sender.SafeByteSender

class JoinServiceImpl(
    private val joinPublisher: EventPublisher<SendEvent<JoinMsg>>,
    private val main: Main,
    ackMsgEventPublisher: EventPublisher<ReceiveEvent<AckMsg>>,
    errorMsgEventPublisher: EventPublisher<ReceiveEvent<ErrorMsg>>,
) : JoinService, EventListener<ReceiveAckMsgEvent> {

    val listener1: Listener1 = Listener1(this)
    val listener2: Listener2 = Listener2(this)

    init {
        ackMsgEventPublisher.addListener(listener1)
        errorMsgEventPublisher.addListener(listener2)
    }

    override fun join(msg: DelayedMessage<JoinMsg>) {
        joinPublisher.publishEvent(SendJoinMsgEvent(GameMessage(1, null, null, msg.msg), msg.senderIp, msg.senderPort))
    }

    override fun handle(event: ReceiveAckMsgEvent) {

    }

    class Listener1(private val joinService: JoinServiceImpl) : EventListener<ReceiveEvent<AckMsg>> {
        override fun handle(event: ReceiveEvent<AckMsg>) {
            if (event.msg.msgSeq == 1L) {
                joinService.main.changeState(StateType.GAME)
            }
        }
    }

    class Listener2(private val joinService: JoinServiceImpl) : EventListener<ReceiveEvent<ErrorMsg>> {
        override fun handle(event: ReceiveEvent<ErrorMsg>) {
            if (event.msg.msgSeq == 1L) {
                joinService.main.changeState(StateType.NOTHING)
            }
        }
    }
}