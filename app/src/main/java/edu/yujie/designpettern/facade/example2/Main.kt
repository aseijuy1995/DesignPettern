package edu.yujie.designpettern.facade.example2

fun main(args: Array<String>) {
    val userRepository = UserRepository()
    userRepository.save(User("sodlinken"))

    val user = userRepository.findFirst()
    println("user:$user")
}