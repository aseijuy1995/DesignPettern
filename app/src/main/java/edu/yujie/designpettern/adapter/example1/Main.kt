package edu.yujie.designpettern.adapter.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val blackman = BlackMan("black")
    blackman.helloEnglish()
    blackman.selfIntroEnglish()

    val blackmanTranslator = BlackmanTranslator(blackman.name)
    val taiwanman = TaiwanMan(blackmanTranslator)
    taiwanman.hello()
    taiwanman.selfIntro()
}