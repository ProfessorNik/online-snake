package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.model.StateMsg

data class SendStateMsgEvent(override val msg: GameMessage<StateMsg>, override val hostAddress: String, override val port: Int):
    SendEvent<StateMsg> {
}