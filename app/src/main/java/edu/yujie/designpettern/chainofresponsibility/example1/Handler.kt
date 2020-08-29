package edu.yujie.designpettern.chainofresponsibility.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
abstract class Handler {
    protected var successor: Handler? = null

    abstract fun handleRequest(trouble: Trouble)
}

class Manager : Handler() {
    init {
        successor = CEO()
    }

    override fun handleRequest(trouble: Trouble) {
        when {
            trouble.code > 1000 -> successor?.handleRequest(trouble)
            else -> println("Manager:${trouble.name}是小問題,不用擔心")
        }
    }
}

class CEO : Handler() {
    override fun handleRequest(trouble: Trouble) {
        println("CEO:${trouble.name}是誰搞的鬼,叫他過來!")
    }
}