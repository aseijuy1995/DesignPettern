package edu.yujie.designpettern.memoto.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {

    val computerCareTaker = ComputerCareTaker()
    val computerOriginator = ComputerOriginator()

    computerCareTaker.saveMemoto(computerOriginator.save())
    println("system:${computerCareTaker.getSave(0).system}")
    println("hardisk:${computerCareTaker.getSave(0).hardisk}")
    println("userDoc:${computerCareTaker.getSave(0).userDoc}")
    println("userApp:${computerCareTaker.getSave(0).userApp}")
    println("--------------------------")
    computerOriginator.system = "window"
    computerOriginator.hardisk = "hdd"
    computerOriginator.userDoc = "desk2"
    computerOriginator.userApp = "android"
    computerCareTaker.saveMemoto(computerOriginator.save())
    println("system:${computerCareTaker.getSave(1).system}")
    println("hardisk:${computerCareTaker.getSave(1).hardisk}")
    println("userDoc:${computerCareTaker.getSave(1).userDoc}")
    println("userApp:${computerCareTaker.getSave(1).userApp}")
    println("--------------------------")
    println("system:${computerOriginator.system}")
    println("hardisk:${computerOriginator.hardisk}")
    println("userDoc:${computerOriginator.userDoc}")
    println("userApp:${computerOriginator.userApp}")
    println("--------------------------")
    computerOriginator.restore(computerCareTaker.getSave(0))
    println("system:${computerOriginator.system}")
    println("hardisk:${computerOriginator.hardisk}")
    println("userDoc:${computerOriginator.userDoc}")
    println("userApp:${computerOriginator.userApp}")


}