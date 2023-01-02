package ru.fithub.snakes.net.sender

import ru.fithub.snakes.core.config.GameProperties
import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.event.ReceiveEvent
import ru.fithub.snakes.event.StopSendMessagesToPlayerEvent
import ru.fithub.snakes.event.basic.EventListener
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetSocketAddress

class SafeByteSender(
    val msgSeq: Long,
    private val datagramSocket: DatagramSocket,
    val generalRepository: GeneralRepository
) {
    private var send = true
    val stopper1 = Stopper1(this)
    val stopper2 = Stopper2(this)
    val stopper3 = Stopper3(this)
    lateinit var hostname: String
    var port: Int = 0

    private val scheduledMs
        get() = (generalRepository.gameConfig?.stateDelayMs?.toLong() ?: sMs) / 10

    companion object {
        val properties = GameProperties.INSTANCE
        val sMs = properties.getProperty("config.state-delay-ms").toLong()
    }

    @Synchronized
    fun send(hostname: String, port: Int, bytes: ByteArray) {
        this.hostname = hostname
        this.port = port
        while (send) {
            val socketAddress = InetSocketAddress(this.hostname, this.port)
            val packet = DatagramPacket(bytes, bytes.size, socketAddress)
            datagramSocket.send(packet)
            Thread.sleep(scheduledMs)
        }
    }

    @Synchronized
    fun changeIpAndPort(hostname: String, port: Int) {
        this.hostname = hostname
        this.port = port
    }

    fun isReceiver(hostname: String, port: Int) = this.hostname == hostname && this.port == port
    private fun isMsgSeq(msgSeq: Long) = this.msgSeq == msgSeq
    fun isSendingMessage(msgSeq: Long, hostname: String, port: Int) = isReceiver(hostname, port) && isMsgSeq(msgSeq)

    class Stopper1(private val safeByteSender: SafeByteSender) : EventListener<ReceiveEvent<AckMsg>> {
        override fun handle(event: ReceiveEvent<AckMsg>) {
            if (safeByteSender.isSendingMessage(event.msg.msgSeq, event.receiverIp, event.receiverPort))
                safeByteSender.send = false
        }
    }

    class Stopper2(private val safeByteSender: SafeByteSender) : EventListener<ReceiveEvent<ErrorMsg>> {
        override fun handle(event: ReceiveEvent<ErrorMsg>) {
            if (safeByteSender.isSendingMessage(event.msg.msgSeq, event.receiverIp, event.receiverPort))
                safeByteSender.send = false
        }
    }

    class Stopper3(private val safeByteSender: SafeByteSender) : EventListener<StopSendMessagesToPlayerEvent> {
        override fun handle(event: StopSendMessagesToPlayerEvent) {
            if (safeByteSender.isReceiver(event.ipAddress, event.port)) {
                safeByteSender.send = false
            }
        }
    }
}