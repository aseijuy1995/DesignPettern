package edu.yujie.designpettern.composite.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */

abstract class Entry {
    abstract fun getName(): String

    abstract fun getSize(): Int

    open fun add(e: Entry) {}

    fun printList() {
        printList("")
    }

    abstract fun printList(prefix: String)

    override fun toString() = "${getName()} (${getSize()})"
}
