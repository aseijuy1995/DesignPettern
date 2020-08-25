package edu.yujie.designpettern.strategy.example1

/**
 * @author YuJie on 2020/8/23
 * @describe 說明
 * @param 參數
 */
class Caculator {
    private lateinit var iStrategy: IStrategy

    fun setStrategy(doType: DoType) {
        iStrategy = when (doType) {
            DoType.Plus -> Plus()
            DoType.Less -> Less()
            DoType.Multiply -> Multiply()
            DoType.Except -> Except()
        }
    }

    fun execute(a: Int, b: Int) :Int = iStrategy.caculate(a, b)

    enum class DoType {
        Plus, Less, Multiply, Except
    }
}