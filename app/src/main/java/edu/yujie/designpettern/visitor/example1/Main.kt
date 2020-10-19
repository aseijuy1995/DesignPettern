package edu.yujie.designpettern.visitor.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val temperture = Temperture()
    val airQuality = AirQuality()

    val man = Man()
    val woman = Woman()
    println("男生")
    man.visit(temperture)
    man.visit(airQuality)
    println("女生")
    woman.visit(temperture)
    woman.visit(airQuality)
}