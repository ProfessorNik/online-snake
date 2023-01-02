package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.AnnouncementMsg
import ru.fithub.snakes.core.model.GameMessage

data class SendAnnouncementMsgEvent(val msg: GameMessage<AnnouncementMsg>)