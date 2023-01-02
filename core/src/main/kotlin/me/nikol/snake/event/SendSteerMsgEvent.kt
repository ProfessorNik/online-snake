package me.nikol.snake.event

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.SteerMsg

data class SendSteerMsgEvent(override val msg: GameMessage<SteerMsg>, override val hostAddress: String, override val port: Int) : SendEvent<SteerMsg> {
}