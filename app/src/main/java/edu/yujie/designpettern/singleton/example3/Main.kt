package edu.yujie.designpettern.singleton.example3

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    for (i in 0..2) {
        Thread {
            println("singletonDemo1${SingletonDemo.newInstance()}")
        }.start()
    }
    for (i in 0..2) {
        Thread {
            println("singletonDemo2${SingletonDemo.newInstance()}")
        }.start()
    }
}