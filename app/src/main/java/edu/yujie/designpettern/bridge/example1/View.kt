package edu.yujie.designpettern.bridge.example1

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
abstract class View {
    var resource: Resource? = null

    abstract fun show()
}

class FewView : View() {
    override fun show() {
        resource?.run {
            photo()
            snippet()
        }
    }
}

class FullView : View() {
    override fun show() {
        resource?.run {
            photo()
            describe()
        }
    }
}