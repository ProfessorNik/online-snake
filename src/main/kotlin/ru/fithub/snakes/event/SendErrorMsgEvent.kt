package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.ErrorMsg
import ru.fithub.snakes.core.model.GameMessage

data class SendErrorMsgEvent(override val msg: GameMessage<ErrorMsg>, override val hostAddress: String, override val port: Int):
    SendEvent<ErrorMsg> {
}