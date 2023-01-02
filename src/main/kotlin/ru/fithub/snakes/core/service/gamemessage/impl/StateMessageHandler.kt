package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.core.infrastructure.GamePlayPresenter
import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.repostiory.ClientRepository
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.core.service.gamemessage.MessageHandler
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.event.SendAckMsgEvent
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.basic.EventPublisher

class StateMessageHandler(
    private val generalRepository: GeneralRepository,
    private val clientRepository: ClientRepository,
    private val messageFormer: MessageFormer,
    private val sendAckMessageEventPublisher: EventPublisher<SendEvent<AckMsg>>,
    private val applicationStateService: ApplicationStateService,
    private val gamePlayPresenter: GamePlayPresenter
) : MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        if (clazz == StateMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleStateMessage(msg as GameMessage<StateMsg>, ipAddress, port)
        }
    }

    private fun handleStateMessage(msg: GameMessage<StateMsg>, ipAddress: String, port: Int) {
        if(applicationStateService.applicationStateType == ApplicationStateType.GAME
            && applicationStateService.nodeRole in listOf(NodeRole.VIEWER, NodeRole.DEPUTY, NodeRole.NORMAL)) {
            val master = clientRepository.master ?: throw NullPointerException("Master is missing in ClientRepository")

            if (master.ipAddress == ipAddress && master.port == port) {
                replyWithAckMessage(msg.msgSeq, null, ipAddress, port)
                if (master.lastStateOrder == null || master.lastStateOrder!! < msg.msg.state.stateOrder) {
                    generalRepository.gameState = msg.msg.state
                    master.lastStateOrder = msg.msg.state.stateOrder
                    gamePlayPresenter.updateField(msg.msg.state)
                    fillMasterId(msg)
                    fillPlayerId(msg)
                }
            }
        }
    }

    private fun fillMasterId(msg: GameMessage<StateMsg>) {
        if(clientRepository.master!!.playerId == null) {
            clientRepository.master!!.playerId = msg.msg.state.players.players.find { it.role == NodeRole.MASTER }?.id
        }
    }

    private fun fillPlayerId(msg: GameMessage<StateMsg>) {
        if (generalRepository.playerId == null) {
            val playerName: String = generalRepository.playerName
                ?: throw NullPointerException("Player name is missing in GeneralRepository")
            val player: GamePlayer = msg.msg.state.findPlayerByName(playerName)
                ?: throw NullPointerException("Player name is missing in GameState")
            generalRepository.playerId = player.id
        }
    }

    private fun replyWithAckMessage(msgSeq: Long, receiverId: Int?, ipAddress: String, port: Int) {
        val response = messageFormer.ackMsg(receiverId, msgSeq)
        sendAckMessageEventPublisher.publishAsyncEvent(SendAckMsgEvent(response, ipAddress, port))
    }
}