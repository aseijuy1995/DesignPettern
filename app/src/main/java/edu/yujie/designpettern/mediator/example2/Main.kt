package edu.yujie.designpettern.mediator.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val concreteMediator = ConcreteMediator()
    val concreteColleagueA = ConcreteColleagueA(concreteMediator)
    val concreteColleagueB = ConcreteColleagueB(concreteMediator)

    concreteMediator.colleagueA = concreteColleagueA
    concreteMediator.colleagueB = concreteColleagueB
    concreteColleagueA.send("在幹嘛呢")
    concreteColleagueB.send("在發呆呀")
}