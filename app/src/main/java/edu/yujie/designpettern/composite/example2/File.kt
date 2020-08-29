package edu.yujie.designpettern.composite.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
class File(private val name: String, private val size: Int) : Entry() {
    override fun getName() = name

    override fun getSize() = size

    override fun printList(prefix: String) {
        println("$prefix/$this")
    }
}