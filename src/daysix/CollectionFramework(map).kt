/*
 * Copyright © 2020
 * 1 . 26 . 2
 * Yannaing Lynn
 * All right reserved
 */

package daysix

import kotlin.random.Random

//Collection Framework
//Map
fun main() {
    //immutable map
    val im = mapOf<String,Int>("one" to 1,"two" to 2)
    //println(im.get("one"))
    //println(im["two"])
    val m = mutableMapOf<String,String>(
        "Mg Mg" to "U Ba",
        "Hla Hla" to "U Mya",
        "Ag Ag" to "U Sein"
    )
    m.put("Than Than","U Han")
    m["Zaw Zaw"] = "U Ngwe"

    println(m["Mg Mg"])
    for (i in m){
        println(i.value)
    }
    val s1 = Student("Kyaw San Linn",8)
    val s2 = Student("Kyaw Linn",8)
    val s3 = Student("Kyaw San ",8)
    val resultList = mutableMapOf<Student,Mark>(
        s1 to Mark(240,40),
        s2 to Mark(230,50),
        s3 to Mark(260,60)
    )
    for (i in resultList){
        println("${i.key.name} get ${i.value.myanmarMark}")
    }

}
data class Student(val name:String,val grade:Int)
data class Mark(val total:Int,val myanmarMark:Int)