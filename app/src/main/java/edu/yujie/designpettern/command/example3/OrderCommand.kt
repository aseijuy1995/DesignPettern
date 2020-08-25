package edu.yujie.designpettern.command.example3

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
interface OrderCommand {
    fun execute()
}

class AddOrderCommand(val id: String) : OrderCommand {
    override fun execute() {
        println("AddorderCommand:$id")
    }
}

class PayOrderCommand(val id: String) : OrderCommand {
    override fun execute() {
        println("PayOrderCommand:$id")
    }
}