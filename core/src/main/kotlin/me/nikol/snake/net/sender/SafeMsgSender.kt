package me.nikol.snake.net.sender

import com.badlogic.gdx.utils.Logger
import me.nikol.snake.event.ReceiveEvent
import me.nikol.snake.event.SendEvent
import me.nikol.snake.event.basic.EventListener
import me.nikol.snake.event.basic.EventPublisher
import me.nikol.snake.game.model.AckMsg
import me.nikol.snake.game.model.ErrorMsg
import org.mapstruct.factory.Mappers

class SafeMsgSender<M: Any>(private val byteSender: ByteSender, private val ackMsgPublisher: EventPublisher<ReceiveEvent<AckMsg>>, private val errorMsgPublisher: EventPublisher<ReceiveEvent<ErrorMsg>>) : EventListener<SendEvent<M>> {
    private val logger: Logger = Logger(this::class.qualifiedName, Logger.INFO)
    private val mapper: Mapper = Mappers.getMapper(Mapper::class.java)
    override fun handle(event: SendEvent<M>) {
        val msg = mapper.map(event.msg)
        logger.info("MESSAGE SAFE SENDING... ${event.msg} ADDRESS: ${event.hostAddress}:${event.port}")
        byteSender.safeSend(event.hostAddress, event.port, msg.toByteArray(), event.msg.msgSeq, ackMsgPublisher, errorMsgPublisher)
        logger.info("MESSAGE SAFE SENT ${event.msg} ADDRESS: ${event.hostAddress}:${event.port}")
    }
}