package edu.yujie.designpettern.mediator.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
abstract class CoWorker(val name: String) {
    var boss: Boss? = null

    abstract fun work()
}

class PM(name: String) : CoWorker(name) {
    override fun work() {
        println("$name, 做PM工作")
    }

    fun bossHelp(coWorker: CoWorker) {
        boss?.giveWork(coWorker)
    }
}

class Programmer(name: String) : CoWorker(name) {
    override fun work() {
        println("$name, 寫程式")
    }
}
