package me.nikol.snake.game.service.gamemessage.impl

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.SteerMsg
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.gamemessage.MessageHandler

class SteerMessageHandler : MessageHandler {
    private lateinit var behavior: Behavior

    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        if (clazz == SteerMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleSteerMsg(msg as GameMessage<SteerMsg>, hostAddress, port)
        }
    }

    private fun handleSteerMsg(msg: GameMessage<SteerMsg>, hostAddress: String, port: Int) {
        behavior.changeDirectionByIpAndPort(msg, hostAddress, port)
    }

    override fun changeBehavior(behavior: Behavior) {
        this.behavior = behavior
    }
}