package edu.yujie.designpettern.decorator.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

fun main(args: Array<String>) {
    //order
    val order = Order()
    val drink = Drink()
    val salad = Salad()
    val mainMeal = MainMeal()

    drink.decorate(order)
    salad.decorate(drink)
    mainMeal.decorate(salad)
    mainMeal.show()
    println("--------------------------")
    //set
    val simpleSet = SimpleSet()
    simpleSet.show()
}