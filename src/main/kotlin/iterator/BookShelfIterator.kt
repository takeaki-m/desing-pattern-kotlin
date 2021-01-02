package iterator

class BookShelfIterator(private val bookShelf: BookShelf) : Iterator {
    // コンストラクタに private /val をつけないと、メソッドでの参照ができない
    // 言語使用？りゆうがわからないが
    private var index = 0
    override operator fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override operator fun next(): Book {
        val book = bookShelf.getBookAt(index)
        index++
        return book!!
    }

    public fun getIndex(): Int { return index }
}