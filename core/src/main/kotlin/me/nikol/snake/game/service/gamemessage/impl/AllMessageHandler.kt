package me.nikol.snake.game.service.gamemessage.impl

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.behavior.impl.NothingBehavior
import me.nikol.snake.game.service.gamemessage.MessageHandler

class AllMessageHandler : MessageHandler {
    var behavior: Behavior = NothingBehavior()
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        behavior.updateLastTimeMessage(hostAddress, port)
    }

    override fun changeBehavior(behavior: Behavior) {
        this.behavior = behavior
    }
}