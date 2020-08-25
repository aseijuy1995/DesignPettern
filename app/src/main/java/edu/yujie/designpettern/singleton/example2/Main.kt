package edu.yujie.designpettern.singleton.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

fun main(args: Array<String>) {

    val colaFactory = SingletonFactory.getColaFactory()
    val cola = colaFactory.getProduct()
    println("cola.getName():${cola.getName()}")

    val humbergerFactory = SingletonFactory.getHumbergerFactory()
    val humberger = humbergerFactory.getProduct()
    println("humberger.getName():${humberger.getName()}")
}