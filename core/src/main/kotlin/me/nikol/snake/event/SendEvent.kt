package me.nikol.snake.event

import me.nikol.snake.game.model.GameMessage

interface SendEvent<T> {
    val msg: GameMessage<T>
    val hostAddress: String
    val port: Int
}