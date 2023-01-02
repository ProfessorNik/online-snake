package me.nikol.snake.game.service.gamemessage.impl

import me.nikol.snake.event.ReceiveErrorMsgEvent
import me.nikol.snake.event.ReceiveEvent
import me.nikol.snake.event.basic.EventPublisher
import me.nikol.snake.game.model.ErrorMsg
import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.gamemessage.MessageHandler

class ErrorMessageHandler(private val receivedErrorMessagePublisher: EventPublisher<ReceiveEvent<ErrorMsg>>) :
    MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        if (clazz == ErrorMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            receivedErrorMessagePublisher.publishEvent(
                ReceiveErrorMsgEvent(msg as GameMessage<ErrorMsg>, hostAddress, port)
            )
        }
    }

    override fun changeBehavior(behavior: Behavior) {
        //do nothing
    }
}