fun main() {
    val r = Rabbit()
    r.eat()
}
open class Animal{
    open var name:String = "Animal"
    open fun eat(){
        println("Food is important")
    }
}
open class Rabbit:Animal(){
    final override fun eat(){
        super.eat()
        println("rabbit is eating")
    }
    override var name = "Hello"
}
class Dog:Rabbit(){
    override var name:String = "Dog"

}


