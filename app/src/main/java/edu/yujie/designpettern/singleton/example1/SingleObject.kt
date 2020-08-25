package edu.yujie.designpettern.singleton.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
class SingleObject private constructor() {
    companion object {
        @Volatile
        private var instance: SingleObject? = null

        fun getInstance(): SingleObject? {
            if (instance == null) {
                synchronized((SingleObject::class.java)) {
                    if (instance == null) {
                        instance = SingleObject()
                    }
                }
            }
            return instance
        }
    }
}