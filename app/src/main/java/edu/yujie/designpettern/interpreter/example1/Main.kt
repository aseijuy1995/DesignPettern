package edu.yujie.designpettern.interpreter.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val browserContext = BrowserContext()

    val terminalExpression = TerminalExpression()
    val nonterminalExpression = NonterminalExpression()

    terminalExpression.interpret(browserContext)
    nonterminalExpression.interpret(browserContext)
}