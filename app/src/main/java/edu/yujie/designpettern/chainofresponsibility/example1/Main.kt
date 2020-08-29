package edu.yujie.designpettern.chainofresponsibility.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val manager = Manager()
    val trouble = Trouble("想加薪500", 500)
    manager.handleRequest(trouble)
    println("--------------------------")

    val trouble2 = Trouble("搞壞50萬的機器", 500000)
    manager.handleRequest(trouble2)
}