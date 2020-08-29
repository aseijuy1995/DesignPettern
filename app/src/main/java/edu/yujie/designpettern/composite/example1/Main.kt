package edu.yujie.designpettern.composite.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {

    val big = Composite("大公司")

    val mid1 = Composite("子公司1")
    val mid2 = Composite("子公司2")
    big.add(mid1)
    big.add(mid2)

    val small1 = Left("部門1")
    val small2 = Left("部門2")
    mid1.add(small1)
    mid1.add(small2)

    val small3 = Left("部門3")
    val small4 = Left("部門4")
    mid1.add(small3)
    mid1.add(small4)

    val small5 = Left("部門5")
    small1.add(small5)

    println("大公司")
    big.display(1)
    big.commend("開發快一點")
    println("--------------------------")
    println("子公司")
    mid1.display(1)
    mid1.commend("大老闆說Q4要完成")


}