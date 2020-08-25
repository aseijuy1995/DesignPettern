package edu.yujie.designpettern.prototype.example1

/**
 * @author YuJie on 2020/8/25
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val sensor = Sensor()
    sensor.id = 1
    sensor.name = "Sensor第一版"
    sensor.nickname = "我的空氣探測器"
    sensor.version = "1.0.0"
    sensor.wifiID = "MYSENSORWIFIID1.0.0"
    sensor.wifiPass = "THISisWiFiPasssOuO"
    sensor.data = "None"

    val sensors = arrayOfNulls<Sensor>(5000)
    sensors[0] = sensor

    for (i in 0 until 5000) {
        sensors[i] = sensors[0]?.clone() as Sensor
        sensors[i]?.id = i + 1
    }

    for (i in 0..5000) {
        val sb = String.format(
            "id:%s\tname:%s\tnickname:%s\tversion:%s\twifiID:%s\twifiPass:%s\tdata:%s",
            sensors[i]?.id,
            sensors[i]?.name,
            sensors[i]?.nickname,
            sensors[i]?.version,
            sensors[i]?.wifiID,
            sensors[i]?.wifiPass,
            sensors[i]?.data
        )
        println(sb)
    }
}