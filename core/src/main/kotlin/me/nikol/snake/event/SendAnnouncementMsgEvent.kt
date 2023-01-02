package me.nikol.snake.event

import me.nikol.snake.game.model.AnnouncementMsg
import me.nikol.snake.game.model.GameMessage

data class SendAnnouncementMsgEvent(val msg: GameMessage<AnnouncementMsg>)