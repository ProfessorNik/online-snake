package ru.fithub.snakes.core.service

import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.repostiory.GeneralRepository

class MessageFormer(val generalRepository: GeneralRepository) {
    var seq: Long
    get() {
        if (generalRepository.msgSeq == null){
            generalRepository.msgSeq = 9
        }
        generalRepository.msgSeq = generalRepository.msgSeq!! + 1
        return generalRepository.msgSeq!!
    } set(value){
        generalRepository.msgSeq = value
    }

    val senderId: Int?
    get() = generalRepository.playerId

    fun announcementMsg(receiverId: Int?, announcement: GameAnnouncement): GameMessage<AnnouncementMsg> {
        return GameMessage(seq, senderId, receiverId, AnnouncementMsg(listOf(announcement)));
    }

    fun ackMsg(receiverId: Int?, seq: Long): GameMessage<AckMsg> {
        return GameMessage(seq, senderId, receiverId, AckMsg())
    }

    fun steerMsg(receiverId: Int?, direction: Direction): GameMessage<SteerMsg> {
        return GameMessage(seq, senderId, receiverId, SteerMsg(direction));
    }

    fun errorMsg(receiverId: Int?, seq: Long, error: String): GameMessage<ErrorMsg> {
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
