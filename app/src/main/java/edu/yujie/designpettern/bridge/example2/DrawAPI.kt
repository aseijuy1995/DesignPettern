package edu.yujie.designpettern.bridge.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */

interface DrawAPI {
    fun drawCircle(x: Int, y: Int, radius: Int)

    fun drawSquare(x: Int, y: Int)
}


class Yellow : DrawAPI {
    override fun drawCircle(x: Int, y: Int, radius: Int) {
        println("Draw Circle Yellow radius:$radius  x:$x y:$y")
    }

    override fun drawSquare(x: Int, y: Int) {
        println("Draw Square Yellow x:$x y:$y")
    }
}