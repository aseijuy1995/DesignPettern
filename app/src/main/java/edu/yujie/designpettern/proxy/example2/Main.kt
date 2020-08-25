package edu.yujie.designpettern.proxy.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val baseImpl = BaseImpl(10)
    val derived = Derived(baseImpl)
    derived.print()
}