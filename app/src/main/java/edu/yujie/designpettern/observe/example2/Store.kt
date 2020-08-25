package edu.yujie.designpettern.observe.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
interface Store {
    fun addCustomer(customer: Customer)

    fun removeCustomer(customer: Customer)

    fun getTodaySpecial()
}

class TheBakery : Store {
    private val list = arrayListOf<Customer>()

    override fun addCustomer(customer: Customer) {
        list.add(customer)
    }

    override fun removeCustomer(customer: Customer) {
        list.remove(customer)
    }

    override fun getTodaySpecial() {
        list.forEach {
            it.getTodaySpecial("banana")
        }
    }
}