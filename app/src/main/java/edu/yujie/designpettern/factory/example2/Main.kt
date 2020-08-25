package edu.yujie.designpettern.factory.example2

/**
 * @author YuJie on 2020/8/22
 * @describe 說明
 * @param 參數
 */

fun main(args: Array<String>) {
    val fruitFactory = FruitFactory()
    val apple = fruitFactory.createFactory("apple")
    apple.harvest()

    val factory = FruitFactory2()
    val apple2 = factory.createApp()
    apple2.harvest()

    val apple3 = FruitFactory3.createApp()
    apple3.harvest()
}