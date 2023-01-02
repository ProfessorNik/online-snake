package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.model.JoinMsg

data class SendJoinMsgEvent(override val msg: GameMessage<JoinMsg>, override val hostAddress: String, override val port: Int) :
    SendEvent<JoinMsg> {
}