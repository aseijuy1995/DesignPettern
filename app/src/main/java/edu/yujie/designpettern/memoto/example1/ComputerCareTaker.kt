package edu.yujie.designpettern.memoto.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
class ComputerCareTaker {
    companion object {
        private const val MAX = 15
    }

    val computerMemotoList = arrayListOf<ComputerMemoto>()

    fun saveMemoto(computerMemoto: ComputerMemoto) {
        if (computerMemotoList.size > MAX) {
            computerMemotoList.removeAt(0)
        }
        computerMemotoList.add(computerMemoto)
    }

    fun getSave(index: Int): ComputerMemoto {
        var index2 = 0
        index2 = if (index > computerMemotoList.size - 1) computerMemotoList.size - 1 else index
        return computerMemotoList[index2]
    }
}