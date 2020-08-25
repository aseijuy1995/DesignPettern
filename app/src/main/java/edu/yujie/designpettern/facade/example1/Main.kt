package edu.yujie.designpettern.facade.example1

fun main(args: Array<String>) {
    val facade = Facade()
    println("MethodA:")
    facade.methodA()
    println("MethodB:")
    facade.methodB()
}