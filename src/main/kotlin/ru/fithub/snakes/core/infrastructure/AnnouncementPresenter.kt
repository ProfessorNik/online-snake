package ru.fithub.snakes.core.infrastructure


import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.scenes.AnnouncementViewController

class AnnouncementPresenter() {
    var announcementViewController: AnnouncementViewController? = null
    fun showActiveGames(activeGames: List<Triple<GameAnnouncement, DelayedMessage<JoinMsg>, DelayedMessage<JoinMsg>?>>) {
        announcementViewController?.change(map(activeGames))
    }

    private fun map(activeGames: List<Triple<GameAnnouncement, DelayedMessage<JoinMsg>, DelayedMessage<JoinMsg>?>>): List<AvailableGame> {
        return activeGames.map { triple ->
            AvailableGame(
                triple.first,
                "${triple.first.gameName}[${triple.second.senderIp}:${triple.second.senderPort}], count players: ${triple.first.players.players.size} ${triple.first.config.width}x${triple.first.config.height} ${triple.first.config.foodStatic}+1x",
                triple.second,
                triple.third
            )
        }
    }
}