package edu.yujie.designpettern.flyweight.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
abstract class Flyweight {
    abstract fun operation(extrinsicstate: Int)
}

class ConcreteFlyweight : Flyweight() {
    override fun operation(extrinsicstate: Int) {
        println("具體Flyweight:$extrinsicstate")
    }
}

class UnsharedConcreteFlyweight : Flyweight() {
    override fun operation(extrinsicstate: Int) {
        println("不共享的具體Flyweight:$extrinsicstate")
    }
}