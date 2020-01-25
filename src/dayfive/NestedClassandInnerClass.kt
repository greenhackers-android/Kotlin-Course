/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */

package dayfive/*
 * Copyright © 2020 Yannaing Lynn
 * All right reserved
 */

fun main() {
    //nested class
    val c = Ocean.River.Creek()
    c.name
    val r = Ocean.River()
    r.name

    //inner class
    val i = MainClass().InnerClass()
}
//Nested Class
class Ocean{
    var name = "Pacific"
    class River{
        var name = "Ayarwady"
        class Creek{
            var name = "Ngamoeyeik"
            fun hasWater() = true
        }
    }
}

//Inner Class
class MainClass{
    var name = "dayfive.Hello"
    inner class InnerClass{
        var age = 90
    }
}

