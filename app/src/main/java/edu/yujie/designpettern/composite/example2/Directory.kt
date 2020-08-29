package edu.yujie.designpettern.composite.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */

class Directory(private val name: String) : Entry() {
    private val mEntryList = arrayListOf<Entry>()

    override fun getName() = name

//    override fun getSize() = mEntryList.count()

    override fun getSize(): Int {
        var size = 0
        mEntryList.iterator().apply {
            while (hasNext()) {
                size += next().getSize()
            }
        }
        return size
    }

    override fun add(e: Entry) {
        super.add(e)
        mEntryList.add(e)
    }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        mEntryList.iterator().apply {
            while (hasNext()) {
                next().apply {
                    printList("$prefix/$name")
                }
            }
        }
    }
}