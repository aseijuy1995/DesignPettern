package edu.yujie.designpettern.iterator.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    BookShelf().run {
        for (i in 0..10) {
            add(Book("title$i", i))
        }
        println(this)
        iterator().run {
            while (hasNext()) {
                next().run {
                    println("title:$title, price:$price")
                }
            }
        }
    }
}