package me.nikol.snake.game.service.other

import me.nikol.snake.game.model.DelayedMessage
import me.nikol.snake.game.model.JoinMsg

interface JoinService {
    fun join(msg: DelayedMessage<JoinMsg>)

}