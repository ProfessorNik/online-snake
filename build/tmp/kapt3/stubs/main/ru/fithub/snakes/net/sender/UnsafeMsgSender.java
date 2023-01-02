package ru.fithub.snakes.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lru/fithub/snakes/net/sender/UnsafeMsgSender;", "M", "", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/SendEvent;", "byteSender", "Lru/fithub/snakes/net/sender/ByteSender;", "(Lru/fithub/snakes/net/sender/ByteSender;)V", "mapper", "Lru/fithub/snakes/net/sender/Mapper;", "handle", "", "event", "snakes"})
public final class UnsafeMsgSender<M extends java.lang.Object> implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.SendEvent<M>> {
    private final ru.fithub.snakes.net.sender.ByteSender byteSender = null;
    private final ru.fithub.snakes.net.sender.Mapper mapper = null;
    
    public UnsafeMsgSender(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.net.sender.ByteSender byteSender) {
        super();
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.SendEvent<M> event) {
    }
}