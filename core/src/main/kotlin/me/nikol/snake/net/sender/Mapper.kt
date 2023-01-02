package me.nikol.snake.net.sender

import me.nikol.snake.dto.SnakesProto
import me.nikol.snake.game.model.*
import org.mapstruct.Mapping
import org.mapstruct.NullValueCheckStrategy


@org.mapstruct.Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
abstract class Mapper {
    fun <T> map(msg: GameMessage<T>): SnakesProto.GameMessage {
        val gameMessageBuilder = SnakesProto.GameMessage.newBuilder()
        gameMessageBuilder.msgSeq = msg.msgSeq
        msg.receiverId?.let { gameMessageBuilder.receiverId = it }
        msg.senderId?.let { gameMessageBuilder.senderId = it }
        when (msg.msg) {
            is AnnouncementMsg -> gameMessageBuilder.announcement = map(msg.msg)
            is JoinMsg -> gameMessageBuilder.join = map(msg.msg)
            is PingMsg -> gameMessageBuilder.ping = map(msg.msg)
            is SteerMsg -> gameMessageBuilder.steer = map(msg.msg)
            is AckMsg -> gameMessageBuilder.ack = map(msg.msg)
            is StateMsg -> gameMessageBuilder.state = map(msg.msg)
            is DiscoverMsg -> gameMessageBuilder.discover = map(msg.msg)
            is ErrorMsg -> gameMessageBuilder.error = map(msg.msg)
            is RoleChangeMsg -> gameMessageBuilder.roleChange = map(msg.msg)
            else -> throw IllegalArgumentException("unknown message: ${msg.msg}")
        }
        return gameMessageBuilder.build()
    }

    abstract fun map(msg: RoleChangeMsg): SnakesProto.GameMessage.RoleChangeMsg
    abstract fun map(msg: ErrorMsg): SnakesProto.GameMessage.ErrorMsg
    abstract fun map(msg: DiscoverMsg): SnakesProto.GameMessage.DiscoverMsg

    abstract fun map(msg: StateMsg): SnakesProto.GameMessage.StateMsg

    fun map(state: GameState): SnakesProto.GameState {
        val stateBuilder = SnakesProto.GameState.newBuilder()
        stateBuilder.players = map(state.players)
        stateBuilder.addAllSnakes(state.snakes.map { map(it) })
        stateBuilder.addAllFoods(state.foods.map { map(it) })
        stateBuilder.stateOrder = state.stateOrder
        return stateBuilder.build()
    }

    abstract fun map(msg: AckMsg): SnakesProto.GameMessage.AckMsg
    abstract fun map(msg: SteerMsg): SnakesProto.GameMessage.SteerMsg
    abstract fun map(msg: PingMsg): SnakesProto.GameMessage.PingMsg
    abstract fun map(msg: JoinMsg): SnakesProto.GameMessage.JoinMsg

    fun map(msg: AnnouncementMsg): SnakesProto.GameMessage.AnnouncementMsg {
        val nmsg = SnakesProto.GameMessage.AnnouncementMsg.newBuilder()

        for (i in 0 until msg.games.size) {
            nmsg.addGames(i, map(msg.games[i]))
        }

        return nmsg.build()
    }

    fun map(players: GamePlayers): SnakesProto.GamePlayers {
        val gamePlayers = SnakesProto.GamePlayers.newBuilder()

        for (i in 0 until players.players.size) {
            gamePlayers.addPlayers(i, map(players.players[i]))
        }

        return gamePlayers.build()
    }

    abstract fun map(player: GamePlayer): SnakesProto.GamePlayer
    abstract fun map(gameConfig: GameConfig): SnakesProto.GameConfig
    abstract fun map(announcement: GameAnnouncement): SnakesProto.GameAnnouncement

    fun map(msg: SnakesProto.GameMessage.AnnouncementMsg): AnnouncementMsg {
        return AnnouncementMsg(List(msg.gamesCount) { i -> map(msg.getGames(i)) })
    }

    abstract fun map(msg: SnakesProto.GameMessage.AckMsg): AckMsg

