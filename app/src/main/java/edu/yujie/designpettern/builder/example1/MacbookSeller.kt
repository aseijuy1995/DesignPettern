package edu.yujie.designpettern.builder.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

class MacbookSeller(val macbookBuilder: MacbookBuilder) {

    fun lowSpec() =
        macbookBuilder.apply {
            buildProcessor(Processor("2.2GHz 6 核心第八代 Intel Core i7 處理器"))
            buildMemory(Memory(16))
            buildGraphics(Graphics("Radeon Pro 555X 配備 4GB GDDR5 記憶體"))
            buildStorage(Storage(256))
            buildKeyboard(Keyboard("中文注音"))
        }.build()

    fun highSpec() =
        macbookBuilder.apply {
            buildProcessor(Processor("2.6GHz 6 核心第八代 Intel Core i7 處理器"))
            buildMemory(Memory(16))
            buildGraphics(Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
            buildStorage(Storage(512))
            buildKeyboard(Keyboard("中文注音"))
        }.build()

}