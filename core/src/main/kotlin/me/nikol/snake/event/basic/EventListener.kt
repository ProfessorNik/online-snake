package me.nikol.snake.event.basic

interface EventListener<T> {
    fun handle(event: T)
}