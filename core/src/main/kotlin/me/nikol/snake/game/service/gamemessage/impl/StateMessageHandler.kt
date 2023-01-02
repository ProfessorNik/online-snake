package me.nikol.snake.game.service.gamemessage.impl

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.StateMsg
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.gamemessage.MessageHandler

class StateMessageHandler() : MessageHandler {
    lateinit var behavior: Behavior

    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        if (clazz == StateMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleStateMessage(msg as GameMessage<StateMsg>, hostAddress, port)
        }
    }

    private fun handleStateMessage(msg: GameMessage<StateMsg>, hostAddress: String, port: Int) {
        behavior.changeGameState(msg, hostAddress, port)
    }

    override fun changeBehavior(behavior: Behavior) {
        this.behavior = behavior
    }
}