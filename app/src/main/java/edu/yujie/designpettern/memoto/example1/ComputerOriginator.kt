package edu.yujie.designpettern.memoto.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
class ComputerOriginator(
    var system: String = "macOS",
    var hardisk: String = "ssd",
    var userDoc: String = "desk",
    var userApp: String = "pages,numbers..."
) {

    fun save() = ComputerMemoto(system, hardisk, userDoc, userApp)

    fun restore(computerMemoto: ComputerMemoto) {
        system = computerMemoto.system
        hardisk = computerMemoto.hardisk
        userDoc = computerMemoto.userDoc
        userApp = computerMemoto.userApp
    }
}