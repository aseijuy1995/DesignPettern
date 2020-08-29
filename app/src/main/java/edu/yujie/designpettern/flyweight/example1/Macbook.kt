package edu.yujie.designpettern.flyweight.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
class Macbook(customSetting: CustomSetting) : Monitor() {
    private var customSetting = customSetting

    constructor(spec: Spec) : this(spec.customSetting)

    enum class Spec(val customSetting: CustomSetting) {
        LOW(CustomSetting.LOW), HIGH(CustomSetting.HIGH);
    }

    fun getCustomSetting() = customSetting

    fun setCustomSetting(customSetting: CustomSetting) {
        this.customSetting = customSetting
    }

    override fun toString(): String {
        return "CustomSetting:{\ncpu:${customSetting.cpu}\nmemory:${customSetting.memory}\nstorage:${customSetting.storage}\n}"
    }
}