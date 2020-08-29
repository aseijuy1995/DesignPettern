package edu.yujie.designpettern.memoto.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
class Caretaker {
    private var memoto: Memoto? = null

    fun setMemoto(memoto: Memoto) {
        this.memoto = memoto
    }

    fun getMemoto() = memoto

}