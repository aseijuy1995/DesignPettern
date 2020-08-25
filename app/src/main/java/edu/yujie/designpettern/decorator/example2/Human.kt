package edu.yujie.designpettern.decorator.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

abstract class Human {
    open var description = "I'm a human."

    abstract fun getDress(): String
}

class Male: Human() {
    override var description: String
        get() = "我是男性"
        set(value) {}

    override fun getDress(): String  = "我穿了內褲"

}