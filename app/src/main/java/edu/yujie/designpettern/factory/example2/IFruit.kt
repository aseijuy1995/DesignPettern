package edu.yujie.designpettern.factory.example2

import edu.yujie.designpettern.getMethodName

/**
 * @author YuJie on 2020/8/22
 * @describe 說明
 * @param 參數
 */

interface IFruit {
    val TAG: String
        get() = javaClass.simpleName

    val price: Double

    fun grow()

    fun harvest()
}

class Apple(override val price: Double, val color: String) : IFruit {
    override fun grow() {
        println("$TAG:${getMethodName()}")
    }

    override fun harvest() {
        println("$TAG:${getMethodName()}, color:$color")
    }
}

class Banana(override val price: Double) : IFruit {
    override fun grow() {
        println("$TAG:${getMethodName()}")
    }

    override fun harvest() {
        println("$TAG:${getMethodName()}")
    }
}

class Grape(override val price: Double, val seed: Boolean) : IFruit {
    override fun grow() {
        println("$TAG:${getMethodName()}")
    }

    override fun harvest() {
        println("$TAG:${getMethodName()}, seed=$seed")
    }
}