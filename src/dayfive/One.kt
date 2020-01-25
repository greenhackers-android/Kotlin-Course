/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */

package dayfive

fun main() {
    val r = Rabbit()
    r.eat()
}
open class Animal{
    open var name:String = "dayfive.Animal"
    open fun eat(){
        println("Food is important")
    }
}
open class Rabbit: Animal(){
    final override fun eat(){
        super.eat()
        println("rabbit is eating")
    }
    override var name = "dayfive.Hello"
}
class Dog: Rabbit(){
    override var name:String = "dayfive.Dog"

}


