package ru.fithub.snakes.net.sender

import ru.fithub.snakes.core.model.AckMsg
import ru.fithub.snakes.core.model.ErrorMsg
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.event.ReceiveEvent
import ru.fithub.snakes.event.StopSendMessagesToPlayerEvent
import ru.fithub.snakes.event.basic.EventPublisher
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetSocketAddress

class ByteSender(private val datagramSocket: DatagramSocket, private val generalRepository: GeneralRepository) {

    fun send(hostname: String, port: Int, bytes: ByteArray) {
        val socketAddress = InetSocketAddress(hostname, port)
        val packet = DatagramPacket(bytes, bytes.size, socketAddress)
        datagramSocket.send(packet)
    }

    fun safeSend(hostname: String, port: Int, bytes: ByteArray, msgSeq: Long, ackMsgPublisher: EventPublisher<ReceiveEvent<AckMsg>>, errorMsgPublisher: EventPublisher<ReceiveEvent<ErrorMsg>>, stopSendMessagesToPlayerEventPublisher: EventPublisher<StopSendMessagesToPlayerEvent>) {
        val safeByteSender = SafeByteSender(msgSeq, datagramSocket, generalRepository)
        ackMsgPublisher.addListener(safeByteSender.stopper1)
        errorMsgPublisher.addListener(safeByteSender.stopper2)
        stopSendMessagesToPlayerEventPublisher.addListener(safeByteSender.stopper3)
        safeByteSender.send(hostname, port, bytes)
        ackMsgPublisher.deleteListener(safeByteSender.stopper1)
        errorMsgPublisher.deleteListener(safeByteSender.stopper2)
        stopSendMessagesToPlayerEventPublisher.deleteListener(safeByteSender.stopper3)
    }
}