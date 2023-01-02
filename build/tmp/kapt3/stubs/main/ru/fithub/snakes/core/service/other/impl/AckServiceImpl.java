package ru.fithub.snakes.core.service.other.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/AckServiceImpl;", "Lru/fithub/snakes/core/service/other/AckService;", "receiveAckMsgEventPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/ReceiveAckMsgEvent;", "(Lru/fithub/snakes/event/basic/EventPublisher;)V", "ack", "", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/core/model/AckMsg;", "senderIp", "", "receiverPort", "", "snakes"})
public final class AckServiceImpl implements ru.fithub.snakes.core.service.other.AckService {
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveAckMsgEvent> receiveAckMsgEventPublisher = null;
    
    public AckServiceImpl(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveAckMsgEvent> receiveAckMsgEventPublisher) {
        super();
    }
    
    @java.lang.Override
    public void ack(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AckMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String senderIp, int receiverPort) {
    }
}