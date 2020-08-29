package edu.yujie.designpettern.flyweight.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */

abstract class Factory {
    protected val flyweightMap = hashMapOf<String, Flyweight>()

    abstract fun getFlyweight(key: String): Flyweight

    abstract fun getWebsiteCount(): Int
}


class FlyweightFactory : Factory() {
    init {
        flyweightMap["1"] = ConcreteFlyweight()
        flyweightMap["2"] = ConcreteFlyweight()
        flyweightMap["3"] = ConcreteFlyweight()
    }

    override fun getFlyweight(key: String): Flyweight {
        if (flyweightMap.contains(key)) {
            return flyweightMap[key]!!
        }
        return UnsharedConcreteFlyweight().also {
            flyweightMap[key] = it
        }
    }

    override fun getWebsiteCount() = flyweightMap.size


}