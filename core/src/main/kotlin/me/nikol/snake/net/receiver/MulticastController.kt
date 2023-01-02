package me.nikol.snake.net.receiver

import me.nikol.snake.dto.SnakesProto

interface MulticastController {
    fun multicastGameMessage(gameMessage: SnakesProto.GameMessage, hostAddress: String, port: Int)
}