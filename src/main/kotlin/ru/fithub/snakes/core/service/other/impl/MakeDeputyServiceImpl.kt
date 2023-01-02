package ru.fithub.snakes.core.service.other.impl

import ru.fithub.snakes.core.model.AckMsg
import ru.fithub.snakes.core.model.ErrorMsg
import ru.fithub.snakes.core.model.NodeRole
import ru.fithub.snakes.core.model.RoleChangeMsg
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.core.service.other.MakeDeputyService
import ru.fithub.snakes.event.ReceiveEvent
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.SendRoleChangeMsgEvent
import ru.fithub.snakes.event.StopSendMessagesToPlayerEvent
import ru.fithub.snakes.event.basic.EventListener
import ru.fithub.snakes.event.basic.EventPublisher

class MakeDeputyServiceImpl(
    private val generalRepository: GeneralRepository,
    private val roleChangeEventPublisher: EventPublisher<SendEvent<RoleChangeMsg>>,
    ackMsgPublisher: EventPublisher<ReceiveEvent<AckMsg>>,
    errorMsgPublisher: EventPublisher<ReceiveEvent<ErrorMsg>>,
    stopEventPublisher: EventPublisher<StopSendMessagesToPlayerEvent>,
    private val messageFormer: MessageFormer
) : MakeDeputyService {
    val stopper1 = Stopper1(this)
    val stopper2 = Stopper2(this)
    val stopper3 = Stopper3(this)

    init {
        ackMsgPublisher.addListener(stopper1)
        errorMsgPublisher.addListener(stopper2)
        stopEventPublisher.addListener(stopper3)
    }

    private var send = false
    var hostname: String? = null
    var msgSeq: Long = -1
    var port: Int = -1

    fun isReceiver(hostname: String, port: Int) = this.hostname != null && this.hostname == hostname && this.port == port
    private fun isMsgSeq(msgSeq: Long) = this.msgSeq == msgSeq
    fun isSendingMessage(msgSeq: Long, hostname: String, port: Int) = isReceiver(hostname, port) && isMsgSeq(msgSeq)


    override fun addDeputy() {
        if (!send &&
            !generalRepository.gameState!!.players.players.map { it.role }.contains(NodeRole.DEPUTY)
            && generalRepository.gameState!!.players.players.size > 1
        ) {
            generalRepository.gameState!!.players.players.firstOrNull { it.role != NodeRole.VIEWER && it.role != NodeRole.MASTER }
                ?.let {
                    if (it.ipAddress != null && it.port != null) {
                        val roleChangeMsg = messageFormer.roleChangeMsg(
                            it.id,
                            null,
                            NodeRole.DEPUTY
                        )
                        roleChangeEventPublisher.publishAsyncEvent(
                            SendRoleChangeMsgEvent(
                                roleChangeMsg,
                                it.ipAddress,
                                it.port
                            )
                        )
                        hostname = it.ipAddress
                        port = it.port
                        msgSeq = roleChangeMsg.msgSeq
                        send = true
                    }
                }
        }
    }




    class Stopper1(private val makeDeputyServiceImpl: MakeDeputyServiceImpl) : EventListener<ReceiveEvent<AckMsg>> {
        override fun handle(event: ReceiveEvent<AckMsg>) {
            with(makeDeputyServiceImpl) {
                if (isSendingMessage(event.msg.msgSeq, event.receiverIp, event.receiverPort)) {
                    generalRepository.gameState = generalRepository.gameState?.makeDeputy(event.receiverIp, event.receiverPort)
                    send = false
                }
            }
        }
    }

    class Stopper2(private val makeDeputyServiceImpl: MakeDeputyServiceImpl) : EventListener<ReceiveEvent<ErrorMsg>> {
        override fun handle(event: ReceiveEvent<ErrorMsg>) {
            if (makeDeputyServiceImpl.isSendingMessage(event.msg.msgSeq, event.receiverIp, event.receiverPort))
                makeDeputyServiceImpl.send = false
        }
    }

    class Stopper3(private val makeDeputyServiceImpl: MakeDeputyServiceImpl) : EventListener<StopSendMessagesToPlayerEvent> {
        override fun handle(event: StopSendMessagesToPlayerEvent) {
            if(makeDeputyServiceImpl.isReceiver(event.ipAddress, event.port)){
                makeDeputyServiceImpl.send = false
            }
        }
    }
}