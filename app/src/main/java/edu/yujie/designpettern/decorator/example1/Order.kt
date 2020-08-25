package edu.yujie.designpettern.decorator.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

open class Order {
    open fun show() {}
}

open class Item : Order() {
    private var order: Order? = null

    fun decorate(order: Order) {
        this.order = order
    }

    override fun show() {
        order?.show()
    }
}

class Drink : Item() {
    private fun addDrink() {
        println("一杯飲料")
    }

    override fun show() {
        super.show()
        addDrink()
    }
}

class Salad : Item() {
    fun addSalad() {
        println("一份沙拉")
    }

    override fun show() {
        super.show()
        addSalad()
    }
}

class MainMeal : Item() {
    fun addMainMeal() {
        println("一份主餐")
    }

    override fun show() {
        super.show()
        addMainMeal()
    }
}

class Soup : Item() {
    fun addSoup() {
        println("一份湯品")
    }

    override fun show() {
        super.show()
        addSoup()
    }
}
