package ru.fithub.snakes.core.model

data class AvailableGame(
    val announcement: GameAnnouncement,
    val text: String,
    val messageForViewer: DelayedMessage<JoinMsg>,
    val messageForNormal: DelayedMessage<JoinMsg>?
)