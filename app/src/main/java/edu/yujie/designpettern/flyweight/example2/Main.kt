package edu.yujie.designpettern.flyweight.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val factory = FlyweightFactory()
    val extrinsicstate = 22
    factory.getFlyweight("1").operation(extrinsicstate)
    factory.getFlyweight("2").operation(extrinsicstate)
    factory.getFlyweight("3").operation(extrinsicstate)
    factory.getFlyweight("3").operation(extrinsicstate)
    println("count:${factory.getWebsiteCount()}")
    println("--------------------------")
    factory.getFlyweight("4").operation(extrinsicstate)
    println("count:${factory.getWebsiteCount()}")

}