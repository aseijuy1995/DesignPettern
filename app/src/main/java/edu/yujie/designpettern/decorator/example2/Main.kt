package edu.yujie.designpettern.decorator.example2

import java.io.InputStream

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val male = Male()
    val hat = Hat(male)
    println("${male.description}, ${hat.getDress()}")
}