package ru.fithub.snakes.event.basic

interface EventListener<T> {
    fun handle(event: T)
}