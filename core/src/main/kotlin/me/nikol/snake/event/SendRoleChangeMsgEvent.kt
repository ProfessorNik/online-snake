package me.nikol.snake.event

import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.model.RoleChangeMsg
import me.nikol.snake.game.model.StateMsg

data class SendRoleChangeMsgEvent(override val msg: GameMessage<RoleChangeMsg>, override val hostAddress: String, override val port: Int): SendEvent<RoleChangeMsg>