package ru.fithub.snakes.core.repostiory

import ru.fithub.snakes.core.model.Connection
import ru.fithub.snakes.core.model.DelayedMessage
import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.model.JoinMsg

class ServerRepository {
    var canJoin: Boolean = true
    val connections = mutableListOf<Connection>()
    val joinPlayerDelayedMessages = mutableListOf<DelayedMessage<GameMessage<JoinMsg>>>()
    fun getConnectionByIpAndPort(ipAddress: String, port: Int): Connection? {
        return connections.find { (it.ipAddress == ipAddress) && (it.port == port) }
    }
}