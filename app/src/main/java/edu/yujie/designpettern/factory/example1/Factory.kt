package edu.yujie.designpettern.factory.example1

/**
 * @author YuJie on 2020/8/22
 * @describe 說明
 * @param 參數
 */

interface Factory {
    fun getProduct(): Product
}

class FrenchFriesFactory : Factory {
    override fun getProduct(): Product {
        return FrenchFries()
    }

    fun getProduct(state: String): Product {
        return FrenchFries(state)
    }
}