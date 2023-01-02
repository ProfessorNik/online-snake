package ru.fithub.snakes.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lru/fithub/snakes/net/sender/AnnouncementSender;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/SendAnnouncementMsgEvent;", "byteSender", "Lru/fithub/snakes/net/sender/ByteSender;", "(Lru/fithub/snakes/net/sender/ByteSender;)V", "mapper", "Lru/fithub/snakes/net/sender/Mapper;", "handle", "", "event", "Companion", "snakes"})
public final class AnnouncementSender implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.SendAnnouncementMsgEvent> {
    private final ru.fithub.snakes.net.sender.ByteSender byteSender = null;
    @org.jetbrains.annotations.NotNull
    public static final ru.fithub.snakes.net.sender.AnnouncementSender.Companion Companion = null;
    private static final ru.fithub.snakes.core.config.GameProperties properties = null;
    private static final java.lang.String MULTICAST_IP = null;
    private static final int MULTICAST_PORT = 0;
    private final ru.fithub.snakes.net.sender.Mapper mapper = null;
    
    public AnnouncementSender(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.net.sender.ByteSender byteSender) {
        super();
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.SendAnnouncementMsgEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/fithub/snakes/net/sender/AnnouncementSender$Companion;", "", "()V", "MULTICAST_IP", "", "MULTICAST_PORT", "", "properties", "Lru/fithub/snakes/core/config/GameProperties;", "snakes"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}