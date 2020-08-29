package edu.yujie.designpettern.iterator.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
interface Iterator<out T> {
    operator fun hasNext(): Boolean

    fun next(): T
}

class BookshelfIterator(val shelf: BookShelf) : Iterator<Book> {
    private var index = 0

    override fun hasNext(): Boolean {
        return if (index < shelf.length - 1) {
            index++
            true
        } else {
            false
        }
    }

    override fun next() = shelf.get(index)

}