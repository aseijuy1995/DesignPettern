package edu.yujie.designpettern.prototype.example4

/**
 * @author YuJie on 2020/8/25
 * @describe 說明
 * @param 參數
 */

fun <T : Any> T.deepCopy(): T {
    if (!this::class.isData) {
        return this
    }

    return this::class.javaPrimitiveType!!.let{
        it.protectionDomain.ma
    }


}