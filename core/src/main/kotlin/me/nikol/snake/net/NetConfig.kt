package me.nikol.snake.net

import me.nikol.snake.event.config.EventConfig
import me.nikol.snake.game.config.ServiceConfig
import me.nikol.snake.game.config.GameProperties
import me.nikol.snake.game.model.*
import me.nikol.snake.net.receiver.MulticastReceiver
import me.nikol.snake.net.receiver.Receiver
import me.nikol.snake.net.sender.AnnouncementSender
import me.nikol.snake.net.sender.SafeMsgSender
import me.nikol.snake.net.sender.ByteSender
import me.nikol.snake.net.sender.UnsafeMsgSender
import java.net.DatagramSocket
import kotlin.concurrent.thread

class NetConfig(private val eventConfig: EventConfig, serviceConfig: ServiceConfig) {
    companion object{
        private val properties: GameProperties = GameProperties.INSTANCE
        private val PORT = properties.getProperty("receiver.port").toInt()
    }

    private val datagramSocket: DatagramSocket = DatagramSocket(PORT)
    private val byteSender: ByteSender = ByteSender(datagramSocket)
    private val multicastReceiver: MulticastReceiver = MulticastReceiver(serviceConfig.gameMessageController)
    private val receiver: Receiver = Receiver(datagramSocket, serviceConfig.gameMessageController)

    val announcementSender: AnnouncementSender = AnnouncementSender(byteSender).apply {
        eventConfig.sendAnnouncementMsgEventPublisher.addListener(this)
    }
    val ackSender: UnsafeMsgSender<AckMsg> = UnsafeMsgSender<AckMsg>(byteSender).apply{
        eventConfig.sendAckMsgEventPublisher.addListener(this)
    }
    val errorSender: UnsafeMsgSender<ErrorMsg> = UnsafeMsgSender<ErrorMsg>(byteSender).apply{
        eventConfig.sendErrorMsgEventPublisher.addListener(this)
    }
    val pingSender: SafeMsgSender<PingMsg> = SafeMsgSender<PingMsg>(byteSender, eventConfig.receiveAckMsgEventPublisher, eventConfig.receiveErrorMsgEventPublisher).apply {
        eventConfig.sendPingMsgEventPublisher.addListener(this)
    }
    val joinMsgSender: SafeMsgSender<JoinMsg> = SafeMsgSender<JoinMsg>(byteSender, eventConfig.receiveAckMsgEventPublisher, eventConfig.receiveErrorMsgEventPublisher).apply {
        eventConfig.sendJoinMsgEventPublisher.addListener(this)
    }
    val steerMsgSender: SafeMsgSender<SteerMsg> = SafeMsgSender<SteerMsg>(byteSender, eventConfig.receiveAckMsgEventPublisher, eventConfig.receiveErrorMsgEventPublisher).apply {
        eventConfig.sendSteerMsgEventPublisher.addListener(this)
    }
    val roleChangeMsgSender: SafeMsgSender<RoleChangeMsg> = SafeMsgSender<RoleChangeMsg>(byteSender, eventConfig.receiveAckMsgEventPublisher, eventConfig.receiveErrorMsgEventPublisher).apply {
        eventConfig.sendRoleChangeMsgEventPublisher.addListener(this)
    }
    val stateMsgSender: SafeMsgSender<StateMsg> = SafeMsgSender<StateMsg>(byteSender, eventConfig.receiveAckMsgEventPublisher, eventConfig.receiveErrorMsgEventPublisher).apply {
        eventConfig.sendStateMsgEventPublisher.addListener(this)
    }
    init {
        thread(isDaemon = true) { while (true) multicastReceiver.receive() }
        thread(isDaemon = true) { while (true) receiver.receive() }
    }
}