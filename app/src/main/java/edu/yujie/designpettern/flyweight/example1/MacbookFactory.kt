package edu.yujie.designpettern.flyweight.example1

import java.util.*

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
class MacbookFactory {
    private val cache = HashMap<CustomSetting, Macbook>()

    fun getCustomSetting(key: CustomSetting) = if (cache.contains(key))
        cache[key]!!
    else {
        val macbook = Macbook(key)
        cache[key] = macbook
        macbook
    }

    fun getMacbook(spec: Macbook.Spec) = if (cache.contains(spec.customSetting))
        cache[spec.customSetting]!!
    else {
        val macbook = Macbook(spec.customSetting)
        cache[spec.customSetting] = macbook
        macbook
    }
}