package me.nikol.snake.game.service.gamemessage

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.service.behavior.Behavior

interface MessageHandler {
    fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int)
    fun changeBehavior(behavior: Behavior)
}