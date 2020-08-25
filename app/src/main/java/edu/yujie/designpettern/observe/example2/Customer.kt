package edu.yujie.designpettern.observe.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
interface Customer{
    fun getTodaySpecial(todaySpecial:String)
}

class TheHospital:Customer{
    override fun getTodaySpecial(todaySpecial: String) {
        println("TheHospital get Today Special is $todaySpecial")
    }
}

class TheFireStation:Customer{
    override fun getTodaySpecial(todaySpecial: String) {
        println("TheFireStation get Today Special is $todaySpecial")
    }
}

class TheSchool:Customer{
    override fun getTodaySpecial(todaySpecial: String) {
        println("TheSchool get Today Special is $todaySpecial")
    }
}

class DonStudio:Customer{
    override fun getTodaySpecial(todaySpecial: String) {
        println("DonStudio get Today Special is $todaySpecial")
    }
}