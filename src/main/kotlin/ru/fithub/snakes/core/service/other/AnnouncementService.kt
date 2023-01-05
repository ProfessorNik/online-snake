package ru.fithub.snakes.core.service.other

import ru.fithub.snakes.core.model.AnnouncementMsg
import ru.fithub.snakes.core.model.GameMessage

interface AnnouncementService {
    fun addNewGame(msg: GameMessage<AnnouncementMsg>, hostAddress: String, port: Int)
}