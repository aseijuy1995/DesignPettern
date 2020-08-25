package edu.yujie.designpettern.state.example2

fun main(args: Array<String>) {

    val userManager = UserManager()
    userManager.collect { }
    userManager.share { }
    userManager.edit { }
    userManager.delete { }
    println("--------------------------")
    userManager.setUserState(Normal())
    userManager.collect { }
    userManager.share { }
    userManager.edit { }
    userManager.delete { }
    println("--------------------------")
    userManager.setUserState(Admin())
    userManager.collect { }
    userManager.share { }
    userManager.edit { }
    userManager.delete { }
}