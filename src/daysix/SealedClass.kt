/*
 * Copyright © 2020
 * 1 . 26 . 1
 * Yannaing Lynn
 * All right reserved
 */

package daysix

//Special Class
//Data class,Enum Class,Sealed Class,Object

sealed class Mammal(val name:String)

class Cat(val catName:String):Mammal(catName)

class Human(val humanName:String,val age:Int):Mammal(humanName)

fun greet(m:Mammal):String{
    when(m){
        is Cat-> return ("Hello ${m.catName}")
        is Human-> return ("Hello ${m.humanName}")
    }
}
fun main() {
    val h = Human("U Ba",9)
    print(greet(h))
}
