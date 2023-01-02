package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.model.SteerMsg

data class SendSteerMsgEvent(override val msg: GameMessage<SteerMsg>, override val hostAddress: String, override val port: Int) :
    SendEvent<SteerMsg> {
}