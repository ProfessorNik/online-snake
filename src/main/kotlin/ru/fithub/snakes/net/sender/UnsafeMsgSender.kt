package ru.fithub.snakes.net.sender

import org.mapstruct.factory.Mappers
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.basic.EventListener

class UnsafeMsgSender<M : Any>(
    private val byteSender: ByteSender
) : EventListener<SendEvent<M>> {
    private val mapper: Mapper = Mappers.getMapper(Mapper::class.java)
    override fun handle(event: SendEvent<M>) {
        val msg = mapper.map(event.msg)
        println("MESSAGE SENDING... ${event.msg} ADDRESS: ${event.hostAddress}:${event.port}")
        byteSender.send(event.hostAddress, event.port, msg.toByteArray())
        println("MESSAGE SENT ${event.msg} ADDRESS: ${event.hostAddress}:${event.port}")
    }
}