package me.nikol.snake.net.sender

import me.nikol.snake.event.ReceiveEvent
import me.nikol.snake.event.StopSendMessagesToPlayerEvent
import me.nikol.snake.event.basic.EventListener
import me.nikol.snake.game.config.GameProperties
import me.nikol.snake.game.model.AckMsg
import me.nikol.snake.game.model.ErrorMsg
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetSocketAddress

class SafeByteSender(val msgSeq: Long, private val datagramSocket: DatagramSocket) {
    private var send = true
    val stopper1 = Stopper1(this)
    val stopper2 = Stopper2(this)
    val stopper3 = Stopper3(this)
    lateinit var hostname: String
    var port: Int = 0


    companion object {
        private val properties = GameProperties.INSTANCE
        private val SCHEDULED_MS = properties.getProperty("sender.schedule-ms").toLong()
    }

    @Synchronized
    fun send(hostname: String, port: Int, bytes: ByteArray) {
        this.hostname = hostname
        this.port = port
        while (send) {
            val socketAddress = InetSocketAddress(this.hostname, this.port)
            val packet = DatagramPacket(bytes, bytes.size, socketAddress)
            datagramSocket.send(packet)
            Thread.sleep(SCHEDULED_MS);
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
            if(safeByteSender.isReceiver(event.ipAddress, event.port)){
                safeByteSender.send = false
            }
        }
    }
}