package me.nikol.snake.game.service.gamemessage

import me.nikol.snake.game.model.*
import me.nikol.snake.game.service.behavior.Behavior

interface GameMessageService {
    fun <M> handleMessage(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int)
    fun changeBehavior(behavior: Behavior)
}