package edu.yujie.designpettern.composite.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
abstract class Component(val name: String) {
    private val componentList = arrayListOf<Component>()

    open fun add(c: Component) {
        componentList.add(c)
    }

    open fun remove(c: Component) {
        componentList.remove(c)
    }

    open fun display(depth: Int) {
        for (i in 0..depth) {
            print("-")
        }
        println(name)
        componentList.forEach {
            it.display(depth + 2)
        }
    }

    open fun commend(commend: String) {
        println("$name $commend")
        componentList.forEach {
            it.commend(commend)
        }
    }
}


class Composite(name: String) : Component(name)

class Left(name: String) : Component(name) {
    override fun add(c: Component) {
        println("Leaf cant add component")
    }

    override fun remove(c: Component) {
        println("Leaf cant remove component")
    }
}