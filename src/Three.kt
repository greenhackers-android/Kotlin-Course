fun main() {
    val u = User()
    u.getMoney()

}

//OOP(Encapsulation)
abstract class Banking{
    var accountNo = "009098388277487"
    val money = 9000000
    open fun getMoney(){
        println("$accountNo has $money MMk")
    }
}
class User:Banking(){

}
