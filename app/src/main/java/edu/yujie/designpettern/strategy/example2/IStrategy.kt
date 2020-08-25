package edu.yujie.designpettern.strategy.example2

/**
 * @author YuJie on 2020/8/23
 * @describe 說明
 * @param 參數
 */

interface IStrategy {
    fun calculate(km: Int): Int
}

class BusStrategy : IStrategy {
    override fun calculate(km: Int): Int {
//        一段票15元
//        十公里內一段票，超過十公里兩段票
        return when {
            km > 10 -> 15 * 2
            else -> 15 * 1
        }
    }
}

class MRTStrategy : IStrategy {
    override fun calculate(km: Int): Int {
//        小於十公里20元，超過每五公里五元
        return when {
            km < 10 -> 20
            else -> 20 + (((km - 10) / 5) + 1) * 5
        }
    }

}