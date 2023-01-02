package me.nikol.snake.game.graphic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0002J2\u0010$\u001a\u00020\u001e2\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u001a\u0010&\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010\'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0015H\u0002J\u0006\u0010)\u001a\u00020\u001eR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000RX\u0010\u0016\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\t\u00a8\u0006*"}, d2 = {"Lme/nikol/snake/game/graphic/Field;", "Lcom/badlogic/gdx/scenes/scene2d/Actor;", "cellX", "", "sellY", "(II)V", "cellHeight", "cellWidth", "getCellX", "()I", "enemyCell", "Lcom/badlogic/gdx/graphics/g2d/TextureRegion;", "fieldState", "Lme/nikol/snake/game/graphic/FieldState;", "foodCell", "friendlyCell", "greenCell", "lightGreenCell", "value", "", "Lkotlin/Pair;", "Lme/nikol/snake/game/graphic/FiledItemType;", "mapCells", "getMapCells", "()Ljava/util/Map;", "setMapCells", "(Ljava/util/Map;)V", "preview", "getSellY", "draw", "", "batch", "Lcom/badlogic/gdx/graphics/g2d/Batch;", "parentAlpha", "", "drawField", "drawFromMap", "map", "drawPreview", "mapTypeOnTextureRegion", "type", "showPreview", "core"})
public final class Field extends com.badlogic.gdx.scenes.scene2d.Actor {
    private final int cellX = 0;
    private final int sellY = 0;
    private me.nikol.snake.game.graphic.FieldState fieldState = me.nikol.snake.game.graphic.FieldState.PREVIEW;
    private final int cellWidth = 30;
    private final int cellHeight = 30;
    private final com.badlogic.gdx.graphics.g2d.TextureRegion greenCell = null;
    private final com.badlogic.gdx.graphics.g2d.TextureRegion lightGreenCell = null;
    private final com.badlogic.gdx.graphics.g2d.TextureRegion enemyCell = null;
    private final com.badlogic.gdx.graphics.g2d.TextureRegion friendlyCell = null;
    private final com.badlogic.gdx.graphics.g2d.TextureRegion foodCell = null;
    private final com.badlogic.gdx.graphics.g2d.TextureRegion preview = null;
    @org.jetbrains.annotations.Nullable
    private java.util.Map<kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? extends me.nikol.snake.game.graphic.FiledItemType> mapCells;
    
    public Field(int cellX, int sellY) {
        super();
    }
    
    public final int getCellX() {
        return 0;
    }
    
    public final int getSellY() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Map<kotlin.Pair<java.lang.Integer, java.lang.Integer>, me.nikol.snake.game.graphic.FiledItemType> getMapCells() {
        return null;
    }
    
    public final void setMapCells(@org.jetbrains.annotations.Nullable
    java.util.Map<kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? extends me.nikol.snake.game.graphic.FiledItemType> value) {
    }
    
    @java.lang.Override
    public void draw(@org.jetbrains.annotations.Nullable
    com.badlogic.gdx.graphics.g2d.Batch batch, float parentAlpha) {
    }
    
    private final void drawPreview(com.badlogic.gdx.graphics.g2d.Batch batch, float parentAlpha) {
    }
    
    private final void drawField(com.badlogic.gdx.graphics.g2d.Batch batch, float parentAlpha) {
    }
    
    private final void drawFromMap(java.util.Map<kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? extends me.nikol.snake.game.graphic.FiledItemType> map, com.badlogic.gdx.graphics.g2d.Batch batch) {
    }
    
    private final com.badlogic.gdx.graphics.g2d.TextureRegion mapTypeOnTextureRegion(me.nikol.snake.game.graphic.FiledItemType type) {
        return null;
    }
    
    public final void showPreview() {
    }
}