package edu.yujie.designpettern.observe.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

interface IObservable {
    fun add(iObserve: IObserve)

    fun remove(iObserve: IObserve)

    fun updateAll()
}

class PodcastA : IObservable {
    private val set = mutableSetOf<IObserve>()
    var name = "英文廣播"

    override fun add(iObserve: IObserve) {
        set.add(iObserve)
    }

    override fun remove(iObserve: IObserve) {
        set.remove(iObserve)
    }

    override fun updateAll() {
        for (iObserve in set) {
            iObserve.update()
        }
    }

}