package ru.fithub.snakes.net.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lru/fithub/snakes/net/receiver/Receiver;", "", "socket", "Ljava/net/DatagramSocket;", "controller", "Lru/fithub/snakes/net/receiver/MulticastController;", "(Ljava/net/DatagramSocket;Lru/fithub/snakes/net/receiver/MulticastController;)V", "parseGameMessage", "Lru/fithub/snakes/dto/SnakesProto$GameMessage;", "data", "", "receive", "", "Companion", "snakes"})
public final class Receiver {
    private final java.net.DatagramSocket socket = null;
    private final ru.fithub.snakes.net.receiver.MulticastController controller = null;
    @org.jetbrains.annotations.NotNull
    public static final ru.fithub.snakes.net.receiver.Receiver.Companion Companion = null;
    private static final ru.fithub.snakes.core.config.GameProperties properties = null;
    private static final java.lang.String HOSTNAME = null;
    private static final int BUFFER_SIZE = 0;
    private static final int PORT = 0;
    
    public Receiver(@org.jetbrains.annotations.NotNull
    java.net.DatagramSocket socket, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.net.receiver.MulticastController controller) {
        super();
    }
    
    public final void receive() {
    }
    
    private final ru.fithub.snakes.dto.SnakesProto.GameMessage parseGameMessage(byte[] data) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/net/receiver/Receiver$Companion;", "", "()V", "BUFFER_SIZE", "", "HOSTNAME", "", "PORT", "properties", "Lru/fithub/snakes/core/config/GameProperties;", "snakes"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}