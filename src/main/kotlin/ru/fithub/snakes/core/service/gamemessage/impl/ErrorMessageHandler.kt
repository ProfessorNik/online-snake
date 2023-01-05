package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.core.model.ErrorMsg
import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.service.gamemessage.MessageHandler
import ru.fithub.snakes.event.ReceiveErrorMsgEvent
import ru.fithub.snakes.event.ReceiveEvent
import ru.fithub.snakes.event.basic.EventPublisher

class ErrorMessageHandler(private val receivedErrorMessagePublisher: EventPublisher<ReceiveEvent<ErrorMsg>>) :
    MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        if (clazz == ErrorMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            receivedErrorMessagePublisher.publishAsyncEvent(
                ReceiveErrorMsgEvent(msg as GameMessage<ErrorMsg>, ipAddress, port)
            )
        }
    }
}