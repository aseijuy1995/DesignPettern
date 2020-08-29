package edu.yujie.designpettern.iterator.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val companyA = CompanyA()
    val iterator = companyA.createIterator()
    while (!iterator.isDone()) {
        (iterator.currentItem() as Employee).also {
            println("${it.name}:${it.title}, 發薪水!")
        }
        iterator.next()
    }
}