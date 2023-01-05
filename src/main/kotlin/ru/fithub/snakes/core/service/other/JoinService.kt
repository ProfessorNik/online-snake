package ru.fithub.snakes.core.service.other

import ru.fithub.snakes.core.model.DelayedMessage
import ru.fithub.snakes.core.model.GameAnnouncement
import ru.fithub.snakes.core.model.JoinMsg

interface JoinService {
    fun join(msg: DelayedMessage<JoinMsg>, parentMsg: GameAnnouncement)

}