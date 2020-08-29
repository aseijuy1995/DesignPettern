package edu.yujie.designpettern.memoto.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
class Originator(private var state: String = "on") {
    private var caretaker = Caretaker()

    fun setState(state: String) {
        this.state = state
    }

    fun showState() = println("state:$state")

    fun createMemoto() {
        caretaker.setMemoto(Memoto(state))
    }

    fun recoveryState() {
        state = caretaker.getMemoto()?.state ?: state
    }
}