//package ru.fithub.snakes.core.service.behavior.impl
//
//import ru.fithub.snakes.core.config.GameProperties
//import ru.fithub.snakes.core.infrastructure.GamePlayPresenter
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
//class NormalBehavior(
//    private val sendSteerMsgEventPublisher: EventPublisher<SendEvent<SteerMsg>>,
//    private val sendPingMsgEventPublisher: EventPublisher<SendEvent<PingMsg>>,
//    private val sendAckMsgEventPublisher: EventPublisher<SendEvent<AckMsg>>,
//    private val stopSendMessagesToPlayerEventPublisher: EventPublisher<StopSendMessagesToPlayerEvent>,
//    private val applicationStateService: ApplicationStateService
//) : Behavior {
//
//    private val pingPlayersScheduler: ScheduledExecutorService = DaemonSingleThreadScheduledExecutor()
//
//
//    companion object {
//        val properties = GameProperties.INSTANCE
//        const val UNFILLING = -1
//        val PLAYER_NAME = properties.getProperty("player.name")
//        val PING_SCHEDULE_MS = properties.getProperty("ping.schedule-ms").toLong()
//        val PING_EXPIRATION_TIME = properties.getProperty("ping.expiration-time").toLong()
//        val PING_DISCONNECTED_TIME = properties.getProperty("ping.disconnected-time").toLong()
//    }
//    var role: NodeRole = NodeRole.NORMAL
//    override lateinit var gamePlayPresenter: GamePlayPresenter
//    override var playerId: Int = UNFILLING
//    private var masterIp: String = ""
//    private var lastTimeMasterMessage: Long = UNFILLING.toLong()
//    var masterPort: Int = UNFILLING
//    var masterPingTime: Long = UNFILLING.toLong()
//    var lastNState = 1
//    private lateinit var gameState: GameState
//    override lateinit var gameConfig: GameConfig
//    override var messageFormer: MessageFormer = MessageFormer(playerId)
//
//    @Synchronized
//    override fun changeDirection(direction: Direction) {
//        if (role != NodeRole.VIEWER) {
//            val msg = messageFormer.steerMsg(null, direction)
//            sendSteerMsgEventPublisher.publishEvent(SendSteerMsgEvent(msg, masterIp, masterPort))
//        }
//    }
//
//    @Synchronized
//    override fun changeGameState(msg: GameMessage<StateMsg>, ipAddress: String, port: Int) {
//        masterIp = ipAddress
//        masterPort = port
//        gameState = msg.msg.state
//        sendAckMsgEventPublisher.publishEvent(SendAckMsgEvent(messageFormer.ackMsg(msg.msgSeq, null), ipAddress, port))
//        if (lastNState > msg.msg.state.stateOrder) {
//            return
//        }
//        lastNState = msg.msg.state.stateOrder
//        if (playerId == UNFILLING) {
//            playerId = msg.msg.state.players.players.find { it.name == PLAYER_NAME }?.id ?: UNFILLING
//            messageFormer.senderId = playerId
//        }
//
//        gamePlayPresenter.updateField(gameState)
//    }
//    @Synchronized
//    override fun addNewPlayer(msg: GameMessage<JoinMsg>, ipAddress: String, port: Int) {
//
//    }
//
//    @Synchronized
//    override fun onPing(msg: GameMessage<PingMsg>, ipAddress: String, port: Int) {
//        if (ipAddress == masterIp && port == masterPort) {
//            val response = messageFormer.ackMsg(msg.msgSeq, null)
//            sendAckMsgEventPublisher.publishEvent(SendAckMsgEvent(response, ipAddress, port))
//        }
//    }
//
//    @Synchronized
//    override fun startGame() {
//        pingPlayersScheduler.scheduleWithFixedDelay(
//            {
//                pingMaster()
//            },
//            PING_SCHEDULE_MS,
//            PING_SCHEDULE_MS,
//            TimeUnit.MILLISECONDS
//        )
//    }
//
//    @Synchronized
//    private fun pingMaster() {
//        if ((lastTimeMasterMessage != UNFILLING.toLong()) && ((System.currentTimeMillis() - lastTimeMasterMessage) > PING_EXPIRATION_TIME)) {
//            if (masterIp != "" && masterPort != UNFILLING && masterPingTime == UNFILLING.toLong()) {
//                masterPingTime = System.currentTimeMillis()
//                sendPingMsgEventPublisher.publishEvent(
//                    SendPingMsgEvent(
//                        messageFormer.pingMsg(null),
//                        masterIp,
//                        masterPort
//                    )
//                )
//            }
//        }
//
//        if((masterPingTime != UNFILLING.toLong()) && (System.currentTimeMillis() - masterPingTime >= PING_DISCONNECTED_TIME)) {
//            if(this.role == NodeRole.DEPUTY) {
//                stopSendMessagesToPlayerEventPublisher.publishEvent(StopSendMessagesToPlayerEvent(masterIp, masterPort))
//                becomeAMaster()
//            } else {
//                findNewMaster()
//            }
//        }
//    }
//
//    private fun becomeAMaster() {
//        applicationStateService.changeState(null, NodeRole.MASTER)
//    }
//
//    private fun findNewMaster() {
//        gameState.players.players.find { it.role == NodeRole.DEPUTY }?.let {
//            masterIp = it.ipAddress ?: ""
//            masterPort = it.port ?: UNFILLING
//        }
//    }
//
//    @Synchronized
//    override fun endGame() {
//
//    }
//    @Synchronized
//    override fun changeDirectionByIpAndPort(msg: GameMessage<SteerMsg>, hostAddress: String, port: Int) {
//
//    }
//
//    @Synchronized
//    override fun updateLastTimeMessage(ipAddress: String, port: Int) {
//        if (ipAddress == masterIp && port == masterPort) {
//            masterPingTime = UNFILLING.toLong()
//            lastTimeMasterMessage = System.currentTimeMillis();
//        }
//    }
//
//    @Synchronized
//    override fun onRoleChange(gameMessage: GameMessage<RoleChangeMsg>, hostAddress: String, port: Int) {
//        println("ON ROLE CHANGE")
//        sendAckMsgEventPublisher.publishEvent(SendAckMsgEvent(messageFormer.ackMsg(gameMessage.msgSeq, null), hostAddress, port))
//        if(hostAddress == masterIp && port == masterPort) {
//            gameMessage.msg.receiverRole?.let {
//                if (it == NodeRole.MASTER){
//                    becomeAMaster()
//                    return
//                }
//                this.role = it
//            }
//            gameMessage.msg.senderRole?.let {
//                if (this.role == NodeRole.VIEWER || this.role == NodeRole.NORMAL){
//                    findNewMaster()
//                } else {
//                    becomeAMaster()
//                }
//            }
//        }else {
//            gameMessage.msg.senderRole?.let {
//                if (this.role == NodeRole.MASTER){
//                    masterIp = hostAddress
//                    masterPort = port
//                }
//            }
//        }
//    }
//}