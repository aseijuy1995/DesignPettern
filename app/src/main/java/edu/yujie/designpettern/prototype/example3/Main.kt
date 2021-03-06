package edu.yujie.designpettern.prototype.example3

/**
 * @author YuJie on 2020/8/25
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val codeEditor = CodeEditor(code = "123", explanatoryNote = arrayListOf("1", "2", "3"))
    val sb =
        String.format("code:%s, explanatoryNote:%s", codeEditor.code, codeEditor.explanatoryNote)
    println(sb)

    val codeEditorCopy = codeEditor.clone() as CodeEditor
    codeEditorCopy.code = "456"

    val sbCopy = String.format(
        "code:%s, explanatoryNote:%s",
        codeEditorCopy.code,
        codeEditorCopy.explanatoryNote
    )
    println(sbCopy)

    println("--------------------------")
    val sbDefault =
        String.format("code:%s, explanatoryNote:%s", codeEditor.code, codeEditor.explanatoryNote)
    println(sbDefault)

}