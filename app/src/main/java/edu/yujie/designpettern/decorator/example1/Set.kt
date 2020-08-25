package edu.yujie.designpettern.decorator.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
open class Set : Order() {
    var order: Order? = null

    fun decorator(order: Order?) {
        this.order = order
    }

    override fun show() {
        super.show()
        order?.show()
    }
}

class SimpleSet : Set() {
    private fun addSet() {
        val drink = Drink()
        val salad = Salad()
        val mainMeal = MainMeal()

        drink.decorate(order ?: Order().also { order = it })
        salad.decorate(drink)
        mainMeal.decorate(salad)
        decorator(mainMeal)
    }

    override fun show() {
        addSet()
        super.show()
    }
}