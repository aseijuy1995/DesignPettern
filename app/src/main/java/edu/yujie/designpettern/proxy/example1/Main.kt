package edu.yujie.designpettern.proxy.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val littleEngineer = LittleEngineer()
    val estateAgent = EstateAgent(littleEngineer)

    estateAgent.findHouse()
    estateAgent.priceTooHigh()
    estateAgent.defendPrice()
    estateAgent.finish()
}