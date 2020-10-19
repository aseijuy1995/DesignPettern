package edu.yujie.designpettern.abstractfactory.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
abstract class Audi {
    var brand: String = "Audi"
        private set

    abstract var type: String
}

class AudiSUV:Audi(){
    override var type: String
        get() = "SUV"
        set(value) {}
}

class AudiJeep:Audi(){
    override var type: String
        get() = "Jeep"
        set(value) {}
}