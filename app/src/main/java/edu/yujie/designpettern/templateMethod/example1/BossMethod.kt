package edu.yujie.designpettern.templateMethod.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
abstract class BossMethod {
    fun bossThink() = "我覺得呢，這個東西應該要這樣做這樣做。 ： "

    fun bossRedo() = "你們這個跟我想做得不一樣重新做。"

    abstract fun uiDesign(): String

    abstract fun systemAnalysis(): String

    abstract fun systemDesign(): String

    abstract fun programming(): String

    abstract fun test(): String

    fun completeSoftware() {
        val sb = String.format(
            "%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
            bossThink(),
            uiDesign(),
            bossThink(),
            systemAnalysis(),
            bossThink(),
            systemDesign(),
            bossThink(),
            programming(),
            bossThink(),
            test()
        )
        println(sb)
    }

    fun redoSoftware() {
        println(bossRedo())
        completeSoftware()
    }
}