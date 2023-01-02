package me.nikol.snake.game.graphic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J4\u0010\u000f\u001a\u00020\u00102,\u0010\u0011\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00130\u0012J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001c\u001a\u00020\u0014H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lme/nikol/snake/game/graphic/AnnouncementTable;", "Lcom/badlogic/gdx/scenes/scene2d/ui/Table;", "textFieldStyle", "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$TextFieldStyle;", "main", "Lme/nikol/snake/game/Main;", "(Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$TextFieldStyle;Lme/nikol/snake/game/Main;)V", "getMain", "()Lme/nikol/snake/game/Main;", "textButtonStyle", "Lcom/badlogic/gdx/scenes/scene2d/ui/TextButton$TextButtonStyle;", "textField", "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField;", "getTextFieldStyle", "()Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$TextFieldStyle;", "change", "", "scores", "", "Lkotlin/Triple;", "Lme/nikol/snake/game/model/GameAnnouncement;", "Lme/nikol/snake/game/model/DelayedMessage;", "Lme/nikol/snake/game/model/JoinMsg;", "createButton", "Lcom/badlogic/gdx/scenes/scene2d/ui/Button;", "buttonName", "", "delayed", "gameAnnouncement", "core"})
public final class AnnouncementTable extends com.badlogic.gdx.scenes.scene2d.ui.Table {
    @org.jetbrains.annotations.NotNull
    private final com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle textFieldStyle = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.Main main = null;
    private final com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle textButtonStyle = null;
    private final com.badlogic.gdx.scenes.scene2d.ui.TextField textField = null;
    
    public AnnouncementTable(@org.jetbrains.annotations.NotNull
    com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle textFieldStyle, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.Main main) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle getTextFieldStyle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.Main getMain() {
        return null;
    }
    
    private final com.badlogic.gdx.scenes.scene2d.ui.Button createButton(java.lang.String buttonName, me.nikol.snake.game.model.DelayedMessage<me.nikol.snake.game.model.JoinMsg> delayed, me.nikol.snake.game.model.GameAnnouncement gameAnnouncement) {
        return null;
    }
    
    public final void change(@org.jetbrains.annotations.NotNull
    java.util.List<kotlin.Triple<me.nikol.snake.game.model.GameAnnouncement, me.nikol.snake.game.model.DelayedMessage<me.nikol.snake.game.model.JoinMsg>, me.nikol.snake.game.model.DelayedMessage<me.nikol.snake.game.model.JoinMsg>>> scores) {
    }
}