package ru.fithub.snakes.core.model

data class Connection(
    var playerId: Int? = null,
    var ipAddress: String? = null,
    var port: Int? = null,
    var newDirection: Direction? = null,
    var lastSeqMessage: Long? = null,
    var lastMessageTime: Long? = null,
    var pingTime: Long? = null,
    var lastStateOrder: Int? = null,
    var leftGame: Boolean = false,
    var becomeViewer: Boolean = false,
    val answeredAckMessages: MutableMap<Long, GameMessage<AckMsg>> = mutableMapOf(),
    val answeredErrorMessages: MutableMap<Long, GameMessage<ErrorMsg>> = mutableMapOf()
) {

}