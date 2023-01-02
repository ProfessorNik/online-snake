package me.nikol.snake.game.service.other.impl

import me.nikol.snake.event.ReceiveAckMsgEvent
import me.nikol.snake.event.basic.EventPublisher
import me.nikol.snake.game.model.AckMsg
import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.service.other.AckService

class AckServiceImpl(private val receiveAckMsgEventPublisher: EventPublisher<ReceiveAckMsgEvent>) : AckService {
    override fun ack(msg: GameMessage<AckMsg>, senderIp: String, receiverPort: Int) {
        receiveAckMsgEventPublisher.publishEvent(ReceiveAckMsgEvent(msg, senderIp, receiverPort))
    }
}