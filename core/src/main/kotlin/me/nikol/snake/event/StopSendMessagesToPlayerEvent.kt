package me.nikol.snake.event

data class StopSendMessagesToPlayerEvent(val ipAddress: String, val port: Int) {
}