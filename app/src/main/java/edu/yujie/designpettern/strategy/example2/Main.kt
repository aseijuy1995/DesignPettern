package edu.yujie.designpettern.strategy.example2

/**
 * @author YuJie on 2020/8/23
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val priceCalculator = PriceCalculator()
    priceCalculator.setStrategy(MRTStrategy())
    val price = priceCalculator.execute(30)
    println("price:$price")
}