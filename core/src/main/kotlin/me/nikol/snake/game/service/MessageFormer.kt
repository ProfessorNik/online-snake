package me.nikol.snake.game.service

import me.nikol.snake.game.model.*

class MessageFormer(var senderId: Int) {
    var seq = 11L
    get() {
        field += 1
        return field
    }

    fun announcementMsg(receiverId: Int?, announcement: GameAnnouncement): GameMessage<AnnouncementMsg> {
        return GameMessage(seq, senderId, receiverId, AnnouncementMsg(listOf(announcement)));
    }

    fun ackMsg(seq: Long, receiverId: Int?): GameMessage<AckMsg> {
        return GameMessage(seq, senderId, receiverId, AckMsg())
    }

    fun steerMsg(receiverId: Int?, direction: Direction): GameMessage<SteerMsg> {
        return GameMessage(seq, senderId, receiverId, SteerMsg(direction));
    }

    fun errorMsg(seq: Long, receiverId: Int?, error: String): GameMessage<ErrorMsg> {
        return GameMessage(seq, senderId, receiverId, ErrorMsg(error))
    }

    fun roleChangeMsg(receiverId: Int?, senderRole: NodeRole?, receiverRole: NodeRole?): GameMessage<RoleChangeMsg> {
        return GameMessage(seq, senderId, receiverId, RoleChangeMsg(senderRole, receiverRole))
    }

    fun stateMsg(receiverId: Int?, gameState: GameState): GameMessage<StateMsg> {
        return GameMessage(seq, senderId, receiverId, StateMsg(gameState))
    }

    fun pingMsg(receiverId: Int?): GameMessage<PingMsg> {
        return GameMessage(seq, senderId, receiverId, PingMsg())
    }
}
