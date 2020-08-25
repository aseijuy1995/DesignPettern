package edu.yujie.designpettern.command.example3

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {

    val orderCommandProcessor = OrderCommandProcessor()

    orderCommandProcessor.apply {
        addToQueue(AddOrderCommand("1"))
        addToQueue(AddOrderCommand("2"))
        addToQueue(PayOrderCommand("1"))
        addToQueue(PayOrderCommand("2"))
    }.processCommand()
}