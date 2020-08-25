package edu.yujie.designpettern.prototype.example1

/**
 * @author YuJie on 2020/8/25
 * @describe 說明
 * @param 參數
 */
abstract class Prototype : Cloneable {
    override fun clone(): Any {
        return super.clone()
    }
}

class Sensor : Prototype() {
    var id: Int? = null
    var name: String? = null
    var nickname: String? = null
    var version: String? = null
    var wifiID: String? = null
    var wifiPass: String? = null
    var data: String? = null

    public override fun clone(): Any {
        return super.clone()
    }
}