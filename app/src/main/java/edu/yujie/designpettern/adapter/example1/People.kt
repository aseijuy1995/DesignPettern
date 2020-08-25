package edu.yujie.designpettern.adapter.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
abstract class People(val name: String) {
    abstract fun hello()

    abstract fun selfIntro()
}

class BlackmanTranslator(name: String) : People(name) {
    override fun hello() {
        println("$name:哩甲霸咩～真的假的！？")
    }

    override fun selfIntro() {
        println("大家好我是$name，現在台北工作。")
    }
}