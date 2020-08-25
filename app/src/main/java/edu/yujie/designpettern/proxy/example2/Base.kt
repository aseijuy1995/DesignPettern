package edu.yujie.designpettern.proxy.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        println(x)
    }
}

class Derived(b: Base) : Base by b