    abstract fun map(player: SnakesProto.GamePlayer): GamePlayer
    @Mapping(target="width", source="width")
    @Mapping(target="height", source="height")
    @Mapping(target="stateDelayMs", source="stateDelayMs")
    @Mapping(target="foodStatic", source="foodStatic")
    abstract fun map(gameConfig: SnakesProto.GameConfig): GameConfig
    abstract fun map(announcement: SnakesProto.GameAnnouncement): GameAnnouncement
    abstract fun map(msg: SnakesProto.GameMessage.DiscoverMsg): DiscoverMsg
    abstract fun map(msg: SnakesProto.GameMessage.ErrorMsg): ErrorMsg
    abstract fun map(msg: SnakesProto.GameMessage.StateMsg): StateMsg
    abstract fun map(msg: SnakesProto.GameMessage.JoinMsg): JoinMsg
    abstract fun map(msg: SnakesProto.GameMessage.RoleChangeMsg): RoleChangeMsg
    abstract fun map(msg: SnakesProto.GameMessage.PingMsg): PingMsg
    abstract fun map(msg: SnakesProto.GameMessage.SteerMsg): SteerMsg
    @Mapping(target="points", source="pointsList")
    @Mapping(target="direction", source="headDirection")
    abstract fun map(msg: SnakesProto.GameState.Snake): Snake

    @Mapping(target="snakes", source="snakesList")
    @Mapping(target="foods", source="foodsList")
    abstract fun map(state: SnakesProto.GameState): GameState

    fun mapFrom(msg: List<SnakesProto.GameState.Coord>): List<Coord>{
        return msg.map { map(it) }
    }

    fun mapTo(msg: List<Coord>): List<SnakesProto.GameState.Coord>{
        return msg.map { map(it) }
    }

    abstract fun map(msg: SnakesProto.GameState.Coord): Coord

    fun map(msg: Snake): SnakesProto.GameState.Snake{
        val builder = SnakesProto.GameState.Snake.newBuilder()
        builder.addAllPoints(mapTo(msg.points))
        builder.headDirection = map(msg.direction)
        builder.playerId = msg.playerId
        builder.state = map(msg.state)
        return builder.build()
    }

    abstract fun map(msg: Coord): SnakesProto.GameState.Coord
    abstract fun map(msg: SnakeState): SnakesProto.GameState.Snake.SnakeState

    abstract fun map(direction: Direction): SnakesProto.Direction

    fun map(players: SnakesProto.GamePlayers): GamePlayers {
        return GamePlayers(List(players.playersCount) { i -> map(players.getPlayers(i)) })
    }

    fun map(msg: SnakesProto.GameMessage): GameMessage<*> {
        if (msg.hasAnnouncement()) {
            return GameMessage(msg.msgSeq, msg.senderId, msg.receiverId, map(msg.announcement))
        }
        if (msg.hasAck()) {
            return GameMessage(msg.msgSeq, msg.senderId, msg.receiverId, map(msg.ack))
        }
        if (msg.hasDiscover()) {
            return GameMessage(msg.msgSeq, msg.senderId, msg.receiverId, map(msg.discover))
        }
        if (msg.hasError()) {
            return GameMessage(msg.msgSeq, msg.senderId, msg.receiverId, map(msg.error))
        }
        if (msg.hasJoin()) {
            return GameMessage(msg.msgSeq, msg.senderId, msg.receiverId, map(msg.join))
        }
        if (msg.hasPing()) {
            return GameMessage(msg.msgSeq, msg.senderId, msg.receiverId, map(msg.ping))
        }
        if (msg.hasRoleChange()) {
            return GameMessage(msg.msgSeq, msg.senderId, msg.receiverId, map(msg.roleChange))
        }
        if (msg.hasState()) {
            return GameMessage(msg.msgSeq, msg.senderId, msg.receiverId, map(msg.state))
        }
        if (msg.hasSteer()) {
            return GameMessage(msg.msgSeq, msg.senderId, msg.receiverId, map(msg.steer))
        }

        throw throw IllegalArgumentException("unknown message: $msg")
    }
}