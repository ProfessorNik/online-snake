package me.nikol.snake.game.service.gamemessage.impl

import me.nikol.snake.event.SendAckMsgEvent
import me.nikol.snake.game.JoinState
import me.nikol.snake.game.model.AckMsg
import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.JoinMsg
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.gamemessage.MessageHandler
import me.nikol.snake.game.service.other.JoinService

class JoinMessageHandler : MessageHandler {
    lateinit var behavior: Behavior

    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        if (clazz == JoinMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleJoinMessage(msg as GameMessage<JoinMsg>, hostAddress, port)
        }
    }

    private fun handleJoinMessage(msg: GameMessage<JoinMsg>, hostAddress: String, port: Int) {
        behavior.addNewPlayer(msg, hostAddress, port)
    }


    override fun changeBehavior(behavior: Behavior) {
        this.behavior = behavior
    }
}