package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.ErrorMsg
import ru.fithub.snakes.core.model.GameMessage

class ReceiveErrorMsgEvent(override val msg: GameMessage<ErrorMsg>, override val receiverIp: String, override val receiverPort: Int):
    ReceiveEvent<ErrorMsg> {
}