//package ru.fithub.snakes.core.service.behavior.impl
//
//import ru.fithub.snakes.core.config.GameFactory
//import ru.fithub.snakes.core.exceptions.IllegalDirectionException
//import ru.fithub.snakes.core.exceptions.PlayerNotFoundException
//import ru.fithub.snakes.core.exceptions.SnakeNotFoundException
//import ru.fithub.snakes.core.infrastructure.*
//import ru.fithub.snakes.core.model.*
//import ru.fithub.snakes.core.service.MessageFormer
//import ru.fithub.snakes.core.service.behavior.Behavior
//import ru.fithub.snakes.core.service.other.ApplicationStateService
//import ru.fithub.snakes.event.*
//import ru.fithub.snakes.event.basic.EventPublisher
//import ru.fithub.snakes.utils.DaemonSingleThreadScheduledExecutor
//import java.util.concurrent.ScheduledExecutorService
//import java.util.concurrent.TimeUnit
//
//class MasterBehavior(
//    private val announcementPublisher: EventPublisher<SendAnnouncementMsgEvent>,
//    private val errorMsgPublisher: EventPublisher<SendEvent<ErrorMsg>>,
//    private val ackMsgEventPublisher: EventPublisher<SendEvent<AckMsg>>,
//    private val roleChangeMsgEventPublisher: EventPublisher<SendEvent<RoleChangeMsg>>,
//    private val stateMsgEventPublisher: EventPublisher<SendEvent<StateMsg>>,
//    private val pingMsgEventPublisher: EventPublisher<SendEvent<PingMsg>>,
//    private val applicationStateService: ApplicationStateService
//) : Behavior {
//    private val newDirections: MutableMap<Int, Direction> = mutableMapOf()
//    private val lastNMessage: MutableMap<Int, Long> = mutableMapOf()
//    private val lastTimeMessage: MutableMap<Int, Long> = mutableMapOf()
//    private val onRemovePlayers: MutableMap<Int, Long> = mutableMapOf()
//    private val gameFactory: GameFactory = GameFactory()
//    private val gameStepScheduler: ScheduledExecutorService = DaemonSingleThreadScheduledExecutor()
//    private val gameAnnouncementScheduler: ScheduledExecutorService = DaemonSingleThreadScheduledExecutor()
//    private val pingPlayersScheduler: ScheduledExecutorService = DaemonSingleThreadScheduledExecutor()
//    override var messageFormer = MessageFormer()
//
//    override lateinit var gamePlayPresenter: GamePlayPresenter
//
//    override fun startGame() {
//        gamePlayPresenter.updateField(gameState)
//        gameStepScheduler.scheduleWithFixedDelay(
//            {
//                updateGameState()
//            },
//            gameConfig.stateDelayMs.toLong(),
//            gameConfig.stateDelayMs.toLong(),
//            TimeUnit.MILLISECONDS
//        )
//        gameAnnouncementScheduler.scheduleWithFixedDelay(
//            {
//                notifyAllAboutGame()
//            },
//            1000L,
//            gameFactory.properties().getProperty("announcement.schedule-ms").toLong(),
//            TimeUnit.MILLISECONDS
//        )
//        pingPlayersScheduler.scheduleWithFixedDelay(
//            {
//                pingPlayers()
//            },
//            gameFactory.properties().getProperty("ping.schedule-ms").toLong(),
//            gameFactory.properties().getProperty("ping.schedule-ms").toLong(),
//            TimeUnit.MILLISECONDS
//        )
//    }
//
//    @Synchronized
//    private fun pingPlayers() {
//        lastTimeMessage.forEach { entry ->
//            if (System.currentTimeMillis() - entry.value
//                > gameFactory.properties().getProperty("ping.expiration-time").toLong()
//            ) {
//                gameState.players.players.find { it.id == entry.key }?.let { player ->
//                    if (player.ipAddress != null && player.port != null) {
//                        if (!onRemovePlayers.contains(playerId)) {
//                            pingMsgEventPublisher.publishEvent(
//                                SendPingMsgEvent(
//                                    messageFormer.pingMsg(null),
//                                    player.ipAddress,
//                                    player.port
//                                )
//                            )
//                            onRemovePlayers[playerId] = System.currentTimeMillis()
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    @Synchronized
//    override fun updateLastTimeMessage(ipAddress: String, port: Int) {
//        findPlayerIdByIpAndPort(ipAddress, port)?.let { playerId ->
//            lastTimeMessage[playerId] = System.currentTimeMillis()
//        }
//        removeFromBlackList(ipAddress, port)
//    }
//    @Synchronized
//    override fun onRoleChange(gameMessage: GameMessage<RoleChangeMsg>, hostAddress: String, port: Int) {
//
//    }
//
//    @Synchronized
//    fun onAck(msg: GameMessage<AckMsg>, ipAddress: String, port: Int) {
//        removeFromBlackList(ipAddress, port)
//    }
//
//    private fun removeFromBlackList(ipAddress: String, port: Int) {
//        findPlayerIdByIpAndPort(ipAddress, port)?.let { playerId ->
//            with(onRemovePlayers.iterator()) {
//                forEach {
//                    if (it.key == playerId) {
//                        remove()
//                    }
//                }
//            }
//        }
//    }
//
//    @Synchronized
//    private fun notifyAllAboutGame() {
//        synchronized(this) {
//            val announcement = gameFactory.gameAnnouncement(gameConfig, gameState)
//            announcementPublisher.publishEvent(
//                SendAnnouncementMsgEvent(
//                    messageFormer.announcementMsg(
//                        null,
//                        announcement
//                    )
//                )
//            )
//        }
//    }
//
//    private fun findPlayerIdByIpAndPort(ipAddress: String, port: Int): Int? {
//        return gameState.players.players.find { (it.ipAddress == ipAddress) && (it.port == port) }?.id
//    }
//
//    override fun changeGameState(msg: GameMessage<StateMsg>, ipAddress: String, port: Int) {
//
//    }
//
//    @Synchronized
//    override fun addNewPlayer(msg: GameMessage<JoinMsg>, ipAddress: String, port: Int) {
//        if (!joinPlayerDelayedMessages.contains(DelayedMessage(msg, ipAddress, port))
//            && !gameState.players.players.map { it.name }.contains(msg.msg.playerName)
//        ) {
//            joinPlayerDelayedMessages.add(DelayedMessage(msg, ipAddress, port))
//            println("added")
//        }
//    }
//
//    @Synchronized
//    override fun onPing(msg: GameMessage<PingMsg>, ipAddress: String, port: Int) {
//        findPlayerIdByIpAndPort(ipAddress, port)?.let { receiverId ->
//            val response = messageFormer.ackMsg(msg.msgSeq, receiverId)
//            ackMsgEventPublisher.publishEvent(SendAckMsgEvent(response, ipAddress, receiverId))
//        }
//    }
//
//    @Synchronized
//    override fun changeDirection(direction: Direction) {
//        synchronized(this) {
//            changeDirection(playerId, direction)
//        }
//    }
//
//    private fun changeDirection(player_id: Int, direction: Direction) {
//        synchronized(this) {
//            gameState.players
//                .players
//                .find { it.id == player_id }
//                ?: throw PlayerNotFoundException("Player with id = $player_id not found")
//
//            gameState.snakes
//                .find { it.playerId == player_id }
//                ?.apply { if (!isLegalDirection(direction)) throw IllegalDirectionException() }
//                ?: throw SnakeNotFoundException("Snake with player_id = $player_id not found")
//
//            newDirections[player_id] = direction
//        }
//    }
//
//    private fun removePlayer(playerId: Int): GameState {
//        newDirections.remove(playerId)
//        lastNMessage.remove(playerId)
//        lastTimeMessage.remove(playerId)
//        onRemovePlayers.remove(playerId)
//        return gameState.removePlayer(playerId)
//    }
//
//    private fun removeDisconnectedPlayers() {
//        val removed: MutableList<Int> = mutableListOf()
//
//        onRemovePlayers.forEach {
//            if (System.currentTimeMillis() - it.value > gameFactory.properties().getProperty("ping.disconnected-time")
//                    .toLong()
//            ) {
//                removed.add(it.key)
//            }
//        }
//
//        removed.forEach { gameState = removePlayer(it) }
//    }
//
//    @Synchronized
//    private fun updateGameState() {
//        gameState = gameState.changeDirections(newDirections).makeMove(gameConfig)
//
//        removeDisconnectedPlayers()
//
//        joinPlayerDelayedMessages.forEach lit@{
//            val newPlayer = GamePlayer(
//                it.msg.msg.playerName,
//                gameState.generateNewId(),
//                it.senderIp,
//                it.senderPort,
//                it.msg.msg.requestedRole,
//                it.msg.msg.playerType,
//                0
//            )
//            if (!gameState.isValidNewPlayer(newPlayer)) {
//                errorMsgPublisher.publishEvent(
//                    SendErrorMsgEvent(
//                        messageFormer.errorMsg(it.msg.msgSeq, null, "You can't added, check your name"),
//                        it.senderIp,
//                        it.senderPort
//                    )
//                )
//                return@lit
//            }
//
//            when (it.msg.msg.requestedRole) {
//                NodeRole.NORMAL -> {
//                    if (gameState.isValidNewSnake(gameConfig)) {
//                        gameState = gameState.addNewPlayer(newPlayer)
//                        gameState = gameState.addNewSnake(newPlayer, gameConfig)
//                        ackMsgEventPublisher.publishEvent(
//                            SendAckMsgEvent(
//                                messageFormer.ackMsg(
//                                    it.msg.msgSeq,
//                                    newPlayer.id
//                                ), it.senderIp, it.senderPort
//                            )
//                        )
//                    } else {
//                        errorMsgPublisher.publishEvent(
//                            SendErrorMsgEvent(
//                                messageFormer.errorMsg(
//                                    it.msg.msgSeq,
//                                    null,
//                                    "You can't added, your snake can't placed"
//                                ),
//                                it.senderIp,
//                                it.senderPort
//                            )
//                        )
//                        return@lit
//                    }
//                }
//                NodeRole.VIEWER -> {
//                    gameState.addNewPlayer(newPlayer)
//                    ackMsgEventPublisher.publishEvent(
//                        SendAckMsgEvent(
//                            messageFormer.ackMsg(it.msg.msgSeq, newPlayer.id),
//                            it.senderIp,
//                            it.senderPort
//                        )
//                    )
//                }
//                else -> {
//                    errorMsgPublisher.publishEvent(
//                        SendErrorMsgEvent(
//                            messageFormer.errorMsg(
//                                it.msg.msgSeq,
//                                null,
//                                "You can be Viewer or Normal player"
//                            ), it.senderIp, it.senderPort
//                        )
//                    )
//                }
//            }
//        }
//
//        gameState = gameState.apply()
//
//        if (!gameState.players.players.map { it.role }
//                .contains(NodeRole.DEPUTY) && gameState.players.players.size > 1) {
//            gameState.players.players.firstOrNull { it.role != NodeRole.VIEWER && it.role != NodeRole.MASTER }?.let {
//                if (it.ipAddress != null && it.port != null)
//                    roleChangeMsgEventPublisher.publishEvent(
//                        SendRoleChangeMsgEvent(
//                            messageFormer.roleChangeMsg(
//                                it.id,
//                                null,
//                                NodeRole.DEPUTY
//                            ),
//                            it.ipAddress,
//                            it.port
//                        )
//                    )
//            }
//        }
//
//
//
//        newDirections.clear()
//        joinPlayerDelayedMessages.clear()
//
//        gamePlayPresenter.updateField(gameState)
//        gameState.players.players.forEach let@{
//            if (it.id == playerId) {
//                return@let
//            }
//            if (it.ipAddress != null && it.port != null)
//                stateMsgEventPublisher.publishEvent(
//                    SendStateMsgEvent(
//                        messageFormer.stateMsg(it.id, gameState),
//                        it.ipAddress,
//                        it.port
//                    )
//                )
//        }
//    }
//
//    private fun exit() {
//        gameState.players.players.forEach let@{
//            if (it.id == playerId) {
//                return@let
//            }
//            if (it.ipAddress != null && it.port != null)
//                roleChangeMsgEventPublisher.publishEvent(
//                    SendRoleChangeMsgEvent(
//                        messageFormer.roleChangeMsg(
//                            it.id,
//                            NodeRole.VIEWER,
//                            if(it.role == NodeRole.DEPUTY) NodeRole.MASTER else null
//                        ),
//                        it.ipAddress,
//                        it.port
//                    )
//                )
//        }
//        applicationStateService.changeState(ApplicationStateType.GAME, NodeRole.VIEWER)
//    }
//
//    @Synchronized
//    override fun endGame() {
//        gameStepScheduler.shutdown()
//        gameAnnouncementScheduler.shutdown()
//    }
//
//    @Synchronized
//    override fun changeDirectionByIpAndPort(msg: GameMessage<SteerMsg>, hostAddress: String, port: Int) {
//        findPlayerIdByIpAndPort(hostAddress, port)?.let { senderId ->
//            val lastMessageSeq = lastNMessage.getOrDefault(senderId, -1)
//            if (lastMessageSeq >= msg.msgSeq) {
//                return
//            }
//            lastNMessage[senderId] = msg.msgSeq;
//            changeDirection(senderId, msg.msg.direction)
//        }
//    }
//}