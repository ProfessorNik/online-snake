package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.event.ReceiveAckMsgEvent
import ru.fithub.snakes.event.ReceiveEvent
import ru.fithub.snakes.event.basic.EventPublisher
import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.service.gamemessage.MessageHandler

class AckMessageHandler(private val receiveAckMessageEventPublisher: EventPublisher<ReceiveEvent<AckMsg>>) : MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        if (clazz == AckMsg::class.java ) {
            @Suppress("UNCHECKED_CAST")
            receiveAckMessageEventPublisher.publishAsyncEvent(ReceiveAckMsgEvent(msg as GameMessage<AckMsg>, ipAddress, port))
        }
    }
}