package edu.yujie.designpettern.visitor.example2

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
interface ReportVisitor {
    fun visit(fixedPriceContract: FixedPriceContract)

    fun visit(timeAndMaterialsContract: TimeAndMaterialsContract)

    fun visit(supportContract: SupportContract)
}

class MonthlyCostReportVisitor(var monthlyCost: Long = 0) : ReportVisitor {
    override fun visit(fixedPriceContract: FixedPriceContract) {
        monthlyCost += fixedPriceContract.costPer / 12
    }

    override fun visit(timeAndMaterialsContract: TimeAndMaterialsContract) {
        monthlyCost += timeAndMaterialsContract.costPer * timeAndMaterialsContract.hours
    }

    override fun visit(supportContract: SupportContract) {
        monthlyCost += supportContract.costPer
    }

}