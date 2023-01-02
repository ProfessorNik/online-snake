package ru.fithub.snakes.core.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lru/fithub/snakes/core/model/AvailableGame;", "", "announcement", "Lru/fithub/snakes/core/model/GameAnnouncement;", "text", "", "messageForViewer", "Lru/fithub/snakes/core/model/DelayedMessage;", "Lru/fithub/snakes/core/model/JoinMsg;", "messageForNormal", "(Lru/fithub/snakes/core/model/GameAnnouncement;Ljava/lang/String;Lru/fithub/snakes/core/model/DelayedMessage;Lru/fithub/snakes/core/model/DelayedMessage;)V", "getAnnouncement", "()Lru/fithub/snakes/core/model/GameAnnouncement;", "getMessageForNormal", "()Lru/fithub/snakes/core/model/DelayedMessage;", "getMessageForViewer", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "snakes"})
public final class AvailableGame {
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.model.GameAnnouncement announcement = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String text = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> messageForViewer = null;
    @org.jetbrains.annotations.Nullable
    private final ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> messageForNormal = null;
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.AvailableGame copy(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameAnnouncement announcement, @org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> messageForViewer, @org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> messageForNormal) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public AvailableGame(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameAnnouncement announcement, @org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> messageForViewer, @org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> messageForNormal) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameAnnouncement component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameAnnouncement getAnnouncement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> getMessageForViewer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> getMessageForNormal() {
        return null;
    }
}