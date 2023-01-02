package me.nikol.snake.net.sender

import com.badlogic.gdx.utils.Logger
import me.nikol.snake.event.SendAnnouncementMsgEvent
import me.nikol.snake.event.basic.EventListener
import me.nikol.snake.game.config.GameProperties
import org.mapstruct.factory.Mappers

class AnnouncementSender(private val byteSender: ByteSender) : EventListener<SendAnnouncementMsgEvent>{
    private val logger: Logger = Logger(this::class.qualifiedName, Logger.INFO)
    companion object {
        private val properties: GameProperties = GameProperties.INSTANCE
        private val MULTICAST_IP = properties.getProperty("receiver.multicast.ip")
        private val MULTICAST_PORT = properties.getProperty("multicast.port").toInt()
    }

    private val mapper: Mapper = Mappers.getMapper(Mapper::class.java)

    override fun handle(event: SendAnnouncementMsgEvent) {
        val bytes: ByteArray = mapper.map(event.msg).toByteArray()
        logger.info("MESSAGE SENDING... ${event.msg} MULTICAST_ADDRESS: ${MULTICAST_IP}:${MULTICAST_PORT}")
        byteSender.send(MULTICAST_IP, MULTICAST_PORT, bytes)
        logger.info("MESSAGE SENT ${event.msg} MULTICAST_ADDRESS: ${MULTICAST_IP}:${MULTICAST_PORT}")
    }
}