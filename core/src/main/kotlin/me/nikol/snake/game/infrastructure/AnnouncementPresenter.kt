package me.nikol.snake.game.infrastructure

import me.nikol.snake.game.graphic.AnnouncementTable
import me.nikol.snake.game.model.*

class AnnouncementPresenter(private val announcementTable: AnnouncementTable) {
    fun showActiveGames(activeGames: List<Triple<GameAnnouncement, DelayedMessage<JoinMsg>, DelayedMessage<JoinMsg>?>>) {
        announcementTable.change(activeGames)
    }

    private fun map(activeGames: List<Triple<GameAnnouncement, DelayedMessage<JoinMsg>, DelayedMessage<JoinMsg>?>>): List<Triple<String, DelayedMessage<JoinMsg>, DelayedMessage<JoinMsg>?>> {
        return activeGames.map { triple ->
            val master: GamePlayer = triple.first.players.players.find { it.role == NodeRole.MASTER }!!
            Triple(
                "${master.name}[${master.ipAddress}] ${triple.first.players.players.size} ${triple.first.config.width}x${triple.first.config.height} ${triple.first.config.foodStatic}+1x",
                triple.second,
                triple.third
            )
        }
    }
}