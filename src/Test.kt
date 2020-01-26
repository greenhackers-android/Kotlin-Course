import dayfive.Ship
import daysix.Hi.Companion.sayHello
import java.util.*


/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */

fun main() {
    /*val s = object : Ship {
        override var hasFlag = false
        override var hasName = false
    }*/
    //sayHello()
    val sc = Scanner(System.`in`)
    while (true){
        val uNum = sc.nextInt()
        val d = mutableListOf<String>()
        for (i in 0..99){
            if (i<10) d.add("0$i") else d.add("$i")
        }
        val r = Random().nextInt(100)

        val okNum = if (r <10) "0$r" else "$r"
        if (okNum == uNum.toString()){
            println("You win")
        }else println("You lose")

    }

    /*val s = listOf(1,2,-6,3,-8,7)
    val s2 = s.filter { it<0 }
    for (i in s2) println(i)*/

}


