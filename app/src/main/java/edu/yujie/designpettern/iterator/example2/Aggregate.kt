package edu.yujie.designpettern.iterator.example2

/**
 * @author YuJie on 2020/8/29
 * @describe 說明
 * @param 參數
 */
interface Aggregate<T> {
    val length: Int

    fun iterator(): Iterator<T>

    fun add(t: T)

    fun remove(t: T)

    fun get(index: Int): T
}

class BookShelf : Aggregate<Book> {
    private val books = arrayListOf<Book>()
    override val length: Int
        get() = books.size

    override fun add(t: Book) {
        books.add(t)
    }

    override fun remove(t: Book) {
        books.remove(t)
    }

    override fun iterator(): Iterator<Book> {
        return BookshelfIterator(this)
    }

    override fun get(index: Int) = books[index]
}