package edu.yujie.designpettern.memoto.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val originator = Originator()
    originator.showState()
    originator.createMemoto()

    originator.setState("off")
    originator.showState()

    originator.recoveryState()
    originator.showState()
}