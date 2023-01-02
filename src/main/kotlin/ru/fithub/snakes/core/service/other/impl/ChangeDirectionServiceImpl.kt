package ru.fithub.snakes.core.service.other.impl

import ru.fithub.snakes.core.model.ApplicationStateType
import ru.fithub.snakes.core.model.Direction
import ru.fithub.snakes.core.model.NodeRole
import ru.fithub.snakes.core.model.SteerMsg
import ru.fithub.snakes.core.repostiory.ClientRepository
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.core.service.other.ChangeDirectionService
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.SendSteerMsgEvent
import ru.fithub.snakes.event.basic.EventPublisher

class ChangeDirectionServiceImpl(
    val applicationStateService: ApplicationStateService,
    val clientRepository: ClientRepository,
    val sendSteerMessageEventPublisher: EventPublisher<SendEvent<SteerMsg>>,
    val messageFormer: MessageFormer,
    val repository: GeneralRepository
) : ChangeDirectionService {
    override fun changeDirection(direction: Direction) {
        if (applicationStateService.applicationStateType == ApplicationStateType.GAME) {
            when (applicationStateService.nodeRole) {
                NodeRole.MASTER -> {
                    repository.playerId!!.let { playerId ->
                        repository.gameState?.findSnakeByGamePlayerId(playerId)?.let { snake ->
                            if (snake.isLegalNewDirection(direction)) {
                                repository.newDirection = direction
                            }
                        }
                    }
                }
                NodeRole.NORMAL, NodeRole.DEPUTY -> sendSteerMessageEventPublisher.publishAsyncEvent(
                    SendSteerMsgEvent(
                        messageFormer.steerMsg(null, direction),
                        clientRepository.master!!.ipAddress!!,
                        clientRepository.master!!.port!!
                    ))
                    else-> {}
            }
        }
    }
}