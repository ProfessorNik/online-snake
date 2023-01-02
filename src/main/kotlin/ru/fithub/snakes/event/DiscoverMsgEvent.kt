package ru.fithub.snakes.event

import ru.fithub.snakes.core.model.DiscoverMsg
import ru.fithub.snakes.core.model.GameMessage


data class DiscoverMsgEvent(val msg: GameMessage<DiscoverMsg>, val hostAddress: String, val port: Int) {
}