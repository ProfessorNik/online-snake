package ru.fithub.snakes.core.model

data class GameAnnouncement(
    val players: GamePlayers,
    val config: GameConfig,
    val canJoin: Boolean = true,
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
