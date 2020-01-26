/*
 * Copyright © 2020
 * 1 . 26 . 3
 * Yannaing Lynn
 * All right reserved
 */

package daysix

//Generic
fun main() {
    val a = listOf<String>("3","","")
    val b = Box(9)
    val b2 = Box("")
    val b3 = Box(9L)
    val s = Square<Int,Int>(5,6)
    val s2 = Square<Long,Short>(4L,5)
    val s3 = Square<String,String>("","")
}
class Box<Y>(t:Y){
    val t = t
}
class Square<D,C>(val x:D,val y:C){
    fun getDiameter():D{
        return x
    }
    fun getCircum():C{
        return y
    }
}
/*
class Box(t:Int){
    val something = t
}
class BoxS(t:String){
    val something = t
}*/
