package edu.yujie.designpettern.abstractfactory.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
abstract class BMW {
    var brand: String = "BMW"
        private set

    open var type: String = ""
}

class BMWSUV : BMW() {
    override var type: String = "SUV"
}

class BMWJeep : BMW() {
    override var type: String = "Jeep"
}