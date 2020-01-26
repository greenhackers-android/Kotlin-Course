/*
 * Copyright © 2020
 * 1 . 26 . 2
 * Yannaing Lynn
 * All right reserved
 */

package daysix
//Collection Framework
//Set (Unduplicated items)
fun main() {
    val fruits = setOf("Apple","Orange","Orange","Grape Fruit","Avogado")
    val juices = listOf("Strawberry","BlueBerry","Blackberry","Wine","BlueBerry")
    for (i in fruits) println(i)
    for (i in juices) println(i)
    val fru = mutableSetOf(5,67,2,4)
    fru.add(9)
    fru.remove(5)
    fru.clear()
    val personList = arrayOf(
        Person("Mg Mg",50,"Developer"),
        Person("U Ba",90,"Developer")
    )
    for (i in personList) println(i.name)
    val mdArr = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(7,8,9)
    )
    val md = arrayOf(
        arrayOf(
            arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9)
        ),
        arrayOf(
            arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9)
        ),
        arrayOf(
            arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9)
        )
    )


}
data class Person(val name:String,val age:Int,val work:String)


