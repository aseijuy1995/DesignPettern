package edu.yujie.designpettern.singleton.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
abstract class Product {
    fun getName() = this.javaClass.simpleName
}

class Cola : Product()

class Humberger : Product()

