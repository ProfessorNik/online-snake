package ru.fithub.snakes.net.receiver

import ru.fithub.snakes.dto.SnakesProto

interface MulticastController {
    fun multicastGameMessage(gameMessage: SnakesProto.GameMessage, hostAddress: String, port: Int)
}