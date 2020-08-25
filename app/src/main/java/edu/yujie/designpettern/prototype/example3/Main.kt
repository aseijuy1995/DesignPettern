package edu.yujie.designpettern.prototype.example3

/**
 * @author YuJie on 2020/8/25
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val codeEditer = CodeEditer(code = "123", explanatoryNote = arrayListOf("1", "2", "3"))
    val sb =
        String.format("code:%s, explanatoryNote:%s", codeEditer.code, codeEditer.explanatoryNote)
    println(sb)

    val codeEditerCopy = codeEditer.clone() as CodeEditer
    codeEditerCopy.code = "456"

    val sbCopy = String.format(
        "code:%s, explanatoryNote:%s",
        codeEditerCopy.code,
        codeEditerCopy.explanatoryNote
    )
    println(sbCopy)

    println("-----------------")
    val sbDefault =
        String.format("code:%s, explanatoryNote:%s", codeEditer.code, codeEditer.explanatoryNote)
    println(sbDefault)

}