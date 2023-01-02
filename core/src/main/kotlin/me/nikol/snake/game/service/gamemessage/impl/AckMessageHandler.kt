package me.nikol.snake.game.service.gamemessage.impl

import me.nikol.snake.event.ReceiveAckMsgEvent
import me.nikol.snake.event.ReceiveEvent
import me.nikol.snake.event.basic.EventPublisher
import me.nikol.snake.game.model.AckMsg
import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.gamemessage.MessageHandler

class AckMessageHandler(private val receiveAckMessageEventPublisher: EventPublisher<ReceiveEvent<AckMsg>>) : MessageHandler{
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        if (clazz == AckMsg::class.java ) {
            @Suppress("UNCHECKED_CAST")
            receiveAckMessageEventPublisher.publishEvent(ReceiveAckMsgEvent(msg as GameMessage<AckMsg>, hostAddress, port))
        }
    }

    override fun changeBehavior(behavior: Behavior) {
        //do nothing
    }
}