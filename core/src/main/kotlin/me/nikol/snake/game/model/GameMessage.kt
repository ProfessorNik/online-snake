package me.nikol.snake.game.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

data class GameMessage<T>(
    @JsonProperty("msg_seq")
    val msgSeq: Long,
    @JsonProperty("sender_id")
    val senderId: Int?,
    @JsonProperty("receiver_id")
    val receiverId: Int?,

    val msg: T
//    val ping: PingMsg?,
//    val steer: SteerMsg?,
//    val ack: AckMsg?,
//    val state: StateMsg?,
//    val announcement: AnnouncementMsg?,
//    val join: JoinMsg?,
//    val error: ErrorMsg?,
//    @JsonProperty("role_change")
//    val roleChange: RoleChangeMsg?,
//    val discover: DiscoverMsg?
)

@JsonRootName("discover")
class DiscoverMsg

@JsonRootName("ping")
class PingMsg

@JsonRootName("steer")
data class SteerMsg(val direction: Direction)

@JsonRootName("ack")
class AckMsg

@JsonRootName("state")
data class StateMsg(val state: GameState)

@JsonRootName("announcement")
data class AnnouncementMsg(val games: List<GameAnnouncement>)

@JsonRootName("join")
data class JoinMsg(
    @JsonProperty("player_type")
    val playerType: PlayerType = PlayerType.HUMAN,
    @JsonProperty("player_name")
    val playerName: String,
    @JsonProperty("game_name")
    val gameName: String,
    @JsonProperty("requested_role")
    val requestedRole: NodeRole
)

@JsonRootName("error")
data class ErrorMsg(
    val errorMessage: String
)

@JsonRootName("role_change")
data class RoleChangeMsg(
    val senderRole: NodeRole?,
    val receiverRole: NodeRole?
)