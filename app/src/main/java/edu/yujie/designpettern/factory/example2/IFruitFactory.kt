package edu.yujie.designpettern.factory.example2

/**
 * @author YuJie on 2020/8/22
 * @describe 說明
 * @param 參數
 */
interface IFruitFactory {
    fun createFactory(type: String): IFruit
}

class FruitFactory : IFruitFactory {
    override fun createFactory(type: String): IFruit =
        when (type) {
            "apple" -> Apple(12.8, "red")
            "banana" -> Banana(8.8)
            "grape" -> Grape(15.98, false)
            else -> throw IllegalArgumentException("Unknown Fruit")
        }
}

interface IFruitFactory2 {
    fun createApp(): IFruit

    fun createBanana(): IFruit

    fun createGrape(): IFruit
}

class FruitFactory2 : IFruitFactory2 {
    override fun createApp(): IFruit {
        return Apple(12.8, "red")
    }

    override fun createBanana(): IFruit {
        return Banana(8.8)
    }

    override fun createGrape(): IFruit {
        return Grape(15.98, false)
    }
}

class FruitFactory3 {
    companion object : IFruitFactory2 {
        override fun createApp(): IFruit {
            return Apple(12.8, "red")
        }

        override fun createBanana(): IFruit {
            return Banana(8.8)
        }

        override fun createGrape(): IFruit {
            return Grape(15.98, false)
        }
    }

}