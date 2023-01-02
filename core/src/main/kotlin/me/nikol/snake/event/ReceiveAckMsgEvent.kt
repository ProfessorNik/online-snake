package me.nikol.snake.event

import me.nikol.snake.game.model.AckMsg
import me.nikol.snake.game.model.GameMessage

data class ReceiveAckMsgEvent(override val msg: GameMessage<AckMsg>, override val receiverIp: String, override val receiverPort: Int): ReceiveEvent<AckMsg> {
}