package ru.fithub.snakes.core.config

import ru.fithub.snakes.core.model.*

class GameFactory {
    companion object {
        private val properties: GameProperties = GameProperties.INSTANCE
        const val GAME_CREATOR_ID = 1
        const val SCORE_INIT = 0
        const val STATE_ORDER_INIT = 1
    }

    fun properties(): GameProperties {
        return properties
    }

    fun gameConfig(): GameConfig {
        return GameConfig(
            properties.getProperty("config.filed.width").toInt(),
            properties.getProperty("config.field.height").toInt(),
            properties.getProperty("config.food-static").toInt(),
            properties.getProperty("config.state-delay-ms").toInt()
        )
    }

    fun gameState(gameConfig: GameConfig): GameState {
        return GameState(
            STATE_ORDER_INIT,
            listOf(snake(gameConfig)),
            listOf(),
            GamePlayers(listOf(gamePlayer()))
        )
    }

    private fun gamePlayer(): GamePlayer {
        return GamePlayer(
            properties.getProperty("player.name"),
            GAME_CREATOR_ID,
            properties.getProperty("hostname"),
            null,
            NodeRole.MASTER,
            PlayerType.HUMAN,
            SCORE_INIT
        )
    }

    private fun snake(gameConfig: GameConfig): Snake {
        return Snake(
            GAME_CREATOR_ID,
            coordsForFirstSnake(gameConfig),
            direction = Direction.RIGHT
        )
    }
}