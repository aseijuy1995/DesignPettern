package edu.yujie.designpettern.composite.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
fun main(args: Array<String>) {
    Directory("root").also { root ->
        Directory("bin").also { bin ->
            bin.add(Directory("1"))
            bin.add(Directory("2"))
            root.add(bin)
        }
        root.add(Directory("temp"))
        Directory("usr").also { usr ->
            Directory("apple").also {
                it.add(File("a.java", 100))
                it.add(File("d.kotlin", 10))
                usr.add(it)
            }
            Directory("yuki").also {
                it.add(File("c.java", 100))
                it.add(File("d.kotlin", 10))
                usr.add(it)
            }
            root.add(usr)
        }
        root.printList()
    }
}