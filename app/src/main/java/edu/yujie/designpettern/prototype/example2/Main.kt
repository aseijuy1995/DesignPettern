package edu.yujie.designpettern.prototype.example2

/**
 * @author YuJie on 2020/8/25
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val email = Email("abc@gmail.com", "Hello", "Don't know what to write.")

    val emailCopy = email.copy("other@gmail.com")
    println("email:$email")
    println("emailCopy:$emailCopy")
}