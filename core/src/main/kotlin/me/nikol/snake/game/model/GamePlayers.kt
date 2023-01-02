package me.nikol.snake.game.model

import com.fasterxml.jackson.annotation.JsonProperty

data class GamePlayers(
    val players: List<GamePlayer>
)

data class GamePlayer(
    val name: String,
    val id: Int,
    @JsonProperty("ip_address")
    val ipAddress: String?,
    val port: Int?,
    val role: NodeRole,
    val type: PlayerType = PlayerType.HUMAN,
    val score: Int
)

enum class PlayerType(n: Int) {
    HUMAN(0),
    ROBOT(1)
}

enum class NodeRole(n: Int) {
    NORMAL(0),
    MASTER(1),
    DEPUTY(2),
    VIEWER(3)
}
