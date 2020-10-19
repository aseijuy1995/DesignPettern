package edu.yujie.designpettern.abstractfactory.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val jeepFactory = JeepFactory()
    val audiJeep = jeepFactory.createAudi()
    println("${audiJeep.brand}:${audiJeep.type}")
    val bmwJeep = jeepFactory.createBMW()
    println("${bmwJeep.brand}:${bmwJeep.type}")
    println("--------------------------")
    val suvFactory = SUVFactory()
    val audiSUV = suvFactory.createAudi()
    println("${audiSUV.brand}:${audiSUV.type}")
    val bmwSUV = suvFactory.createBMW()
    println("${bmwSUV.brand}:${bmwSUV.type}")
}