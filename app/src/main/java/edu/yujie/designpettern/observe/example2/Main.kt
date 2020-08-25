package edu.yujie.designpettern.observe.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val theBakery = TheBakery()

    val theHospital = TheHospital()
    val theFireStation = TheFireStation()
    val theSchool = TheSchool()
    val donStudio = DonStudio()

    theBakery.addCustomer(theHospital)
    theBakery.addCustomer(theFireStation)
    theBakery.addCustomer(theSchool)
    theBakery.addCustomer(donStudio)

    theBakery.getTodaySpecial()
}