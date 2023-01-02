package me.nikol.snake.event

import me.nikol.snake.game.model.ErrorMsg
import me.nikol.snake.game.model.GameMessage

class ReceiveErrorMsgEvent(override val msg: GameMessage<ErrorMsg>, override val receiverIp: String, override val receiverPort: Int): ReceiveEvent<ErrorMsg> {
}