package ru.fithub.snakes.core.model

data class GameMessage<T>(
    val msgSeq: Long,
    val senderId: Int?,
    val receiverId: Int?,
    val msg: T
)

class DiscoverMsg

class PingMsg

data class SteerMsg(val direction: Direction)

class AckMsg

data class StateMsg(val state: GameState)

data class AnnouncementMsg(val games: List<GameAnnouncement>)

data class JoinMsg(
    val playerType: PlayerType = PlayerType.HUMAN,
    val playerName: String,
    val gameName: String,
    val requestedRole: NodeRole
)

data class ErrorMsg(
    val errorMessage: String
)

data class RoleChangeMsg(
    val senderRole: NodeRole?,
    val receiverRole: NodeRole?
)