package me.nikol.snake.game.config

import java.io.FileInputStream
import java.util.*

class GameProperties private constructor(){
    val properties: Properties = Properties()
    init {
        FileInputStream("C:\\Users\\nikol\\Documents\\progects\\kotlin\\online-snake\\core\\src\\main\\resources\\application.properties").use {
            properties.load(it)
        }
    }

    companion object{
        val INSTANCE: GameProperties = GameProperties()
    }

    fun getProperty(name: String): String {
        val property = properties[name] ?: throw UnknownPropertyException("Property with name $name does not exist")
        return property as String
    }
}

class UnknownPropertyException: Exception{
    constructor() : super()
    constructor(message: String?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
    constructor(cause: Throwable?) : super(cause)
}
