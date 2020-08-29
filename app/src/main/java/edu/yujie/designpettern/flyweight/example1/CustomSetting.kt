package edu.yujie.designpettern.flyweight.example1

import kotlin.properties.Delegates

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
class CustomSetting(val set: String = "LOW") {
    companion object {
        val LOW = CustomSetting("LOW")
        val HIGH = CustomSetting("HIGH")
    }

    lateinit var cpu: String
    var memory by Delegates.notNull<Int>()
    var storage by Delegates.notNull<Int>()

    init {
        when (set) {
            "LOW" -> {
                cpu = "i5"
                memory = 8
                storage = 256
            }
            "HIGH" -> {
                cpu = "i7"
                memory = 16
                storage = 512
            }
            else -> {
            }
        }
    }

    override fun toString(): String {
        return "CustomSetting:{\ncpu:$cpu\nmemory:$memory\nstorage:$storage\n}"
    }

}