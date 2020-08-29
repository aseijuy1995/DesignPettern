package edu.yujie.designpettern.iterator.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
interface Iterator {
    fun first(): Any

    fun next(): Any?

    fun isDone(): Boolean

    fun currentItem(): Any
}

class CompanyAIterator(val companyA: CompanyA) : Iterator {
    private var current = 0

    override fun first() = companyA.employList[current]

    override fun next(): Any? {
        var rest: Any? = null
        current++
        if (current < companyA.employList.size) {
            rest = companyA.employList[current]
        }
        return rest
    }

    override fun isDone() = current >= companyA.employList.size

    override fun currentItem() = companyA.employList[current]

}