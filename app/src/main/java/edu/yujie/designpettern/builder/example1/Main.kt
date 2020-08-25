package edu.yujie.designpettern.builder.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

fun main(args: Array<String>) {
    val macbookprod2018 = MacbookProd_2018()
    val macbookSeller = MacbookSeller(macbookprod2018)

    val macbook2018lowSpec = macbookSeller.lowSpec()
    println(macbook2018lowSpec.toString())

    println("--------------------------")
    //customer
    val macbookprod2018custom = macbookprod2018.apply {
        buildProcessor(Processor("2.2GHz 6 核心第八代 Intel Core i7 處理器"))
        buildMemory(Memory(32))
        buildGraphics(Graphics("Radeon Pro 555X 配備 4GB GDDR5 記憶體"))
        buildStorage(Storage(1024))
        buildKeyboard(Keyboard("中文注音"))
    }.build()
    println(macbookprod2018custom.toString())


}