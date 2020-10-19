package edu.yujie.designpettern.interpreter.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
abstract class AbstractExpression {
    abstract fun interpret(context: BrowserContext)
}

class TerminalExpression : AbstractExpression() {
    override fun interpret(context: BrowserContext) {
        println("終端的解譯器")
    }
}

class NonterminalExpression : AbstractExpression() {
    override fun interpret(context: BrowserContext) {
        println("非終端的解譯器")
    }
}