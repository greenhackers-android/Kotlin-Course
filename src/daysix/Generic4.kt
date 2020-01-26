/*
 * Copyright © 2020
 * 1 . 26 . 3
 * Yannaing Lynn
 * All right reserved
 */

package daysix

//Covariance
//Covariance ဆိုရင် out ကိုသုံး လက်သည်းကွင်းရဲ့ အထဲမှာပဲ
//implement လုပ်လိုရတယ်။လက်သည်းကွင်းရဲ့မပြင်က object က super
interface Source<out T>{
    fun next():T
    //fun previous(t: T)
}
fun demo(s:Source<Int>){
    val o:Source<Number> = s
}

//Contra-variance
interface Comparable<in T>{
    //fun next():T ဒီလိုမရဘူး
    fun next(t:T)
}

fun demoC(c:Comparable<Number>){
    val o:Comparable<Int> = c
}