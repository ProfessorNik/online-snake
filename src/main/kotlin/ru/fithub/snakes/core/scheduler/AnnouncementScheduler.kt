package ru.fithub.snakes.core.scheduler

import ru.fithub.snakes.core.model.GameAnnouncement
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.event.SendAnnouncementMsgEvent
import ru.fithub.snakes.event.basic.EventPublisher
import ru.fithub.snakes.utils.DaemonSingleThreadScheduledExecutor
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

class AnnouncementScheduler(
    private val generalRepository: GeneralRepository,
    private val serverRepository: ServerRepository,
    private val announcementPublisher: EventPublisher<SendAnnouncementMsgEvent>,
    private val messageFormer: MessageFormer
) {
    private var scheduler: ScheduledExecutorService  = DaemonSingleThreadScheduledExecutor()

    private fun notifyAllAboutGame() {
        println("START: AnnouncementScheduler::notifyAllAboutGame()")
        try {
            val announcement = createMessage()
            announcementPublisher.publishAsyncEvent(
                SendAnnouncementMsgEvent(
                    messageFormer.announcementMsg(
                        null,
                        announcement
                    )
                )
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
        println("END: AnnouncementScheduler::notifyAllAboutGame()")
    }

    private fun createMessage(): GameAnnouncement {
        return GameAnnouncement(
            generalRepository.gameState!!.players,
            generalRepository.gameConfig!!,
            serverRepository.canJoin,
            generalRepository.gameName!!
        )
    }

    fun start() {
        scheduler = DaemonSingleThreadScheduledExecutor()
        scheduler.scheduleWithFixedDelay(
            {
                notifyAllAboutGame()
            },
            1000L,
            generalRepository.gameConfig!!.stateDelayMs.toLong() * 10,
            TimeUnit.MILLISECONDS
        )
    }

    fun stop() {
        if(!isStopped())
        scheduler.shutdownNow()
    }

    fun isStopped(): Boolean {
        return scheduler.isShutdown
    }
}