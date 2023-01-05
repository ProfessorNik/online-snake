package ru.fithub.snakes.event

data class StopSendMessagesToPlayerEvent(val ipAddress: String, val port: Int) {
}