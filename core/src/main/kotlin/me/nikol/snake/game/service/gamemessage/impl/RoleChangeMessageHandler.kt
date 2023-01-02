package me.nikol.snake.game.service.gamemessage.impl

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.PingMsg
import me.nikol.snake.game.model.RoleChangeMsg
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.behavior.impl.NothingBehavior
import me.nikol.snake.game.service.gamemessage.MessageHandler

class RoleChangeMessageHandler : MessageHandler {
    var behavior :Behavior = NothingBehavior()
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        if (clazz == RoleChangeMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleRoleChangeMessage(msg as GameMessage<RoleChangeMsg>, hostAddress, port)
        }
    }

    private fun handleRoleChangeMessage(gameMessage: GameMessage<RoleChangeMsg>, hostAddress: String, port: Int) {
        behavior.onRoleChange(gameMessage, hostAddress, port)
    }

    override fun changeBehavior(behavior: Behavior) {
        this.behavior = behavior
    }
}