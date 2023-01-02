package ru.fithub.snakes.core.service.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lru/fithub/snakes/core/service/other/JoinService;", "", "join", "", "msg", "Lru/fithub/snakes/core/model/DelayedMessage;", "Lru/fithub/snakes/core/model/JoinMsg;", "parentMsg", "Lru/fithub/snakes/core/model/GameAnnouncement;", "snakes"})
public abstract interface JoinService {
    
    public abstract void join(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> msg, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameAnnouncement parentMsg);
}