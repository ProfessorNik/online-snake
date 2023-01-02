package ru.fithub.snakes.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\\\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012J\u001e\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lru/fithub/snakes/net/sender/ByteSender;", "", "datagramSocket", "Ljava/net/DatagramSocket;", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "(Ljava/net/DatagramSocket;Lru/fithub/snakes/core/repostiory/GeneralRepository;)V", "safeSend", "", "hostname", "", "port", "", "bytes", "", "msgSeq", "", "ackMsgPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "errorMsgPublisher", "Lru/fithub/snakes/core/model/ErrorMsg;", "stopSendMessagesToPlayerEventPublisher", "Lru/fithub/snakes/event/StopSendMessagesToPlayerEvent;", "send", "snakes"})
public final class ByteSender {
    private final java.net.DatagramSocket datagramSocket = null;
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    
    public ByteSender(@org.jetbrains.annotations.NotNull
    java.net.DatagramSocket datagramSocket, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository) {
        super();
    }
    
    public final void send(@org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port, @org.jetbrains.annotations.NotNull
    byte[] bytes) {
    }
    
    public final void safeSend(@org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port, @org.jetbrains.annotations.NotNull
    byte[] bytes, long msgSeq, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> ackMsgPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorMsgPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> stopSendMessagesToPlayerEventPublisher) {
    }
}