package edu.yujie.designpettern.chainofresponsibility.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val handler1 = Handler1()
    val handler2 = Handler2()
    handler1.setAbstractHandler(handler2)

    val testNumber = intArrayOf(4, 10, 59, 2, 16)
    testNumber.forEach {
        handler1.request(it)
    }
}