package me.nikol.snake.game.model

import com.fasterxml.jackson.annotation.JsonProperty

data class GameAnnouncement(
    val players: GamePlayers,
    val config: GameConfig,
    @JsonProperty("can_join")
    val canJoin: Boolean = true,
    @JsonProperty("game_name")
    val gameName: String
) {
    override fun hashCode(): Int {
        return gameName.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GameAnnouncement

        if (gameName != other.gameName) return false

        return true
    }
}
