package edu.yujie.designpettern.mediator.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */

abstract class Colleague(mediator: Mediator) {
    abstract fun send(msg: String)

    abstract fun receive(msg: String)
}

class ConcreteColleagueA(private val mediator: Mediator) : Colleague(mediator) {
    override fun send(msg: String) {
        mediator.forward(msg, this)
    }

    override fun receive(msg: String) {
        println("${this::class.java.simpleName}收到消息,$msg")
    }
}

class ConcreteColleagueB(private val mediator: Mediator) : Colleague(mediator) {
    override fun send(msg: String) {
        mediator.forward(msg, this)
    }

    override fun receive(msg: String) {
        println("${this::class.java.simpleName}收到消息,$msg")
    }
}