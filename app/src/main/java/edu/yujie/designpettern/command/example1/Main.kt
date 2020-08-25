package edu.yujie.designpettern.command.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val light = Light()
    val turnOn = TurnOn(light)
    val turnOff = TurnOff(light)
    val brighter = Brighter(light)
    val darker = Darker(light)

    val invoker = Invoker()
    invoker.addCommand(turnOn)
    invoker.addCommand(turnOff)
    invoker.addCommand(brighter)
    invoker.addCommand(darker)
    invoker.execute()
}