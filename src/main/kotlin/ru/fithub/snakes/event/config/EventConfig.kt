package ru.fithub.snakes.event.config

import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.model.AckMsg
import ru.fithub.snakes.event.ReceiveEvent
import ru.fithub.snakes.event.SendAnnouncementMsgEvent
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.StopSendMessagesToPlayerEvent
import ru.fithub.snakes.event.basic.EventPublisher

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