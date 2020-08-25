package edu.yujie.designpettern.command.example3

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
class OrderCommandProcessor {
    private val queue = arrayListOf<OrderCommand>()

    fun addToQueue(orderCommand: OrderCommand) = apply {
        queue.add(orderCommand)
    }

    fun processCommand() = apply {
        queue.forEach { it.execute() }
        queue.clear()
    }
}