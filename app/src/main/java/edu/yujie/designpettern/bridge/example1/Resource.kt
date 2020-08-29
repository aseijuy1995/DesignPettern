package edu.yujie.designpettern.bridge.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
interface Resource {
    fun photo()

    fun snippet()

    fun describe()
}

class Book : Resource {
    override fun photo() {
        println("書本的照片")
    }

    override fun snippet() {
        println("書本的簡短說明")
    }

    override fun describe() {
        println("書本的詳細說明")
    }
}

class Bag : Resource {
    override fun photo() {
        println("背包的照片")
    }

    override fun snippet() {
        println("背包的簡短說明")
    }

    override fun describe() {
        println("背包的詳細說明")
    }
}