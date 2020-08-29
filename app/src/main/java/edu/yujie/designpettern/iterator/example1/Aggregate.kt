package edu.yujie.designpettern.iterator.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
interface Aggregate {
    fun createIterator(): Iterator
}

class CompanyA : Aggregate {
    val employList = arrayListOf<Employee>()

    init {
        employList.add(Employee("小萱", "業務"))
        employList.add(Employee("小尉", "工程師"))
        employList.add(Employee("小陞", "程序猿"))
        employList.add(Employee("阿偉", "專案管理"))
        employList.add(Employee("小詩", "吉祥物"))
        employList.add(Employee("阿農", "分析兼司機"))
    }

    override fun createIterator(): Iterator = CompanyAIterator(this)

}