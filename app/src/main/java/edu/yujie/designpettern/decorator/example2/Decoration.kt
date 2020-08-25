package edu.yujie.designpettern.decorator.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

abstract class Decoration : Human() {
    abstract override var description: String
}

class Hat(val human: Human) : Decoration() {
    override var description: String
        get() = "我有帽子"
        set(value) {}

    override fun getDress(): String = "${human.getDress()}帽子"

}