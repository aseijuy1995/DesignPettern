package edu.yujie.designpettern.facade.example2

class ComplexSystemStore(val filePath: String) {
    init {
        println("Reading data from file: $filePath")
    }

    val store = hashMapOf<String, String>()

    fun save(key: String, payload: String) {
        store[key] = payload
    }

    fun read(key: String) = store[key] ?: ""

    fun commit() = println("Storing cached data: $store to file: $filePath")
}