package me.nikol.snake.game.service.other

import me.nikol.snake.game.model.AckMsg
import me.nikol.snake.game.model.GameMessage

interface AckService {
    fun ack(msg: GameMessage<AckMsg>, senderIp: String, receiverPort: Int)
}