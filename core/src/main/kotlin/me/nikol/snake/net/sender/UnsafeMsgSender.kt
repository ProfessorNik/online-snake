package me.nikol.snake.net.sender

import com.badlogic.gdx.utils.Logger
import me.nikol.snake.event.SendEvent
import me.nikol.snake.event.basic.EventListener
import org.mapstruct.factory.Mappers
import kotlin.math.log

class UnsafeMsgSender<M : Any>(
    private val byteSender: ByteSender
) : EventListener<SendEvent<M>> {
    private val logger: Logger = Logger(this::class.qualifiedName, Logger.INFO)
    private val mapper: Mapper = Mappers.getMapper(Mapper::class.java)
    override fun handle(event: SendEvent<M>) {
        val msg = mapper.map(event.msg)
        logger.info("MESSAGE SENDING... ${event.msg} ADDRESS: ${event.hostAddress}:${event.port}")
        byteSender.send(event.hostAddress, event.port, msg.toByteArray())
        logger.info("MESSAGE SENT ${event.msg} ADDRESS: ${event.hostAddress}:${event.port}")
    }
}