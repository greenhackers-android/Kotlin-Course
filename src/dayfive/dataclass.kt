/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */

package dayfive
//Special Class(Data class)
fun main() {
    val s1 = Student("Mg Mg","13")
    val s2 = Student("Mg Mg","13")
    val s3 = Student("Mg Mg","13")
    val s4 = Student("Mg Mg","13")
    println(s1.name)

}

data class Student(val name:String,val age:String){

}
