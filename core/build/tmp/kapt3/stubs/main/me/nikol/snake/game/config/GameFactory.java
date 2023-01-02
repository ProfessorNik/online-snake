package me.nikol.snake.game.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002\u00a8\u0006\u0010"}, d2 = {"Lme/nikol/snake/game/config/GameFactory;", "", "()V", "gameAnnouncement", "Lme/nikol/snake/game/model/GameAnnouncement;", "gameConfig", "Lme/nikol/snake/game/model/GameConfig;", "gameState", "Lme/nikol/snake/game/model/GameState;", "gamePlayer", "Lme/nikol/snake/game/model/GamePlayer;", "properties", "Lme/nikol/snake/game/config/GameProperties;", "snake", "Lme/nikol/snake/game/model/Snake;", "Companion", "core"})
public final class GameFactory {
    @org.jetbrains.annotations.NotNull
    public static final me.nikol.snake.game.config.GameFactory.Companion Companion = null;
    private static final me.nikol.snake.game.config.GameProperties properties = null;
    public static final int GAME_CREATOR_ID = 1;
    public static final int SCORE_INIT = 0;
    public static final int STATE_ORDER_INIT = 1;
    
    public GameFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.config.GameProperties properties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameAnnouncement gameAnnouncement(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig gameConfig, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameState gameState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameConfig gameConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameState gameState() {
        return null;
    }
    
    private final me.nikol.snake.game.model.GamePlayer gamePlayer() {
        return null;
    }
    
    private final me.nikol.snake.game.model.Snake snake() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lme/nikol/snake/game/config/GameFactory$Companion;", "", "()V", "GAME_CREATOR_ID", "", "SCORE_INIT", "STATE_ORDER_INIT", "properties", "Lme/nikol/snake/game/config/GameProperties;", "core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}