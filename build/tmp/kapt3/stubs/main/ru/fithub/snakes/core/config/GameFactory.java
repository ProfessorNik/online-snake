package ru.fithub.snakes.core.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u00a8\u0006\u000e"}, d2 = {"Lru/fithub/snakes/core/config/GameFactory;", "", "()V", "gameConfig", "Lru/fithub/snakes/core/model/GameConfig;", "gamePlayer", "Lru/fithub/snakes/core/model/GamePlayer;", "gameState", "Lru/fithub/snakes/core/model/GameState;", "properties", "Lru/fithub/snakes/core/config/GameProperties;", "snake", "Lru/fithub/snakes/core/model/Snake;", "Companion", "snakes"})
public final class GameFactory {
    @org.jetbrains.annotations.NotNull
    public static final ru.fithub.snakes.core.config.GameFactory.Companion Companion = null;
    private static final ru.fithub.snakes.core.config.GameProperties properties = null;
    public static final int GAME_CREATOR_ID = 1;
    public static final int SCORE_INIT = 0;
    public static final int STATE_ORDER_INIT = 1;
    
    public GameFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.config.GameProperties properties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameConfig gameConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameState gameState(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.GamePlayer gamePlayer() {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.Snake snake(ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/fithub/snakes/core/config/GameFactory$Companion;", "", "()V", "GAME_CREATOR_ID", "", "SCORE_INIT", "STATE_ORDER_INIT", "properties", "Lru/fithub/snakes/core/config/GameProperties;", "snakes"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}