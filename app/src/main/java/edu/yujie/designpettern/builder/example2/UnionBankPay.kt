package edu.yujie.designpettern.builder.example2

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
class UnionBankPay private constructor(tradeCode: String, serverModel: String) {
    companion object {
        fun build(init: Builder.() -> Unit) = Builder(init)
    }

    class Builder private constructor() {
        constructor(init: Builder.() -> Unit) : this() {
            init()
        }

        lateinit var tradeCode: String

        lateinit var serverModel: String

        fun tradeCode(init: Builder.() -> String) = apply { tradeCode = init() }

        fun serverModel(init: Builder.() -> String) = apply { serverModel = init() }

        fun build() = UnionBankPay(tradeCode, serverModel)
    }
}