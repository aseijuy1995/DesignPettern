package edu.yujie.designpettern.mediator.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {

    val boss = Boss()
    val wei = PM("小偉")
    val bad = Programmer("小惡")
    val good = Programmer("阿仁")

    boss.apply {
        addMember(wei)
        addMember(bad)
        addMember(good)

        introduce(bad)
    }

    good.work()

    boss.workHard()

    wei.bossHelp(bad)
}