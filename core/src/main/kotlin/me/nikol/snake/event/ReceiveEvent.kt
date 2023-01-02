package me.nikol.snake.event

import me.nikol.snake.game.model.GameMessage

interface ReceiveEvent<T> {
    val msg: GameMessage<T>;
    val receiverIp: String;
    val receiverPort: Int
}