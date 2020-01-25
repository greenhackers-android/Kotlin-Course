/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */

package dayfive

fun main() {
    val t = Tiger()
    println(t.name)
    t.walk()
}
interface Mammal{
    var name:String
    var color:String
    fun walk(){
        println("Iam from mammal")
    }
}
interface Walkable{
    var footNum:Int
    fun walk(){
        println("Iam from walkable")
    }
}
class Tiger: Mammal, Walkable {
    override var name = "dayfive.Tiger"
    override var color = "Yellow"
    override fun walk() {
        super<Walkable>.walk()
        super<Mammal>.walk()
    }
    override var footNum = 4
}