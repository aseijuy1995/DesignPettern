package edu.yujie.designpettern.command.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

abstract class ICommandTetris(protected val tetris: Tetris) {
    abstract fun execute()
}

class TurnLeft(tetris: Tetris) : ICommandTetris(tetris) {
    override fun execute() {
        tetris.turnLeft()
    }
}

class TurnRight(tetris: Tetris) : ICommandTetris(tetris) {
    override fun execute() {
        tetris.turnRight()
    }
}

class StraightDown(tetris: Tetris) : ICommandTetris(tetris) {
    override fun execute() {
        tetris.straightDown()
    }
}

