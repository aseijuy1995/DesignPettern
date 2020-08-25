package edu.yujie.designpettern.prototype.example3

/**
 * @author YuJie on 2020/8/25
 * @describe 說明
 * @param 參數
 */
class CodeEditer(var code: String? = null,var explanatoryNote: ArrayList<String> = arrayListOf()) : Cloneable {
    public override fun clone(): Any {
        return super.clone()
    }
}