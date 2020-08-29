package edu.yujie.designpettern.mediator.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
interface Company {
    fun addMember(coWorker: CoWorker)

    fun introduce(coWorker: CoWorker)

    fun workHard()

    fun giveWork(coWorker: CoWorker)
}

class Boss : Company {
    private val coWorkers = arrayListOf<CoWorker>()

    override fun addMember(coWorker: CoWorker) {
        coWorkers.add(coWorker)
        coWorker.boss = this
    }

    override fun introduce(coWorker: CoWorker) {
        println("Boss跟大家介紹這位是${coWorker.name}")
    }

    override fun workHard() {
        coWorkers.forEach {
            println("Boss:${it.name}認真點做啊!")
        }
    }

    override fun giveWork(coWorker: CoWorker) {
        println("Boss:${coWorker.name}這個幫忙一下")
    }

}