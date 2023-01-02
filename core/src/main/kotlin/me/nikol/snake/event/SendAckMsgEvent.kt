package me.nikol.snake.event

import me.nikol.snake.game.model.AckMsg
import me.nikol.snake.game.model.GameMessage

data class SendAckMsgEvent(override val msg: GameMessage<AckMsg>, override val hostAddress: String, override val port: Int): SendEvent<AckMsg>