package ru.fithub.snakes.core.model

data class DelayedMessage<M>(val msg: M, val senderIp: String, val senderPort: Int)