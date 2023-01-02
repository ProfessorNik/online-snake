package ru.fithub.snakes.core.service.other.impl

import ru.fithub.snakes.core.model.AckMsg
import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.service.other.AckService
import ru.fithub.snakes.event.ReceiveAckMsgEvent
import ru.fithub.snakes.event.basic.EventPublisher

class AckServiceImpl(private val receiveAckMsgEventPublisher: EventPublisher<ReceiveAckMsgEvent>) : AckService {
    override fun ack(msg: GameMessage<AckMsg>, senderIp: String, receiverPort: Int) {
        receiveAckMsgEventPublisher.publishAsyncEvent(ReceiveAckMsgEvent(msg, senderIp, receiverPort))
    }
}