package ru.fithub.snakes.net.sender

import ru.fithub.snakes.event.ReceiveEvent
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.basic.EventListener
import ru.fithub.snakes.event.basic.EventPublisher
import org.mapstruct.factory.Mappers
import ru.fithub.snakes.core.model.AckMsg
import ru.fithub.snakes.core.model.ErrorMsg
import ru.fithub.snakes.event.StopSendMessagesToPlayerEvent

class SafeMsgSender<M : Any>(
    private val byteSender: ByteSender,
    private val ackMsgPublisher: EventPublisher<ReceiveEvent<AckMsg>>,
    private val errorMsgPublisher: EventPublisher<ReceiveEvent<ErrorMsg>>,
    private val stopEventPublisher: EventPublisher<StopSendMessagesToPlayerEvent>
) :
    EventListener<SendEvent<M>> {
    private val mapper: Mapper = Mappers.getMapper(Mapper::class.java)
    override fun handle(event: SendEvent<M>) {
        val msg = mapper.map(event.msg)
        println("MESSAGE SAFE SENDING... ${event.msg} ADDRESS: ${event.hostAddress}:${event.port}")
        byteSender.safeSend(
            event.hostAddress,
            event.port,
            msg.toByteArray(),
            event.msg.msgSeq,
            ackMsgPublisher,
            errorMsgPublisher,
            stopEventPublisher
        )
        println("MESSAGE SAFE SENT ${event.msg} ADDRESS: ${event.hostAddress}:${event.port}")
    }
}