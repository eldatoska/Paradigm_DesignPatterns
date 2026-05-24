package state

import models.Book

interface BookState {
    fun borrow(book: Book)
    fun returnBook(book: Book)
    fun reserve(book: Book)
    fun markLost(book: Book)
}