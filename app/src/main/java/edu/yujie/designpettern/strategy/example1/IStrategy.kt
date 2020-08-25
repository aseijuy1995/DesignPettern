package edu.yujie.designpettern.strategy.example1

/**
 * @author YuJie on 2020/8/23
 * @describe 說明
 * @param 參數
 */

interface IStrategy {
    fun caculate(a: Int, b: Int): Int
}

class Plus : IStrategy {
    override fun caculate(a: Int, b: Int): Int {
        return a + b
    }
}

class Less : IStrategy {
    override fun caculate(a: Int, b: Int): Int {
        return a - b
    }
}

class Multiply : IStrategy {
    override fun caculate(a: Int, b: Int): Int {
        return a * b
    }
}

class Except : IStrategy {
    override fun caculate(a: Int, b: Int): Int {
        return a / b
    }
}