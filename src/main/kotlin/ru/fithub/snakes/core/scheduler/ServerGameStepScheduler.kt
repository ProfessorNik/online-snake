package ru.fithub.snakes.core.scheduler

import com.almasb.fxgl.dsl.play
import ru.fithub.snakes.core.infrastructure.GamePlayPresenter
import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.core.service.other.MakeDeputyService
import ru.fithub.snakes.event.*
import ru.fithub.snakes.event.basic.EventPublisher
import ru.fithub.snakes.utils.DaemonSingleThreadScheduledExecutor
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

class ServerGameStepScheduler(
    private val applicationStateService: ApplicationStateService,
    private val generalRepository: GeneralRepository,
    private val serverRepository: ServerRepository,
    private val gamePlayPresenter: GamePlayPresenter,
    private val messageFormer: MessageFormer,
    private val makeDeputyService: MakeDeputyService,
    private val stateMsgEventPublisher: EventPublisher<SendEvent<StateMsg>>,
    private val errorMsgPublisher: EventPublisher<SendEvent<ErrorMsg>>,
    private val ackMsgEventPublisher: EventPublisher<SendEvent<AckMsg>>,
    private val pingMsgEventPublisher: EventPublisher<SendEvent<PingMsg>>,
    private val stopSendMessagesToPlayerEventPublisher: EventPublisher<StopSendMessagesToPlayerEvent>
) {
    private var scheduler: ScheduledExecutorService = DaemonSingleThreadScheduledExecutor()

    private val disconnectedTime
        get() = generalRepository.gameConfig!!.stateDelayMs / 10

    private val timeToPing
        get() = generalRepository.gameConfig!!.stateDelayMs * 0.8

    private fun updateGameState() {
        try {
            val newDirections = newDirections()
            generalRepository.gameState =
                generalRepository.gameState!!.changeDirections(newDirections).makeMove(generalRepository.gameConfig!!)
            removeDisconnectedPlayers()
            setViewers()
            pingPlayers()
            joinPlayers()
            generalRepository.gameState = generalRepository.gameState!!.apply()
            makeDeputyService.addDeputy()
            gamePlayPresenter.updateField(generalRepository.gameState!!)
            checkOnNewNormalConnection()
            publishNewGameState()
            maybeBecomeClient()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun setViewers() {
        serverRepository.connections.filter { it.becomeViewer }.forEach { connection ->
            generalRepository.gameState = generalRepository.gameState!!.copy(
                players = GamePlayers(generalRepository.gameState!!.players.players.fold(listOf()) { players, player ->
                    if(player.id == connection.playerId) {
                        players + player.copy(role = NodeRole.VIEWER)
                    } else {
                        players + player
                    }
                })
            )
        }
    }

    private fun maybeBecomeClient() {
        if (generalRepository.gameState!!.findPlayerById(generalRepository.playerId!!)!!.role == NodeRole.VIEWER) {
            if (generalRepository.gameState!!.containsDeputy()) {
                applicationStateService.changeState(ApplicationStateType.GAME, NodeRole.VIEWER)
            } else {
                applicationStateService.changeState(ApplicationStateType.MAIN_MENU, null)
            }
        }
    }

    private fun newDirections(): MutableMap<Int, Direction> {
        val newDirections =
            serverRepository.connections.fold(listOf<Pair<Int, Direction>>()) { acc, connection ->
                val direction = connection.newDirection
                connection.newDirection = null
                if (direction != null) {
                    acc + listOf(connection.playerId!! to direction)
                } else {
                    acc
                }
            }.toMap().toMutableMap()

        generalRepository.newDirection?.let {
            newDirections[generalRepository.playerId!!] = it
        }
        return newDirections
    }

    private fun publishNewGameState() {
        generalRepository.gameState!!.players.players.forEach let@{
            if (it.id == generalRepository.playerId) {
                return@let
            }
            if (it.ipAddress != null && it.port != null)
                stateMsgEventPublisher.publishAsyncEvent(
                    SendStateMsgEvent(
                        messageFormer.stateMsg(it.id, generalRepository.gameState!!),
                        it.ipAddress,
                        it.port
                    )
                )
        }
    }


    private fun checkOnNewNormalConnection() {
        serverRepository.canJoin = generalRepository.gameState!!.isValidNewSnake(generalRepository.gameConfig!!)
    }

    private fun joinPlayers() {
        serverRepository.joinPlayerDelayedMessages.forEach lit@{
            val newPlayer = GamePlayer(
                it.msg.msg.playerName,
                generalRepository.gameState!!.generateNewId(),
                it.senderIp,
                it.senderPort,
                it.msg.msg.requestedRole,
                it.msg.msg.playerType,
                0
            )
            if (!generalRepository.gameState!!.isValidNewPlayer(newPlayer)) {
                errorMsgPublisher.publishAsyncEvent(
                    SendErrorMsgEvent(
                        messageFormer.errorMsg(null, it.msg.msgSeq, "You can't added, check your name"),
                        it.senderIp,
                        it.senderPort
                    )
                )
                return@lit
            }

            when (it.msg.msg.requestedRole) {
                NodeRole.NORMAL -> {
                    if (generalRepository.gameState!!.isValidNewSnake(generalRepository.gameConfig!!)) {
                        generalRepository.gameState = generalRepository.gameState!!.addNewPlayer(newPlayer)
                        generalRepository.gameState =
                            generalRepository.gameState!!.addNewSnake(newPlayer, generalRepository.gameConfig!!)
                        serverRepository.connections.add(Connection().apply {
                            playerId = newPlayer.id
                            ipAddress = newPlayer.ipAddress
                            port = newPlayer.port
                            lastMessageTime = System.currentTimeMillis()
                        })
                        ackMsgEventPublisher.publishAsyncEvent(
                            SendAckMsgEvent(
                                messageFormer.ackMsg(
                                    newPlayer.id,
                                    it.msg.msgSeq
                                ),
                                it.senderIp,
                                it.senderPort
                            )
                        )
                    } else {
                        errorMsgPublisher.publishAsyncEvent(
                            SendErrorMsgEvent(
                                messageFormer.errorMsg(
                                    null,
                                    it.msg.msgSeq,
                                    "You can't added, your snake can't placed"
                                ),
                                it.senderIp,
                                it.senderPort
                            )
                        )
                        return@lit
                    }
                }
                NodeRole.VIEWER -> {
                    generalRepository.gameState!!.addNewPlayer(newPlayer)
                    ackMsgEventPublisher.publishAsyncEvent(
                        SendAckMsgEvent(
                            messageFormer.ackMsg(newPlayer.id, it.msg.msgSeq),
                            it.senderIp,
                            it.senderPort
                        )
                    )
                }
                else -> {
                    errorMsgPublisher.publishAsyncEvent(
                        SendErrorMsgEvent(
                            messageFormer.errorMsg(
                                null,
                                it.msg.msgSeq,
                                "You can be Viewer or Normal player"
                            ),
                            it.senderIp,
                            it.senderPort
                        )
                    )
                }
            }
        }
        serverRepository.joinPlayerDelayedMessages.clear()
    }

    fun start() {
        scheduler = DaemonSingleThreadScheduledExecutor()
        scheduler.scheduleWithFixedDelay(
            {
                updateGameState()
            },
            generalRepository.gameConfig!!.stateDelayMs.toLong(),
            generalRepository.gameConfig!!.stateDelayMs.toLong(),
            TimeUnit.MILLISECONDS
        )
    }

    fun isStopped(): Boolean {
        return scheduler.isTerminated
    }

    fun stop() {
        scheduler.shutdownNow()
    }

    private fun removePlayer(playerId: Int): GameState {
        serverRepository.connections.removeIf { it.playerId == playerId }
        return generalRepository.gameState!!.removePlayer(playerId)
    }

    private fun removeDisconnectedPlayers() {
        val removed: MutableList<Int> = mutableListOf()

        serverRepository.connections.forEach { connection ->
            connection.pingTime?.let { pingTime ->
                if (System.currentTimeMillis() - pingTime > disconnectedTime) {
                    stopSendMessagesToPlayerEventPublisher.publishAsyncEvent(StopSendMessagesToPlayerEvent(connection.ipAddress!!, connection.port!!))
                    removed.add(connection.playerId!!)
                }
            }
            if (connection.leftGame) {
                stopSendMessagesToPlayerEventPublisher.publishAsyncEvent(StopSendMessagesToPlayerEvent(connection.ipAddress!!, connection.port!!))
                removed.add(connection.playerId!!)
            }
        }

        removed.forEach { generalRepository.gameState = removePlayer(it) }
    }

    private fun pingPlayers() {
        serverRepository.connections.forEach { connection ->
            if (System.currentTimeMillis() - connection.lastMessageTime!! > timeToPing) {
                if (connection.pingTime == null) {
                    pingMsgEventPublisher.publishAsyncEvent(
                        SendPingMsgEvent(
                            messageFormer.pingMsg(null),
                            connection.ipAddress!!,
                            connection.port!!
                        )
                    )
                    connection.pingTime = System.currentTimeMillis()
                }
            }
        }
    }
}
