fun main() {
    val d = Draw()
    d.draw()
}

//OOP(Encapsulation)
abstract class Circle(){
    abstract var diameter:Double
    abstract fun draw()
}

class Draw:Circle(){
    override var diameter = 9.0
    override fun draw() {

    }
}