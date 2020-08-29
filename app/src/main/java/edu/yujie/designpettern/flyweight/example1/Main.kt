package edu.yujie.designpettern.flyweight.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val macbookFactory = MacbookFactory()

    val macbookHugh = macbookFactory.getMacbook(Macbook.Spec.HIGH)
    println("macbookHugh:${macbookHugh.toString()}")
    println("--------------------------")
    val macbookLow = macbookFactory.getCustomSetting(CustomSetting.LOW)
    println("macbookLow:${macbookLow.toString()}")
    println("--------------------------")
    val customSetting = CustomSetting()
    customSetting.cpu = "i9"
    customSetting.memory = 32
    customSetting.storage = 1024
    val macbookCustom = macbookFactory.getCustomSetting(customSetting)
    println("macbookCustom:${macbookCustom.toString()}")

}