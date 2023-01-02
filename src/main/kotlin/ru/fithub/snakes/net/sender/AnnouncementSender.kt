package ru.fithub.snakes.net.sender

import org.mapstruct.factory.Mappers
import ru.fithub.snakes.core.config.GameProperties
import ru.fithub.snakes.event.SendAnnouncementMsgEvent
import ru.fithub.snakes.event.basic.EventListener

class AnnouncementSender(private val byteSender: ByteSender) : EventListener<SendAnnouncementMsgEvent> {
    companion object {
        private val properties: GameProperties = GameProperties.INSTANCE
        private val MULTICAST_IP = properties.getProperty("receiver.multicast.ip")
        private val MULTICAST_PORT = properties.getProperty("multicast.port").toInt()
    }

    private val mapper: Mapper = Mappers.getMapper(Mapper::class.java)

    override fun handle(event: SendAnnouncementMsgEvent) {
        val bytes: ByteArray = mapper.map(event.msg).toByteArray()
        println("MESSAGE SENDING... ${event.msg} MULTICAST_ADDRESS: $MULTICAST_IP:$MULTICAST_PORT")
        byteSender.send(MULTICAST_IP, MULTICAST_PORT, bytes)
        println("MESSAGE SENT ${event.msg} MULTICAST_ADDRESS: $MULTICAST_IP:$MULTICAST_PORT")
    }
}