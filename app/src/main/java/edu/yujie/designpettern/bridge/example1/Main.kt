package edu.yujie.designpettern.bridge.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {

    println("簡單包包說明")
    val fewView = FewView()
    fewView.resource = Bag()
    fewView.show()
    println("--------------------------")
    println("簡單書本說明")
    val fewView2 = FewView()
    fewView2.resource = Book()
    fewView2.show()
    println("--------------------------")
    println("詳細包包說明")
    val fullView = FullView()
    fullView.resource = Bag()
    fullView.show()
    println("--------------------------")
    println("詳細書本說明")
    val fullView2 = FullView()
    fullView2.resource = Book()
    fullView2.show()
}