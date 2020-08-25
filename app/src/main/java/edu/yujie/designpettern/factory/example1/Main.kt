package edu.yujie.designpettern.factory.example1

/**
 * @author YuJie on 2020/8/22
 * @describe 說明
 * @param 參數
 */

fun main(args: Array<String>) {
    val frenchFriesFactory = FrenchFriesFactory()

    val frenchFries = frenchFriesFactory.getProduct()
    frenchFries.describe()

    val frenchFries2 = frenchFriesFactory.getProduct("無鹽")
    frenchFries2.describe()
}