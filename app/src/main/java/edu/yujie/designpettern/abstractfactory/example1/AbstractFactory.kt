package edu.yujie.designpettern.abstractfactory.example1

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
abstract class AbstractFactory {
    abstract fun createAudi(): Audi

    abstract fun createBMW(): BMW
}

class JeepFactory : AbstractFactory() {
    override fun createAudi() = AudiJeep()

    override fun createBMW() = BMWJeep()
}

class SUVFactory : AbstractFactory() {
    override fun createAudi() = AudiSUV()

    override fun createBMW() = BMWSUV()
}