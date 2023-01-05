package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.service.gamemessage.GameMessageService
import ru.fithub.snakes.core.service.gamemessage.MessageFilter
import ru.fithub.snakes.core.service.gamemessage.MessageHandler

class GameMessageServiceImpl(private val handlers: List<MessageHandler>, val messageFilter: MessageFilter) : GameMessageService {
    override fun <M> handleMessage(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        println("MESSAGE RECEIVED... $msg ADDRESS: $ipAddress:$port")
        synchronized(this) {
            if(messageFilter.filter(msg, clazz, ipAddress, port)) {
                handlers.forEach { it.handle(msg, clazz, ipAddress, port) }
            }
        }
    }
}

