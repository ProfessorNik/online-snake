package ru.fithub.snakes.core.service.gamemessage

import ru.fithub.snakes.core.model.GameMessage

interface GameMessageService {
    fun <M> handleMessage(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int)
}