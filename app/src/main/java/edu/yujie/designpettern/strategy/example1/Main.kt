package edu.yujie.designpettern.strategy.example1

import edu.yujie.designpettern.strategy.example1.Caculator

/**
 * @author YuJie on 2020/8/23
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val caculator = Caculator()
    caculator.setStrategy(Caculator.DoType.Plus)
    val num = caculator.execute(1,2)
    println("num:$num")
}