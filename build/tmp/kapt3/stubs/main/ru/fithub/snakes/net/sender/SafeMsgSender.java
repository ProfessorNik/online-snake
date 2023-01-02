package ru.fithub.snakes.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lru/fithub/snakes/net/sender/SafeMsgSender;", "M", "", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/SendEvent;", "byteSender", "Lru/fithub/snakes/net/sender/ByteSender;", "ackMsgPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "errorMsgPublisher", "Lru/fithub/snakes/core/model/ErrorMsg;", "stopEventPublisher", "Lru/fithub/snakes/event/StopSendMessagesToPlayerEvent;", "(Lru/fithub/snakes/net/sender/ByteSender;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;)V", "mapper", "Lru/fithub/snakes/net/sender/Mapper;", "handle", "", "event", "snakes"})
public final class SafeMsgSender<M extends java.lang.Object> implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.SendEvent<M>> {
    private final ru.fithub.snakes.net.sender.ByteSender byteSender = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> ackMsgPublisher = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorMsgPublisher = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> stopEventPublisher = null;
    private final ru.fithub.snakes.net.sender.Mapper mapper = null;
    
    public SafeMsgSender(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.net.sender.ByteSender byteSender, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> ackMsgPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorMsgPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> stopEventPublisher) {
        super();
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.SendEvent<M> event) {
    }
}