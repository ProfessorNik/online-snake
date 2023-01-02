package me.nikol.snake.game.service.other.impl

import me.nikol.snake.game.config.GameProperties
import me.nikol.snake.game.infrastructure.AnnouncementPresenter
import me.nikol.snake.game.model.*
import me.nikol.snake.game.service.other.AnnouncementService
import me.nikol.snake.utils.DaemonSingleThreadScheduledExecutor
import java.util.concurrent.TimeUnit

class AnnouncementServiceImpl(
    private val announcementPresenter: AnnouncementPresenter
) : AnnouncementService {
    private val activeGames: MutableMap<GameAnnouncement, Destination> = HashMap()

    val schedulerCollectionGarbageAnnouncement = DaemonSingleThreadScheduledExecutor().apply {
        scheduleWithFixedDelay(
            {
                collectionGarbageAnnouncement()
            },
            GARBAGE_ANNOUNCEMENT_COLLECTION_TIME,
            GARBAGE_ANNOUNCEMENT_COLLECTION_TIME,
            TimeUnit.MILLISECONDS
        )
    }

    companion object {
        private val properties: GameProperties = GameProperties.INSTANCE
        private val PLAYER_NAME: String = properties.getProperty("player.name")
        private val ANNOUNCEMENT_EXPIRATION_TIME = properties.getProperty("announcement.garbage-collection.expiration-time").toLong()
        private val GARBAGE_ANNOUNCEMENT_COLLECTION_TIME =
            properties.getProperty("announcement.garbage-collector.schedule-ms").toLong()
    }

    @Synchronized
    override fun addNewGame(msg: GameMessage<AnnouncementMsg>, hostAddress: String, port: Int) {
        val destination = Destination(hostAddress, port, System.currentTimeMillis())
        activeGames.putAll(msg.msg.games.associateWith { destination })
        showGames()
    }

    private fun showGames() {
        announcementPresenter.showActiveGames(map(activeGames))
    }

    private fun map(activeGames: MutableMap<GameAnnouncement, Destination>): List<Triple<GameAnnouncement, DelayedMessage<JoinMsg>, DelayedMessage<JoinMsg>?>> {
        return activeGames.map { entry ->
            Triple(
                entry.key,
                DelayedMessage(
                    JoinMsg(
                        playerName = PLAYER_NAME,
                        gameName = entry.key.gameName,
                        requestedRole = NodeRole.VIEWER
                    ), entry.value.ipAddress, entry.value.port
                ),
                if (entry.key.canJoin) DelayedMessage(
                    JoinMsg(
                        playerName = PLAYER_NAME,
                        gameName = entry.key.gameName,
                        requestedRole = NodeRole.NORMAL
                    ), entry.value.ipAddress, entry.value.port
                ) else null
            )
        }
    }


    @Synchronized
    private fun collectionGarbageAnnouncement() {
        with(activeGames.iterator()) {
            forEach {
                if (System.currentTimeMillis() - it.value.announcementTime > ANNOUNCEMENT_EXPIRATION_TIME)
                    remove()
            }
        }
        showGames()
    }
}