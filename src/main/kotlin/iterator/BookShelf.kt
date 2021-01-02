package iterator

import iterator.BookShelf as BookShelf1

class BookShelf(maxsize: Int): Aggregate{
    val bookArray: Array<Book?> = arrayOfNulls(maxsize)
    var last: Int = 0

    fun getBookAt(index: Int): Book? {return  bookArray[index]}
    fun appendBook(book: Book) {
        bookArray[last] = book
        last++
    }
    fun getLength(): Int {return bookArray.size}
    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }

}