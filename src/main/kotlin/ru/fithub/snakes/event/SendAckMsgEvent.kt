package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.AckMsg
import ru.fithub.snakes.core.model.GameMessage

data class SendAckMsgEvent(override val msg: GameMessage<AckMsg>, override val hostAddress: String, override val port: Int): SendEvent<AckMsg>