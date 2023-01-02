package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.service.gamemessage.MessageHandler
import ru.fithub.snakes.core.service.other.ApplicationStateService

class JoinMessageHandler(
    private val applicationStateService: ApplicationStateService,
    private val generalRepository: GeneralRepository,
    private val serverRepository: ServerRepository
) : MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        if (clazz == JoinMsg::class.java) {
            @Suppress("UNCHECKED_CAST")
            handleJoinMessage(msg as GameMessage<JoinMsg>, ipAddress, port)
        }
    }

    private fun handleJoinMessage(msg: GameMessage<JoinMsg>, hostAddress: String, port: Int) {
        if (applicationStateService.applicationStateType == ApplicationStateType.GAME
            && applicationStateService.nodeRole == NodeRole.MASTER
        ) {
            val joinMessages = serverRepository.joinPlayerDelayedMessages
            val gameState = generalRepository.gameState

            if (gameState != null) {
                if (!joinMessages.contains(DelayedMessage(msg, hostAddress, port))
                    && !gameState.players.players.map { it.name }.contains(msg.msg.playerName)
                ) {
                    joinMessages.add(DelayedMessage(msg, hostAddress, port))
                    println("added")
                }
            } else {
                println("[JoinMessageHandler] gameState is null")
            }
        }
    }
}