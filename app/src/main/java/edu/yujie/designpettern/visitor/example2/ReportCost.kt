package edu.yujie.designpettern.visitor.example2

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
interface ReportCost {
    fun accept(visitor: ReportVisitor)
}

class FixedPriceContract(val costPer: Long) : ReportCost {
    override fun accept(visitor: ReportVisitor) {
        visitor.visit(this)
    }
}

class TimeAndMaterialsContract(val costPer: Long, val hours: Long) : ReportCost {
    override fun accept(visitor: ReportVisitor) {
        visitor.visit(this)
    }
}

class SupportContract(val costPer: Long) : ReportCost {
    override fun accept(visitor: ReportVisitor) {
        visitor.visit(this)
    }
}