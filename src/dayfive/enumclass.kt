/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */

package dayfive

//Special Class(enum class)

fun main() {
    val s = Speed.FAST
    when(s){
        Speed.FAST-> println("Fast")
        Speed.SLOW-> println("Fast")
        Speed.MIDDLE-> println("Fast")
    }
    val c = Color.BLUE
    when(c){
        Color.RED-> println("The color rgb value is${Color.RED.rgb}")
        Color.GREEN-> println("The color rgb value is${Color.GREEN.rgb}")
        Color.BLUE-> println("The color rgb value is${Color.BLUE.rgb}")
    }
    
}
enum class Speed{
    FAST,SLOW,MIDDLE
}
enum class Color(val rgb:Int){
    RED(0xFF0000),GREEN(0x00FF00),BLUE(0x0000FF)
}
enum class DrvingTest(var passLincene:Boolean,var passDrive:Boolean){
    PASS(true,true),
    CANDRIVE(false,true),
    CANNOTDRIVE(false,false)
}