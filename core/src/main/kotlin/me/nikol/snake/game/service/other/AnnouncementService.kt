package me.nikol.snake.game.service.other

import me.nikol.snake.game.model.AnnouncementMsg
import me.nikol.snake.game.model.DelayedMessage
import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.JoinMsg

interface AnnouncementService {
    fun addNewGame(msg: GameMessage<AnnouncementMsg>, hostAddress: String, port: Int)
}