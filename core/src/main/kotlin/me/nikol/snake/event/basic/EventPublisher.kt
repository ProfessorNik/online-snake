package me.nikol.snake.event.basic

import me.nikol.snake.utils.ThreadPool
import kotlin.concurrent.thread

class EventPublisher<T> {
    val listeners: MutableList<EventListener<T>> = mutableListOf()

    fun addListener(listener: EventListener<T>) {
        listeners.add(listener)
    }

    fun deleteListener(listener: EventListener<T>) {
        listeners.remove(listener)
    }

    fun publishEvent(event: T) {
        listeners.forEach { ThreadPool.execute { it.handle(event) } };
    }
}