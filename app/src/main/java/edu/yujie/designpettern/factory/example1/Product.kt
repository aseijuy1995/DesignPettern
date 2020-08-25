package edu.yujie.designpettern.factory.example1

/**
 * @author YuJie on 2020/8/22
 * @describe 說明
 * @param 參數
 */

interface Product {
    fun describe()
}

class FrenchFries(val state: String = "有鹽巴") : Product {
    override fun describe() {
        println("我是${state}薯條")
    }
}