package ru.fithub.snakes.core.scheduler

import ru.fithub.snakes.core.model.ApplicationStateType
import ru.fithub.snakes.core.model.Connection
import ru.fithub.snakes.core.model.NodeRole
import ru.fithub.snakes.core.model.PingMsg
import ru.fithub.snakes.core.repostiory.ClientRepository
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.SendPingMsgEvent
import ru.fithub.snakes.event.StopSendMessagesToPlayerEvent
import ru.fithub.snakes.event.basic.EventPublisher
import ru.fithub.snakes.utils.DaemonSingleThreadScheduledExecutor
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

class ClientScheduler(
    private val generalRepository: GeneralRepository,
    private val clientRepository: ClientRepository,
    private val pingMsgEventPublisher: EventPublisher<SendEvent<PingMsg>>,
    private val stopSendMessagesToPlayerEventPublisher: EventPublisher<StopSendMessagesToPlayerEvent>,
    private val applicationStateService: ApplicationStateService,
    private val messageFormer: MessageFormer
) {
    private var scheduler: ScheduledExecutorService = DaemonSingleThreadScheduledExecutor()

    private val pingDisconnectedTime
        get() = generalRepository.gameConfig!!.stateDelayMs / 10

    private val timeToPing
        get() = generalRepository.gameConfig!!.stateDelayMs * 0.8

    private fun pingMaster() {
        clientRepository.master!!.let { master ->
            if (System.currentTimeMillis() - master.lastMessageTime!! > timeToPing) {
                if (master.pingTime == null) {
                    pingMsgEventPublisher.publishAsyncEvent(
                        SendPingMsgEvent(
                            messageFormer.pingMsg(null),
                            master.ipAddress!!,
                            master.port!!
                        )
                    )
                    master.pingTime = System.currentTimeMillis()
                }
            }
        }

        clientRepository.master!!.let { master ->
            master.pingTime?.let { pingTime ->
                if (System.currentTimeMillis() - pingTime > pingDisconnectedTime) {
                    stopSendMessagesToPlayerEventPublisher.publishAsyncEvent(StopSendMessagesToPlayerEvent(master.ipAddress!!, master.port!!))
                    masterLeft()
                }
            }
            if (master.leftGame) {
                stopSendMessagesToPlayerEventPublisher.publishAsyncEvent(StopSendMessagesToPlayerEvent(master.ipAddress!!, master.port!!))
                masterLeft()
            }
        }
    }

    private fun masterLeft() {
        if (applicationStateService.nodeRole == NodeRole.DEPUTY) {
            applicationStateService.changeState(ApplicationStateType.GAME, NodeRole.MASTER)
        } else if (generalRepository.gameState!!.containsDeputy()) {
            val deputy = generalRepository.gameState!!.players.players.find { it.role == NodeRole.DEPUTY}
            clientRepository.master = Connection().apply {
                playerId = deputy!!.id
                ipAddress = deputy.ipAddress!!
                port = deputy.port!!
                lastMessageTime = System.currentTimeMillis()
            }
        } else {
            applicationStateService.changeState(ApplicationStateType.MAIN_MENU, null)
        }

    }

    fun start() {
        scheduler = DaemonSingleThreadScheduledExecutor()
        scheduler.scheduleWithFixedDelay(
            {
                pingMaster()
            },
            1000L,
            generalRepository.gameConfig!!.stateDelayMs.toLong(),
            TimeUnit.MILLISECONDS
        )
    }

    fun stop() {
        scheduler.shutdownNow()
    }

    fun isStopped(): Boolean {
        return scheduler.isShutdown
    }
}