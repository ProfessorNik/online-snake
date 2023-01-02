package ru.fithub.snakes.core.service.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lru/fithub/snakes/core/service/other/AckService;", "", "ack", "", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/core/model/AckMsg;", "senderIp", "", "receiverPort", "", "snakes"})
public abstract interface AckService {
    
    public abstract void ack(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AckMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String senderIp, int receiverPort);
}