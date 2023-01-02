package me.nikol.snake.net.sender

import me.nikol.snake.event.ReceiveEvent
import me.nikol.snake.event.basic.EventPublisher
import me.nikol.snake.game.model.AckMsg
import me.nikol.snake.game.model.ErrorMsg
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetSocketAddress

class ByteSender(private val datagramSocket: DatagramSocket) {

    fun send(hostname: String, port: Int, bytes: ByteArray) {
        val socketAddress = InetSocketAddress(hostname, port)
        val packet = DatagramPacket(bytes, bytes.size, socketAddress)
        datagramSocket.send(packet)
    }

    fun safeSend(hostname: String, port: Int, bytes: ByteArray, msgSeq: Long, ackMsgPublisher: EventPublisher<ReceiveEvent<AckMsg>>, errorMsgPublisher: EventPublisher<ReceiveEvent<ErrorMsg>>) {
        val safeByteSender = SafeByteSender(msgSeq, datagramSocket)
        ackMsgPublisher.addListener(safeByteSender.stopper1)
        errorMsgPublisher.addListener(safeByteSender.stopper2)
        safeByteSender.send(hostname, port, bytes)
        ackMsgPublisher.deleteListener(safeByteSender.stopper1)
        errorMsgPublisher.deleteListener(safeByteSender.stopper2)
    }
}