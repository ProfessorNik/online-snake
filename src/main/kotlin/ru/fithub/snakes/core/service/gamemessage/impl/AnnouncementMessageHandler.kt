package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.core.model.AnnouncementMsg
import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.service.gamemessage.MessageHandler
import ru.fithub.snakes.core.service.other.AnnouncementService

class AnnouncementMessageHandler(private val announcementService: AnnouncementService) : MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        if (clazz == AnnouncementMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleAnnouncementMsg(msg as GameMessage<AnnouncementMsg>, ipAddress, port)
        }
    }

    private fun handleAnnouncementMsg(msg: GameMessage<AnnouncementMsg>, hostAddress: String, port: Int) {
        announcementService.addNewGame(msg, hostAddress, port)
    }
}