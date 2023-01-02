package me.nikol.snake.event

import me.nikol.snake.game.model.DiscoverMsg
import me.nikol.snake.game.model.GameMessage

data class DiscoverMsgEvent(val msg: GameMessage<DiscoverMsg>, val hostAddress: String, val port: Int) {
}