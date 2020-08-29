package edu.yujie.designpettern.mediator.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */

abstract class Mediator {
    abstract fun forward(msg: String, colleague: Colleague)
}

class ConcreteMediator : Mediator() {
    var colleagueA: Colleague? = null
    var colleagueB: Colleague? = null

    override fun forward(msg: String, colleague: Colleague) {
        when (colleague) {
            colleagueA -> colleagueA?.receive(msg)
            colleagueB -> colleagueB?.receive(msg)
        }
    }

}