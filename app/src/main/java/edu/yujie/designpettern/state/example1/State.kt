package edu.yujie.designpettern.state.example1

abstract class State {
    abstract fun tempToDisplay(temperature: Double):String

    abstract fun vibToDisplay(vibration: Double):String

    abstract fun tempToSave(temperature: Double):String

    abstract fun vibToSave(vibration: Double):String

    fun twoDecPlaces(value: Double) = String.format("%.2f", value)

    fun saveForm(value: Double) = String.format("%f", value)
}


class Metric : State() {
    override fun tempToDisplay(temperature: Double): String {
        println("顯示公制")
        return twoDecPlaces(temperature)
    }

    override fun vibToDisplay(vibration: Double): String {
        println("顯示公制")
        return twoDecPlaces(vibration)
    }

    override fun tempToSave(temperature: Double): String {
        println("儲存公制")
        return saveForm(temperature)
    }

    override fun vibToSave(vibration: Double): String {
        println("儲存公制")
        return saveForm(vibration)
    }
}

class British : State() {
    override fun tempToDisplay(temperature: Double): String {
        println("顯示英制")
        return twoDecPlaces(temperature * 9 / 5 + 32)
    }

    override fun vibToDisplay(vibration: Double): String {
        println("顯示英制")
        return twoDecPlaces(vibration * 25.4)
    }

    override fun tempToSave(temperature: Double): String {
        println("儲存英制")
        return saveForm((temperature - 32) * 5 / 9)
    }

    override fun vibToSave(vibration: Double): String {
        println("儲存英制")
        return saveForm(vibration / 25.4)
    }
}

