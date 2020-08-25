package edu.yujie.designpettern.command.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
class Invoker {
    private val list = arrayListOf<Command>()

    fun addCommand(command: Command) {
        list.add(command)
    }

    fun execute() {
        for (command in list) {
            command.execute()
        }
    }
}