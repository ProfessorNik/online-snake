package me.nikol.snake.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lme/nikol/snake/net/sender/UnsafeMsgSender;", "M", "", "Lme/nikol/snake/event/basic/EventListener;", "Lme/nikol/snake/event/SendEvent;", "byteSender", "Lme/nikol/snake/net/sender/ByteSender;", "(Lme/nikol/snake/net/sender/ByteSender;)V", "logger", "Lcom/badlogic/gdx/utils/Logger;", "mapper", "Lme/nikol/snake/net/sender/Mapper;", "handle", "", "event", "core"})
public final class UnsafeMsgSender<M extends java.lang.Object> implements me.nikol.snake.event.basic.EventListener<me.nikol.snake.event.SendEvent<M>> {
    private final me.nikol.snake.net.sender.ByteSender byteSender = null;
    private final com.badlogic.gdx.utils.Logger logger = null;
    private final me.nikol.snake.net.sender.Mapper mapper = null;
    
    public UnsafeMsgSender(@org.jetbrains.annotations.NotNull
    me.nikol.snake.net.sender.ByteSender byteSender) {
        super();
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.SendEvent<M> event) {
    }
}