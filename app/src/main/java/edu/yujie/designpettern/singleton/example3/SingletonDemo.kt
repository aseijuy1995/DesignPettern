package edu.yujie.designpettern.singleton.example3

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

class SingletonDemo private constructor() {
    companion object {
        @Volatile
        var instance: SingletonDemo? = null

        fun newInstance() =
            instance ?: synchronized(this) {
                instance ?: SingletonDemo().also { instance = it }
            }
    }
}