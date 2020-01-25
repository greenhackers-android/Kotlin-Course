/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */

package dayfive/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */
fun main() {

}

open class Hello(val a:Int){
   constructor(name:String,age:Int):this(age){
   }
}
class Hey(val i:Int,val name:String,skin:String): Hello(name,i){

}

