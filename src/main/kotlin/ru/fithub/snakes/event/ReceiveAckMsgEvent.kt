package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.AckMsg
import ru.fithub.snakes.core.model.GameMessage

data class ReceiveAckMsgEvent(override val msg: GameMessage<AckMsg>, override val receiverIp: String, override val receiverPort: Int):
    ReceiveEvent<AckMsg> {
}