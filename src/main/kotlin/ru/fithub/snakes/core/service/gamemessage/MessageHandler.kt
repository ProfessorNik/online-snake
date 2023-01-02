package ru.fithub.snakes.core.service.gamemessage

import ru.fithub.snakes.core.model.GameMessage

interface MessageHandler {
    fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int)
}