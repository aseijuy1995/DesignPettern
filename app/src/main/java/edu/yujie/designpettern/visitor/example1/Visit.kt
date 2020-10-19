package edu.yujie.designpettern.visitor.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
interface Visit {
    fun visit(airQuality: AirQuality)

    fun visit(temperture: Temperture)
}