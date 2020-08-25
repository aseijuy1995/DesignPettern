package edu.yujie.designpettern.builder.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */
class MacbookPro {
    private lateinit var processor: Processor
    private lateinit var memory: Memory
    private lateinit var graphics: Graphics
    private lateinit var storage: Storage
    private lateinit var keyboard: Keyboard

    fun setProcessor(processor: Processor) {
        this.processor = processor
    }

    fun setMemory(memory: Memory) {
        this.memory = memory
    }

    fun setGraphics(graphics: Graphics) {
        this.graphics = graphics
    }

    fun setStorage(storage: Storage) {
        this.storage = storage
    }

    fun setKeyboard(keyboard: Keyboard) {
        this.keyboard = keyboard
    }

    override fun toString(): String {
        val sb = String.format(
            "MacbookPro:\nProcessor:%s\nMemory:%s\nGraphics:%s\nStorage:%s\nKeyboard:%s",
            processor.name,
            memory.size,
            graphics.name,
            storage.size,
            keyboard.language
        )
        return sb
    }
}

class Processor(val name: String)

class Memory(val size: Int)

class Graphics(val name: String)

class Storage(val size: Int)

class Keyboard(val language: String)