/*
 * Copyright © 2020
 * 1 . 26 . 1
 * Yannaing Lynn
 * All right reserved
 */

package daysix

object Hello:Hey(),Z{
    fun hello(){
        println("Hello")
    }
    override val name= "Mg Mg"
}

fun main() {
    Hello.name
    Hello.hello()
    Hello.h
}

interface Z{
    val name:String
}


open class Hey{
    val h = "Hey"
}