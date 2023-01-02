package me.nikol.snake.utils

import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService

fun DaemonSingleThreadScheduledExecutor(): ScheduledExecutorService {
    return Executors.newSingleThreadScheduledExecutor { r ->
        val t = Executors.defaultThreadFactory().newThread(r)
        t.isDaemon = true
        t
    }
}

class ThreadPool {
    companion object {
        val executors = Executors.newFixedThreadPool(10) { r ->
            val t = Executors.defaultThreadFactory().newThread(r)
            t.isDaemon = true
            t
        }

        fun execute(runnable: Runnable) {
            executors.execute (runnable)
        }
    }
}