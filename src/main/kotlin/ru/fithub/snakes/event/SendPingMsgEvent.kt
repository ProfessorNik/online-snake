package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.model.PingMsg

data class SendPingMsgEvent(override val msg: GameMessage<PingMsg>, override val hostAddress: String, override val port: Int):
    SendEvent<PingMsg> {
        init {
            println("SEND PING MSG EVENT INIT")
        }
}