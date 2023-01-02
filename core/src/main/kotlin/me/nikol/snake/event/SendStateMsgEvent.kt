package me.nikol.snake.event

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.StateMsg

data class SendStateMsgEvent(override val msg: GameMessage<StateMsg>, override val hostAddress: String, override val port: Int): SendEvent<StateMsg> {
}