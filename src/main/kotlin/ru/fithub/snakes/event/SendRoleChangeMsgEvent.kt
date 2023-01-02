package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.model.RoleChangeMsg

data class SendRoleChangeMsgEvent(override val msg: GameMessage<RoleChangeMsg>, override val hostAddress: String, override val port: Int):
    SendEvent<RoleChangeMsg>