package edu.yujie.designpettern.builder.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    UnionBankPay.build {
        tradeCode = "123"
        serverModel = "456"
    }.build()
}