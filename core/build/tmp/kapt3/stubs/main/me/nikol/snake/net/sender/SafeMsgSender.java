package me.nikol.snake.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lme/nikol/snake/net/sender/SafeMsgSender;", "M", "", "Lme/nikol/snake/event/basic/EventListener;", "Lme/nikol/snake/event/SendEvent;", "byteSender", "Lme/nikol/snake/net/sender/ByteSender;", "ackMsgPublisher", "Lme/nikol/snake/event/basic/EventPublisher;", "Lme/nikol/snake/event/ReceiveEvent;", "Lme/nikol/snake/game/model/AckMsg;", "errorMsgPublisher", "Lme/nikol/snake/game/model/ErrorMsg;", "(Lme/nikol/snake/net/sender/ByteSender;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;)V", "logger", "Lcom/badlogic/gdx/utils/Logger;", "mapper", "Lme/nikol/snake/net/sender/Mapper;", "handle", "", "event", "core"})
public final class SafeMsgSender<M extends java.lang.Object> implements me.nikol.snake.event.basic.EventListener<me.nikol.snake.event.SendEvent<M>> {
    private final me.nikol.snake.net.sender.ByteSender byteSender = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.AckMsg>> ackMsgPublisher = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg>> errorMsgPublisher = null;
    private final com.badlogic.gdx.utils.Logger logger = null;
    private final me.nikol.snake.net.sender.Mapper mapper = null;
    
    public SafeMsgSender(@org.jetbrains.annotations.NotNull
    me.nikol.snake.net.sender.ByteSender byteSender, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.AckMsg>> ackMsgPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg>> errorMsgPublisher) {
        super();
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.SendEvent<M> event) {
    }
}