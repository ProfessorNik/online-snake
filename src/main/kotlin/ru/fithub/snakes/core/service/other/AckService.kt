package ru.fithub.snakes.core.service.other

import ru.fithub.snakes.core.model.AckMsg
import ru.fithub.snakes.core.model.GameMessage

interface AckService {
    fun ack(msg: GameMessage<AckMsg>, senderIp: String, receiverPort: Int)
}