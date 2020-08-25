package edu.yujie.designpettern.state.example1

fun main(args: Array<String>) {
    val metricSystem = MetricSystem()
    metricSystem.setState(Metric())
    println(metricSystem.tempView(50.toDouble()))
    println(metricSystem.vibView(10.toDouble()))
    println(metricSystem.temSave(50.toDouble()))
    println(metricSystem.vibSave(10.toDouble()))

    metricSystem.setState(British())
    println(metricSystem.tempView(50.toDouble()))
    println(metricSystem.vibView(10.toDouble()))
    println(metricSystem.temSave(50.toDouble()))
    println(metricSystem.vibSave(10.toDouble()))


}