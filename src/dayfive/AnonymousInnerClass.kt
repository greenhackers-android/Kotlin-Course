/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */

package dayfive/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */


fun main() {
    val s2 = Ship2()
    s2.hasFlag
    //anonymous inner class
    val s3 = object : Ship, Moving(){
        override var hasFlag = true
        override var hasName = true
    }
    s3.hasFlag
}
interface Ship{
    var hasFlag:Boolean
    var hasName:Boolean
}
class Ship2: Ship {
    override var hasFlag = true
    override var hasName = true
}
open class Moving