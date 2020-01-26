/*
 * Copyright © 2020
 * 1 . 26 . 1
 * Yannaing Lynn
 * All right reserved
 */

package daysix

import java.lang.ArithmeticException
import java.lang.Exception
import kotlin.test.fail

//Collection Framework
//List
//ordered items(mutable,immutable)
fun main() {
    //immutable List
    val names = listOf("Mg Mg","U Ba","Daw Hla")
    //for (i in names) println(i)

    //mutable List
    val ages = mutableListOf(4,5,6,3,5,8)
    try {
        println(ages[3])
    }catch (i:Exception){
        //println(i.message)
    }finally {
        //println("Be patient Your list has not this value")
    }
    println("Hey")
    val s:String? = null
    val l = s?.length ?: throw Exception("No Value")
    fail(9)
}
fun fail(s:Any){
    if (s !is String) throw Exception("This is not String")
}

//Exception Handling

//try catch clause
//throw exception