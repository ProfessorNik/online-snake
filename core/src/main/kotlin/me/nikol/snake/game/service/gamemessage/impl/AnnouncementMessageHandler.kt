package me.nikol.snake.game.service.gamemessage.impl

import me.nikol.snake.game.model.AnnouncementMsg
import me.nikol.snake.game.model.GameMessage
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.gamemessage.MessageHandler
import me.nikol.snake.game.service.other.AnnouncementService

class AnnouncementMessageHandler(val announcementService: AnnouncementService) : MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, hostAddress: String, port: Int) {
        if (clazz == AnnouncementMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleAnnouncementMsg(msg as GameMessage<AnnouncementMsg>, hostAddress, port);
        }
    }

    override fun changeBehavior(behavior: Behavior) {
        //do nothing
    }

    private fun handleAnnouncementMsg(msg: GameMessage<AnnouncementMsg>, hostAddress: String, port: Int) {
        announcementService.addNewGame(msg, hostAddress, port)
    }
}