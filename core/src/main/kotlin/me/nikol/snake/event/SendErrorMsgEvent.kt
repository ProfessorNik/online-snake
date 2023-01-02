package me.nikol.snake.event

import me.nikol.snake.game.model.ErrorMsg
import me.nikol.snake.game.model.GameMessage

data class SendErrorMsgEvent(override val msg: GameMessage<ErrorMsg>, override val hostAddress: String, override val port: Int): SendEvent<ErrorMsg> {
}