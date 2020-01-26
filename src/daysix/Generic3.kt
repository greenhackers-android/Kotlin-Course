/*
 * Copyright © 2020
 * 1 . 26 . 3
 * Yannaing Lynn
 * All right reserved
 */

package daysix

//Invariance General Type
class Ship<T:Number>(val t:T){
    val a:T = t
}
fun main() {
    //val s = Ship<String>("")
    val s = Ship(9)
    sayHello(object :Greet{
        override fun greet() {
            println("Hello")
        }

    })
}

interface Greet{
    fun greet()
}
fun sayHello(g:Greet){
    g.greet()
}