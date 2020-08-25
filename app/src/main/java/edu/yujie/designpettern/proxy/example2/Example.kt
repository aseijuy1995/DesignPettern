package edu.yujie.designpettern.proxy.example2

import kotlin.reflect.KProperty

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
class Example {
    var p: String by Delegate()
}

class Delegate {
    private var mRealValue = ""

    operator fun getValue(example: Example, property: KProperty<*>): String {
        return mRealValue
    }

    operator fun setValue(example: Example, property: KProperty<*>, s: String) {
        mRealValue = s
    }

}