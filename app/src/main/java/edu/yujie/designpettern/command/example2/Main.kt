package edu.yujie.designpettern.command.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val tetris = Tetris()
    val turnLeft = TurnLeft(tetris)
    val turnRight = TurnRight(tetris)
    val straightDown = StraightDown(tetris)

    val invoker = Invoker()
    invoker.addTetris(turnLeft)
    invoker.addTetris(turnRight)
    invoker.addTetris(straightDown)

    invoker.execute()
}