package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.core.service.gamemessage.MessageHandler
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.event.SendAckMsgEvent
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.basic.EventPublisher

class SteerMessageHandler(
    private val applicationStateService: ApplicationStateService,
    private val generalRepository: GeneralRepository,
    private val serverRepository: ServerRepository,
    private val ackMessagePublisher: EventPublisher<SendEvent<AckMsg>>,
    private val messageFormer: MessageFormer
) : MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        if (clazz == SteerMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleSteerMsg(msg as GameMessage<SteerMsg>, ipAddress, port)
        }
    }

    private fun handleSteerMsg(msg: GameMessage<SteerMsg>, ipAddress: String, port: Int) {
        if (applicationStateService.applicationStateType == ApplicationStateType.GAME
            && applicationStateService.nodeRole == NodeRole.MASTER
        ) {
            serverRepository.getConnectionByIpAndPort(ipAddress, port)?.let { player ->
                player.playerId?.let { playerId ->
                    generalRepository.gameState?.findSnakeByGamePlayerId(playerId)?.let { snake ->
                        if(snake.isLegalNewDirection(msg.msg.direction)) {
                            player.newDirection = msg.msg.direction
                        }
                        ackMessagePublisher.publishAsyncEvent(SendAckMsgEvent(messageFormer.ackMsg(null, msg.msgSeq), ipAddress, port))
                    }
                }
            }
        }
    }
}