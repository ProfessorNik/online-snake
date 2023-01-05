package ru.fithub.snakes.core.service.gamemessage

import ru.fithub.snakes.core.model.GameMessage

interface MessageFilter {
    fun<M> filter(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int): Boolean
}