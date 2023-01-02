package ru.fithub.snakes.core.service.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0007H&\u00a8\u0006\u0018"}, d2 = {"Lru/fithub/snakes/core/service/other/GameService;", "", "clearAll", "", "clientToViewer", "deputyToMaster", "hasDeputy", "", "prepareClientGame", "gameConfig", "Lru/fithub/snakes/core/model/GameConfig;", "gameName", "", "masterIpAddress", "masterPort", "", "prepareServerGame", "serverSchedulersIsWorking", "setDeputyAsNewMaster", "startClientSchedulers", "startServerSchedulers", "stopClientSchedulers", "stopServerSchedulers", "wasServer", "snakes"})
public abstract interface GameService {
    
    public abstract void clearAll();
    
    public abstract void prepareServerGame();
    
    public abstract void startServerSchedulers();
    
    public abstract void stopServerSchedulers();
    
    public abstract void startClientSchedulers();
    
    public abstract void stopClientSchedulers();
    
    public abstract void prepareClientGame(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameConfig gameConfig, @org.jetbrains.annotations.NotNull
    java.lang.String gameName, @org.jetbrains.annotations.NotNull
    java.lang.String masterIpAddress, int masterPort);
    
    public abstract void deputyToMaster();
    
    public abstract boolean serverSchedulersIsWorking();
    
    public abstract boolean hasDeputy();
    
    public abstract void setDeputyAsNewMaster();
    
    public abstract void clientToViewer();
    
    public abstract boolean wasServer();
}