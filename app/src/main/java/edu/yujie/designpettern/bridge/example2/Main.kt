package edu.yujie.designpettern.bridge.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val yellow = Yellow()
    val circle = Circle(100, 50, 50, yellow)
    circle.draw()

    val square = Square(100, 50, yellow)
    square.draw()
}