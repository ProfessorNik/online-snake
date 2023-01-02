package me.nikol.snake.game;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XJ\u000e\u0010Y\u001a\u00020V2\u0006\u0010Z\u001a\u00020#J\b\u0010[\u001a\u00020VH\u0016J\u0006\u0010\\\u001a\u00020]J\u0006\u0010^\u001a\u00020_J\b\u0010`\u001a\u00020VH\u0016J\u0006\u0010a\u001a\u00020VJ\u000e\u0010b\u001a\u00020V2\u0006\u0010Z\u001a\u00020#J\u0006\u0010c\u001a\u00020VJ\u0006\u0010d\u001a\u00020VR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020<X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020HX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020NX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010O\u001a\u00020PX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T\u00a8\u0006e"}, d2 = {"Lme/nikol/snake/game/Main;", "Lktx/app/KtxGame;", "Lktx/app/KtxScreen;", "()V", "announcementPresenter", "Lme/nikol/snake/game/infrastructure/AnnouncementPresenter;", "getAnnouncementPresenter", "()Lme/nikol/snake/game/infrastructure/AnnouncementPresenter;", "setAnnouncementPresenter", "(Lme/nikol/snake/game/infrastructure/AnnouncementPresenter;)V", "announcementTable", "Lme/nikol/snake/game/graphic/AnnouncementTable;", "getAnnouncementTable", "()Lme/nikol/snake/game/graphic/AnnouncementTable;", "setAnnouncementTable", "(Lme/nikol/snake/game/graphic/AnnouncementTable;)V", "eventConfig", "Lme/nikol/snake/event/config/EventConfig;", "getEventConfig", "()Lme/nikol/snake/event/config/EventConfig;", "setEventConfig", "(Lme/nikol/snake/event/config/EventConfig;)V", "field", "Lme/nikol/snake/game/graphic/Field;", "getField", "()Lme/nikol/snake/game/graphic/Field;", "setField", "(Lme/nikol/snake/game/graphic/Field;)V", "gamePlayPresenter", "Lme/nikol/snake/game/infrastructure/GamePlayPresenter;", "getGamePlayPresenter", "()Lme/nikol/snake/game/infrastructure/GamePlayPresenter;", "setGamePlayPresenter", "(Lme/nikol/snake/game/infrastructure/GamePlayPresenter;)V", "gameService", "Lme/nikol/snake/game/service/behavior/Behavior;", "getGameService", "()Lme/nikol/snake/game/service/behavior/Behavior;", "setGameService", "(Lme/nikol/snake/game/service/behavior/Behavior;)V", "inputMultiplexer", "Lcom/badlogic/gdx/InputMultiplexer;", "getInputMultiplexer", "()Lcom/badlogic/gdx/InputMultiplexer;", "setInputMultiplexer", "(Lcom/badlogic/gdx/InputMultiplexer;)V", "joinAnnouncement", "Lme/nikol/snake/game/model/GameAnnouncement;", "getJoinAnnouncement", "()Lme/nikol/snake/game/model/GameAnnouncement;", "setJoinAnnouncement", "(Lme/nikol/snake/game/model/GameAnnouncement;)V", "joinMsg", "Lme/nikol/snake/game/model/DelayedMessage;", "Lme/nikol/snake/game/model/JoinMsg;", "getJoinMsg", "()Lme/nikol/snake/game/model/DelayedMessage;", "setJoinMsg", "(Lme/nikol/snake/game/model/DelayedMessage;)V", "netConfig", "Lme/nikol/snake/net/NetConfig;", "getNetConfig", "()Lme/nikol/snake/net/NetConfig;", "setNetConfig", "(Lme/nikol/snake/net/NetConfig;)V", "scoreTable", "Lme/nikol/snake/game/graphic/ScoreTable;", "getScoreTable", "()Lme/nikol/snake/game/graphic/ScoreTable;", "setScoreTable", "(Lme/nikol/snake/game/graphic/ScoreTable;)V", "serviceConfig", "Lme/nikol/snake/game/config/ServiceConfig;", "getServiceConfig", "()Lme/nikol/snake/game/config/ServiceConfig;", "setServiceConfig", "(Lme/nikol/snake/game/config/ServiceConfig;)V", "stage", "Lcom/badlogic/gdx/scenes/scene2d/Stage;", "state", "Lme/nikol/snake/game/State;", "getState", "()Lme/nikol/snake/game/State;", "setState", "(Lme/nikol/snake/game/State;)V", "changeState", "", "newStateType", "Lme/nikol/snake/game/StateType;", "continueGame", "behavior", "create", "createMasterBehavior", "Lme/nikol/snake/game/service/behavior/impl/MasterBehavior;", "createNormalBehavior", "Lme/nikol/snake/game/service/behavior/impl/NormalBehavior;", "dispose", "endGame", "startGame", "toMaster", "toViewer", "core"})
public final class Main extends ktx.app.KtxGame<ktx.app.KtxScreen> {
    public me.nikol.snake.game.model.GameAnnouncement joinAnnouncement;
    public me.nikol.snake.game.service.behavior.Behavior gameService;
    public me.nikol.snake.game.infrastructure.GamePlayPresenter gamePlayPresenter;
    public me.nikol.snake.game.infrastructure.AnnouncementPresenter announcementPresenter;
    public me.nikol.snake.game.graphic.ScoreTable scoreTable;
    public me.nikol.snake.game.graphic.AnnouncementTable announcementTable;
    public me.nikol.snake.game.graphic.Field field;
    public com.badlogic.gdx.InputMultiplexer inputMultiplexer;
    public me.nikol.snake.game.model.DelayedMessage<me.nikol.snake.game.model.JoinMsg> joinMsg;
    public me.nikol.snake.event.config.EventConfig eventConfig;
    public me.nikol.snake.game.config.ServiceConfig serviceConfig;
    public me.nikol.snake.net.NetConfig netConfig;
    public me.nikol.snake.game.State state;
    private com.badlogic.gdx.scenes.scene2d.Stage stage;
    
