package edu.yujie.designpettern.visitor.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
abstract class Weather {
    var temperture: Double
        private set
    var airQuality: Double
        private set

    init {
        temperture = Math.random() * 30
        airQuality = Math.random() * 300
    }

    abstract fun accept(visit: Visit)
}

class Temperture : Weather() {
    override fun accept(visit: Visit) {
        visit.visit(this)
    }

    fun getTemperture() = "溫度趨勢圖"
}

class AirQuality : Weather() {
    override fun accept(visit: Visit) {
        visit.visit(this)
    }

    fun getAirQuality() = "空氣品質趨勢圖"
}