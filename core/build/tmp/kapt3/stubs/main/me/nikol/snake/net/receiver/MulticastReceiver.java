package me.nikol.snake.net.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lme/nikol/snake/net/receiver/MulticastReceiver;", "", "controller", "Lme/nikol/snake/net/receiver/MulticastController;", "(Lme/nikol/snake/net/receiver/MulticastController;)V", "multicastSocket", "Ljava/net/MulticastSocket;", "networkInterface", "Ljava/net/NetworkInterface;", "socketAddress", "Ljava/net/InetSocketAddress;", "parseGameMessage", "Lme/nikol/snake/dto/SnakesProto$GameMessage;", "data", "", "receive", "", "Companion", "core"})
public final class MulticastReceiver {
    private final me.nikol.snake.net.receiver.MulticastController controller = null;
    @org.jetbrains.annotations.NotNull
    public static final me.nikol.snake.net.receiver.MulticastReceiver.Companion Companion = null;
    private static final me.nikol.snake.game.config.GameProperties properties = null;
    private static final java.lang.String MULTICAST_IP = null;
    private static final int BUFFER_SIZE = 0;
    private static final int MULTICAST_PORT = 0;
    private final java.net.MulticastSocket multicastSocket = null;
    private final java.net.NetworkInterface networkInterface = null;
    private final java.net.InetSocketAddress socketAddress = null;
    
    public MulticastReceiver(@org.jetbrains.annotations.NotNull
    me.nikol.snake.net.receiver.MulticastController controller) {
        super();
    }
    
    public final void receive() {
    }
    
    private final me.nikol.snake.dto.SnakesProto.GameMessage parseGameMessage(byte[] data) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lme/nikol/snake/net/receiver/MulticastReceiver$Companion;", "", "()V", "BUFFER_SIZE", "", "MULTICAST_IP", "", "MULTICAST_PORT", "properties", "Lme/nikol/snake/game/config/GameProperties;", "core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}