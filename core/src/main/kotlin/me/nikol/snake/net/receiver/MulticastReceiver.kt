package me.nikol.snake.net.receiver

import me.nikol.snake.dto.SnakesProto
import me.nikol.snake.game.config.GameProperties
import java.net.DatagramPacket
import java.net.InetSocketAddress
import java.net.MulticastSocket
import java.net.NetworkInterface

class MulticastReceiver(private val controller: MulticastController) {
    companion object {
        private val properties: GameProperties = GameProperties.INSTANCE
        private val MULTICAST_IP = properties.getProperty("receiver.multicast.ip");
        private val BUFFER_SIZE = properties.getProperty("receiver.buffer.max-size-bytes").toInt()
        private val MULTICAST_PORT = properties.getProperty("multicast.port").toInt()
    }

    private val multicastSocket: MulticastSocket = MulticastSocket(MULTICAST_PORT)
    private val networkInterface: NetworkInterface = multicastSocket.networkInterface
    private val socketAddress: InetSocketAddress = InetSocketAddress(MULTICAST_IP, MULTICAST_PORT)

    init {
        multicastSocket.joinGroup(socketAddress, networkInterface)
    }

    fun receive() {
        val packet = DatagramPacket(ByteArray(BUFFER_SIZE), BUFFER_SIZE)
        multicastSocket.receive(packet)
        val data = packet.data.dropLast(BUFFER_SIZE - packet.length).toByteArray()
        controller.multicastGameMessage(parseGameMessage(data), packet.address.hostAddress, packet.port)
    }

    private fun parseGameMessage(data: ByteArray): SnakesProto.GameMessage {
        return SnakesProto.GameMessage.parseFrom(data)
    }
}