package me.nikol.snake.event

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.PingMsg

data class SendPingMsgEvent(override val msg: GameMessage<PingMsg>, override val hostAddress: String, override val port: Int): SendEvent<PingMsg> {
}