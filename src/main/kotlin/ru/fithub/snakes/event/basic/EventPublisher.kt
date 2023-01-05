package ru.fithub.snakes.event.basic

import ru.fithub.snakes.utils.ThreadPool

class EventPublisher<T> {
    private val listeners: MutableList<EventListener<T>> = mutableListOf()
    val notAsyncListeners: MutableList<EventListener<T>> = mutableListOf()

    @Synchronized
    fun addListener(listener: EventListener<T>, isAsync: Boolean = true) {
        if(isAsync)
            listeners.add(listener)
        else
            notAsyncListeners.add(listener)
    }

    @Synchronized
    fun deleteListener(listener: EventListener<T>) {
        listeners.remove(listener)
        notAsyncListeners.remove(listener)
    }

    @Synchronized
    fun publishAsyncEvent(event: T) {
        notAsyncListeners.forEach{it.handle(event)}
        listeners.forEach { ThreadPool.execute { it.handle(event) } }
    }
}