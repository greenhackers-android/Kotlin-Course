/*
 * Copyright © 2020
 * 1 . 26 . 1
 * Yannaing Lynn
 * All right reserved
 */

package daysix

class Hi{
    val name:String = "Hi"
    fun sayHi(){
        println(name)
    }
    companion object {
        fun sayHello(){
            println("Hello")
        }
    }
}
fun main() {
    Hi.sayHello()
}