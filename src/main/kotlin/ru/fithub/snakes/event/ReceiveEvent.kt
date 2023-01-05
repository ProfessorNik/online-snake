package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.GameMessage

interface ReceiveEvent<T> {
    val msg: GameMessage<T>
    val receiverIp: String
    val receiverPort: Int
}