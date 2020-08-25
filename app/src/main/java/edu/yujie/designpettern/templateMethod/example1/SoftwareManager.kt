package edu.yujie.designpettern.templateMethod.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
class SoftwareManager : BossMethod() {
    override fun uiDesign(): String {
        println("找一個UI Design做");
        return "UI成果";
    }

    override fun systemAnalysis(): String {
        println("找一個軟體分析師做");
        return "軟體分析成果";
    }

    override fun systemDesign(): String {
        println("找一個系統設計師做");
        return "系統設計成果";
    }

    override fun programming(): String {
        println("找一個軟體工程師做");
        return "程式成果";
    }

    override fun test(): String {
        println("找一個測試工程師做");
        return "測試成果";
    }

}