package ru.fithub.snakes.core.repostiory

import ru.fithub.snakes.core.model.Direction
import ru.fithub.snakes.core.model.GameConfig
import ru.fithub.snakes.core.model.GameState

class GeneralRepository {
    var msgSeq: Long? = null
    var playerId: Int? = null
    var newDirection: Direction? = null
    var playerName: String? = null
    var gameName: String? = null
    var gameState: GameState? = null
    var gameConfig: GameConfig? = null

    fun findPlayerIdByIpAndPort(ipAddress: String, port: Int): Int? {
        return gameState?.players?.players?.find { (it.ipAddress == ipAddress) && (it.port == port) }?.id
    }
}