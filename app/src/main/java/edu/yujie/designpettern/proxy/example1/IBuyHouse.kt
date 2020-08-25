package edu.yujie.designpettern.proxy.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
interface IBuyHouse {
    fun findHouse()

    fun priceTooHigh()

    fun defendPrice()

    fun finish()
}

class LittleEngineer : IBuyHouse {
    override fun findHouse() {
        println("民生社區機能特好！當然找那邊的房子！")
    }

    override fun priceTooHigh() {
        println("現在台灣薪水那麼低，屋主開那麼高賣不掉啦！")
    }

    override fun defendPrice() {
        println("未來人口越來越少，我們也是自住而已！打我五折吧！")
    }

    override fun finish() {
        println("辛苦還房貸幾十年")
    }
}

class EstateAgent(val iBuyHouse: IBuyHouse) : IBuyHouse {
    override fun findHouse() {
        iBuyHouse.findHouse()
        println("#房仲幫忙找房子")
    }

    override fun priceTooHigh() {
        iBuyHouse.priceTooHigh()
        println("#房仲幫忙喬價錢")
    }

    override fun defendPrice() {
        iBuyHouse.defendPrice()
        println("#房仲強力喬價錢")
    }

    override fun finish() {
        iBuyHouse.finish()
        println("#成交的話房仲幫忙付訂、簽約、用印、完稅、交屋")
    }

}