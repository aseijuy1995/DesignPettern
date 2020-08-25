package edu.yujie.designpettern.builder.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

abstract class MacbookBuilder() {
    protected val macbookPro: MacbookPro = MacbookPro()

    abstract fun buildProcessor(processor: Processor): MacbookBuilder

    abstract fun buildMemory(memory: Memory): MacbookBuilder

    abstract fun buildGraphics(graphics: Graphics): MacbookBuilder

    abstract fun buildStorage(storage: Storage): MacbookBuilder

    abstract fun buildKeyboard(keyboard: Keyboard): MacbookBuilder

    open fun build() = macbookPro
}

class MacbookProd_2018 : MacbookBuilder() {
    override fun buildProcessor(processor: Processor): MacbookBuilder {
        macbookPro.setProcessor(processor)
        return this
    }

    override fun buildMemory(memory: Memory): MacbookBuilder {
        macbookPro.setMemory(memory)
        return this
    }

    override fun buildGraphics(graphics: Graphics): MacbookBuilder {
        macbookPro.setGraphics(graphics)
        return this
    }

    override fun buildStorage(storage: Storage): MacbookBuilder {
        macbookPro.setStorage(storage)
        return this
    }

    override fun buildKeyboard(keyboard: Keyboard): MacbookBuilder {
        macbookPro.setKeyboard(keyboard)
        return this
    }

}