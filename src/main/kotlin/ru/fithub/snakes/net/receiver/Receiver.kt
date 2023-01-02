package ru.fithub.snakes.net.receiver

import ru.fithub.snakes.core.config.GameProperties
import ru.fithub.snakes.dto.SnakesProto
import java.net.DatagramPacket
import java.net.DatagramSocket

class Receiver(private val socket: DatagramSocket, private val controller: MulticastController) {
    companion object {
        private val properties: GameProperties = GameProperties.INSTANCE
        private val HOSTNAME = properties.getProperty("hostname");
        private val BUFFER_SIZE = properties.getProperty("receiver.buffer.max-size-bytes").toInt()
        private val PORT = properties.getProperty("receiver.port").toInt()
    }


    fun receive() {
        val packet = DatagramPacket(ByteArray(BUFFER_SIZE), BUFFER_SIZE)
        socket.receive(packet)
        val data = packet.data.dropLast(BUFFER_SIZE - packet.length).toByteArray()
        controller.multicastGameMessage(parseGameMessage(data), packet.address.hostAddress, packet.port)
    }

    private fun parseGameMessage(data: ByteArray): SnakesProto.GameMessage {
        return SnakesProto.GameMessage.parseFrom(data)
    }
}