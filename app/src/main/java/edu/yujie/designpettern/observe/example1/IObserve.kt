package edu.yujie.designpettern.observe.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
interface IObserve {
    fun update()
}

class Student(val name:String, val iObservable: IObservable) :
    IObserve {
    override fun update() {
        println("$name, 聽${(iObservable as PodcastA).name}")
    }
}