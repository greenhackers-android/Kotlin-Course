/*
 * Copyright © 2020
 * 1 . 26 . 3
 * Yannaing Lynn
 * All right reserved
 */

package daysix

interface AddNum<V,T,S>{
    fun getNum():V
    val name:V
}
class Num:AddNum<Int,String,MyClass>{
    override fun getNum():Int{
        return 0
    }
    override val name = 0
}
class Str:AddNum<String,Long,MyClass>{
    override fun getNum(): String {
        return ""
    }
    override val name = ""
}
class MyClass