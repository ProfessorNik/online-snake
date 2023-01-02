package me.nikol.snake.event.config

import me.nikol.snake.event.*
import me.nikol.snake.event.basic.EventPublisher
import me.nikol.snake.game.model.*

class EventConfig {
    val sendAnnouncementMsgEventPublisher = EventPublisher<SendAnnouncementMsgEvent>()
    val sendAckMsgEventPublisher = EventPublisher<SendEvent<AckMsg>>()
    val sendSteerMsgEventPublisher = EventPublisher<SendEvent<SteerMsg>>()
    val sendJoinMsgEventPublisher = EventPublisher<SendEvent<JoinMsg>>()
    val receiveAckMsgEventPublisher = EventPublisher<ReceiveEvent<AckMsg>>()
    val receiveErrorMsgEventPublisher = EventPublisher<ReceiveEvent<ErrorMsg>>()
    val sendDiscoverMsgEventPublisher = EventPublisher<SendEvent<DiscoverMsg>>()
    val stopSendMessagesToPlayerEventPublisher = EventPublisher<StopSendMessagesToPlayerEvent>()
    val sendErrorMsgEventPublisher = EventPublisher<SendEvent<ErrorMsg>>()
    val sendPingMsgEventPublisher = EventPublisher<SendEvent<PingMsg>>()
    val sendRoleChangeMsgEventPublisher = EventPublisher<SendEvent<RoleChangeMsg>>()
    val sendStateMsgEventPublisher = EventPublisher<SendEvent<StateMsg>>()
}