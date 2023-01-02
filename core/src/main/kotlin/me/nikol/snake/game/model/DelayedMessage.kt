package me.nikol.snake.game.model

data class DelayedMessage<M>(val msg: M, val senderIp: String, val senderPort: Int)