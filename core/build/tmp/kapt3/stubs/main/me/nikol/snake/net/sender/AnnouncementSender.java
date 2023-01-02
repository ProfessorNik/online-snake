package me.nikol.snake.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lme/nikol/snake/net/sender/AnnouncementSender;", "Lme/nikol/snake/event/basic/EventListener;", "Lme/nikol/snake/event/SendAnnouncementMsgEvent;", "byteSender", "Lme/nikol/snake/net/sender/ByteSender;", "(Lme/nikol/snake/net/sender/ByteSender;)V", "logger", "Lcom/badlogic/gdx/utils/Logger;", "mapper", "Lme/nikol/snake/net/sender/Mapper;", "handle", "", "event", "Companion", "core"})
public final class AnnouncementSender implements me.nikol.snake.event.basic.EventListener<me.nikol.snake.event.SendAnnouncementMsgEvent> {
    private final me.nikol.snake.net.sender.ByteSender byteSender = null;
    private final com.badlogic.gdx.utils.Logger logger = null;
    @org.jetbrains.annotations.NotNull
    public static final me.nikol.snake.net.sender.AnnouncementSender.Companion Companion = null;
    private static final me.nikol.snake.game.config.GameProperties properties = null;
    private static final java.lang.String MULTICAST_IP = null;
    private static final int MULTICAST_PORT = 0;
    private final me.nikol.snake.net.sender.Mapper mapper = null;
    
    public AnnouncementSender(@org.jetbrains.annotations.NotNull
    me.nikol.snake.net.sender.ByteSender byteSender) {
        super();
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.SendAnnouncementMsgEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lme/nikol/snake/net/sender/AnnouncementSender$Companion;", "", "()V", "MULTICAST_IP", "", "MULTICAST_PORT", "", "properties", "Lme/nikol/snake/game/config/GameProperties;", "core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}