    public Main() {
        super(null, false);
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameAnnouncement getJoinAnnouncement() {
        return null;
    }
    
    public final void setJoinAnnouncement(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameAnnouncement p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.behavior.Behavior getGameService() {
        return null;
    }
    
    public final void setGameService(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.behavior.Behavior p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.infrastructure.GamePlayPresenter getGamePlayPresenter() {
        return null;
    }
    
    public final void setGamePlayPresenter(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.infrastructure.GamePlayPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.infrastructure.AnnouncementPresenter getAnnouncementPresenter() {
        return null;
    }
    
    public final void setAnnouncementPresenter(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.infrastructure.AnnouncementPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.graphic.ScoreTable getScoreTable() {
        return null;
    }
    
    public final void setScoreTable(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.graphic.ScoreTable p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.graphic.AnnouncementTable getAnnouncementTable() {
        return null;
    }
    
    public final void setAnnouncementTable(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.graphic.AnnouncementTable p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.graphic.Field getField() {
        return null;
    }
    
    public final void setField(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.graphic.Field p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.badlogic.gdx.InputMultiplexer getInputMultiplexer() {
        return null;
    }
    
    public final void setInputMultiplexer(@org.jetbrains.annotations.NotNull
    com.badlogic.gdx.InputMultiplexer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.DelayedMessage<me.nikol.snake.game.model.JoinMsg> getJoinMsg() {
        return null;
    }
    
    public final void setJoinMsg(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.DelayedMessage<me.nikol.snake.game.model.JoinMsg> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.event.config.EventConfig getEventConfig() {
        return null;
    }
    
    public final void setEventConfig(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.config.EventConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.config.ServiceConfig getServiceConfig() {
        return null;
    }
    
    public final void setServiceConfig(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.config.ServiceConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.NetConfig getNetConfig() {
        return null;
    }
    
    public final void setNetConfig(@org.jetbrains.annotations.NotNull
    me.nikol.snake.net.NetConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.State p0) {
    }
    
    public final void changeState(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.StateType newStateType) {
    }
    
    @java.lang.Override
    public void create() {
    }
    
    public final void startGame(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.behavior.Behavior behavior) {
    }
    
    public final void continueGame(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.behavior.Behavior behavior) {
    }
    
    public final void endGame() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.behavior.impl.MasterBehavior createMasterBehavior() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.behavior.impl.NormalBehavior createNormalBehavior() {
        return null;
    }
    
    @java.lang.Override
    public void dispose() {
    }
    
    public final void toViewer() {
    }
    
    public final void toMaster() {
    }
}