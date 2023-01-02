package me.nikol.snake.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lme/nikol/snake/event/ReceiveErrorMsgEvent;", "Lme/nikol/snake/event/ReceiveEvent;", "Lme/nikol/snake/game/model/ErrorMsg;", "msg", "Lme/nikol/snake/game/model/GameMessage;", "receiverIp", "", "receiverPort", "", "(Lme/nikol/snake/game/model/GameMessage;Ljava/lang/String;I)V", "getMsg", "()Lme/nikol/snake/game/model/GameMessage;", "getReceiverIp", "()Ljava/lang/String;", "getReceiverPort", "()I", "core"})
public final class ReceiveErrorMsgEvent implements me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg> {
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.ErrorMsg> msg = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String receiverIp = null;
    private final int receiverPort = 0;
    
    public ReceiveErrorMsgEvent(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.ErrorMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String receiverIp, int receiverPort) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.ErrorMsg> getMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getReceiverIp() {
        return null;
    }
    
    @java.lang.Override
    public int getReceiverPort() {
        return 0;
    }
}