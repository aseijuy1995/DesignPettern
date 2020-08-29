package edu.yujie.designpettern.chainofresponsibility.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
abstract class AbstractHandler {
    lateinit var abstractHandler: AbstractHandler
        private set

    fun setAbstractHandler(abstractHandler: AbstractHandler) {
        this.abstractHandler = abstractHandler
    }

    abstract fun request(requestNumber: Int)
}

class Handler1 : AbstractHandler() {
    override fun request(requestNumber: Int) {
        when {
            requestNumber < 10 -> println("我是handler1,我處理了請求$requestNumber")
            else -> abstractHandler.request(requestNumber)
        }
    }
}

class Handler2 : AbstractHandler() {
    override fun request(requestNumber: Int) {
        when {
            requestNumber > 10 -> println("我是handler2,我處理了請求$requestNumber")
            else -> println("請求$requestNumber 沒人能處理")
        }
    }
}