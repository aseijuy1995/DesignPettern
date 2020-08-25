package edu.yujie.designpettern.strategy.example2

/**
 * @author YuJie on 2020/8/23
 * @describe 說明
 * @param 參數
 */
class PriceCalculator {
    private lateinit var iStrategy: IStrategy

    fun setStrategy(iStrategy: IStrategy) {
        this.iStrategy = iStrategy
    }

    fun execute(km: Int) :Int = iStrategy.calculate(km)
}