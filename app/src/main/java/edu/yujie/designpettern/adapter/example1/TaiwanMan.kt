package edu.yujie.designpettern.adapter.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

class TaiwanMan(val people: People) {
    fun hello() {
        people.hello()
    }

    fun selfIntro() {
        people.selfIntro()
    }
}