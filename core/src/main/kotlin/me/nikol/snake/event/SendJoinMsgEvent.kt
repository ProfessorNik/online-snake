package me.nikol.snake.event

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.JoinMsg

data class SendJoinMsgEvent(override val msg: GameMessage<JoinMsg>, override val hostAddress: String, override val port: Int) : SendEvent<JoinMsg>{
}