package edu.yujie.designpettern.visitor.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */

class Man : Visit {
    override fun visit(airQuality: AirQuality) {
        println("稍微看一下空氣品質:${airQuality.airQuality}")
    }

    override fun visit(temperture: Temperture) {
        println("關心一下：${temperture.getTemperture()}")
    }
}

class Woman : Visit {
    override fun visit(airQuality: AirQuality) {
        println("關心一下：${airQuality.getAirQuality()}")
    }

    override fun visit(temperture: Temperture) {
        println("稍微看一下溫度：${temperture.temperture}")

    }
}