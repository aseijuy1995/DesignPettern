package edu.yujie.designpettern.visitor.example2

/**
 * @author YuJie on 2020/8/30
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    val monthlyCostReportVisitor = MonthlyCostReportVisitor()
    val fixedPriceContract = FixedPriceContract(10000)
    val timeAndMaterialsContract = TimeAndMaterialsContract(150, 10)
    val supportContract = SupportContract(500)

    val list = listOf<ReportCost>(fixedPriceContract, timeAndMaterialsContract, supportContract)
    list.forEach {
        it.accept(monthlyCostReportVisitor)
    }
    println("monthlyCost:${monthlyCostReportVisitor.monthlyCost}")
}