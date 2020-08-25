package edu.yujie.designpettern.singleton.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
abstract class Factory {
    abstract fun getProduct(): Product
}

class SingletonFactory {
    companion object {
        fun getColaFactory() = ColaFactory.instance

        fun getHumbergerFactory() = HumbergerFactory.instance
    }

    class ColaFactory private constructor() : Factory() {
        companion object {
            var instance = ColaFactory()
        }

        override fun getProduct(): Product = Cola()
    }

    class HumbergerFactory private constructor() : Factory() {
        companion object {
            var instance = HumbergerFactory()
        }

        override fun getProduct(): Product = Humberger()
    }
}