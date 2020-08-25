package edu.yujie.designpettern.command.example1

/**
 * @author YuJie on 2020/8/24
 * @describe 說明
 * @param 參數
 */

abstract class Command(protected val light: Light) {
    abstract fun execute()
}

class TurnOn(light: Light) : Command(light) {
    override fun execute() {
        light.turnOn()
    }
}

class TurnOff(light: Light) : Command(light) {
    override fun execute() {
        light.turnOff()
    }
}

class Brighter(light: Light) : Command(light) {
    override fun execute() {
        light.brighter()
    }
}

class Darker(light: Light) : Command(light) {
    override fun execute() {
        light.darker()
    }
}