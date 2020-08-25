package edu.yujie.designpettern.command.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
class Light {
    fun turnOn(){
        println("打開燈")
    }

    fun turnOff(){
        println("關燈")
    }

    fun brighter(){
        println("亮度提高")
    }

    fun darker(){
        println("亮度降低")
    }
}