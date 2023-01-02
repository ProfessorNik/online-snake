package ru.fithub.snakes.core.service.other.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003789B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\b\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u00105\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fJ\u001e\u00106\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020\'\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101\u00a8\u0006:"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl;", "Lru/fithub/snakes/core/service/other/MakeDeputyService;", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "roleChangeEventPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/RoleChangeMsg;", "ackMsgPublisher", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "errorMsgPublisher", "Lru/fithub/snakes/core/model/ErrorMsg;", "stopEventPublisher", "Lru/fithub/snakes/event/StopSendMessagesToPlayerEvent;", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "(Lru/fithub/snakes/core/repostiory/GeneralRepository;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/core/service/MessageFormer;)V", "hostname", "", "getHostname", "()Ljava/lang/String;", "setHostname", "(Ljava/lang/String;)V", "msgSeq", "", "getMsgSeq", "()J", "setMsgSeq", "(J)V", "port", "", "getPort", "()I", "setPort", "(I)V", "send", "", "stopper1", "Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl$Stopper1;", "getStopper1", "()Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl$Stopper1;", "stopper2", "Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl$Stopper2;", "getStopper2", "()Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl$Stopper2;", "stopper3", "Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl$Stopper3;", "getStopper3", "()Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl$Stopper3;", "addDeputy", "", "isMsgSeq", "isReceiver", "isSendingMessage", "Stopper1", "Stopper2", "Stopper3", "snakes"})
public final class MakeDeputyServiceImpl implements ru.fithub.snakes.core.service.other.MakeDeputyService {
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.RoleChangeMsg>> roleChangeEventPublisher = null;
    private final ru.fithub.snakes.core.service.MessageFormer messageFormer = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl.Stopper1 stopper1 = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl.Stopper2 stopper2 = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl.Stopper3 stopper3 = null;
    private boolean send = false;
    @org.jetbrains.annotations.Nullable
    private java.lang.String hostname;
    private long msgSeq = -1L;
    private int port = -1;
    
    public MakeDeputyServiceImpl(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.RoleChangeMsg>> roleChangeEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> ackMsgPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorMsgPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> stopEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.MessageFormer messageFormer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl.Stopper1 getStopper1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl.Stopper2 getStopper2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl.Stopper3 getStopper3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHostname() {
        return null;
    }
    
    public final void setHostname(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final long getMsgSeq() {
        return 0L;
    }
    
    public final void setMsgSeq(long p0) {
    }
    
    public final int getPort() {
        return 0;
    }
    
    public final void setPort(int p0) {
    }
    
    public final boolean isReceiver(@org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port) {
        return false;
    }
    
    private final boolean isMsgSeq(long msgSeq) {
        return false;
    }
    
    public final boolean isSendingMessage(long msgSeq, @org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port) {
        return false;
    }
    
    @java.lang.Override
    public void addDeputy() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl$Stopper1;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "makeDeputyServiceImpl", "Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl;", "(Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl;)V", "handle", "", "event", "snakes"})
    public static final class Stopper1 implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> {
        private final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl makeDeputyServiceImpl = null;
        
        public Stopper1(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl makeDeputyServiceImpl) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg> event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl$Stopper2;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/ErrorMsg;", "makeDeputyServiceImpl", "Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl;", "(Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl;)V", "handle", "", "event", "snakes"})
    public static final class Stopper2 implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> {
        private final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl makeDeputyServiceImpl = null;
        
        public Stopper2(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl makeDeputyServiceImpl) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg> event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl$Stopper3;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/StopSendMessagesToPlayerEvent;", "makeDeputyServiceImpl", "Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl;", "(Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl;)V", "handle", "", "event", "snakes"})
    public static final class Stopper3 implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> {
        private final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl makeDeputyServiceImpl = null;
        
        public Stopper3(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl makeDeputyServiceImpl) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.StopSendMessagesToPlayerEvent event) {
        }
    }
}