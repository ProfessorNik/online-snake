package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.GameMessage

interface SendEvent<T> {
    val msg: GameMessage<T>
    val hostAddress: String
    val port: Int
}