package edu.yujie.designpettern.command.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

class Invoker {
    private val list = arrayListOf<ICommandTetris>()

    fun addTetris(iCommandTetris: ICommandTetris) {
        list.add(iCommandTetris)
    }

    fun execute() {
        list.forEach {
            it.execute()
        }
    }

}