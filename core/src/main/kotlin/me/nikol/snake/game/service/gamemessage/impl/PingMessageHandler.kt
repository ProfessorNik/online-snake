package me.nikol.snake.game.service.gamemessage.impl

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.PingMsg
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.gamemessage.MessageHandler

class PingMessageHandler : MessageHandler {
    lateinit var behavior: Behavior

    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        if (clazz == PingMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handlePingMessage(msg as GameMessage<PingMsg>, hostAddress, port)
        }
    }

    private fun handlePingMessage(msg: GameMessage<PingMsg>, hostAddress: String, port: Int) {
        behavior.onPing(msg, hostAddress, port)
    }

    override fun changeBehavior(behavior: Behavior) {
        this.behavior = behavior
    }

}