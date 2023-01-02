package me.nikol.snake.game.service.gamemessage.impl

import com.badlogic.gdx.utils.Logger
import me.nikol.snake.game.model.*
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.gamemessage.GameMessageService
import me.nikol.snake.game.service.gamemessage.MessageHandler

class GameMessageServiceImpl(private val handlers: List<MessageHandler>) : GameMessageService {
    private val logger: Logger = Logger(this::class.qualifiedName, Logger.INFO)

    override fun <M> handleMessage(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        logger.info("MESSAGE RECEIVED... $msg ADDRESS: $hostAddress:$port")
        handlers.forEach { it.handle(msg, clazz, hostAddress, port) }
    }

    override fun changeBehavior(behavior: Behavior) {
        handlers.forEach { it.changeBehavior(behavior) }
    }
}

