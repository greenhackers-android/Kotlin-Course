fun main() {
    println(Rectangle().getArea())
}
open class Square{
    open val width = 9.0f
    open val height = 9.0f
    open fun getArea() = width*height
}

class Rectangle:Square(){
    override val height = 5.0f
    override fun getArea() = super.width*this.height
}

