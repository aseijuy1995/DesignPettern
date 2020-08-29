package edu.yujie.designpettern.bridge.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
abstract class Shape(drawAPI: DrawAPI) {
    abstract fun draw()
}

class Circle(val x: Int, val y: Int, val radius: Int, val drawAPI: DrawAPI) : Shape(drawAPI) {
    override fun draw() {
        drawAPI.drawCircle(x, y, radius)
    }
}

class Square(val x: Int, val y: Int, val drawAPI: DrawAPI) : Shape(drawAPI) {
    override fun draw() {
        drawAPI.drawSquare(x, y)
    }
}