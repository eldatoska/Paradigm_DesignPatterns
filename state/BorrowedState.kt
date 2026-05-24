package state

import models.Book

class BorrowedState : BookState {
    override fun borrow(book: Book) {
        println("${book.title} is already borrowed.")
    }

    override fun returnBook(book: Book) {
        println("${book.title} was returned.")
        book.state = AvailableState()
    }

    override fun reserve(book: Book) {
        println("${book.title} was reserved while borrowed.")
        book.state = ReservedState()
    }

    override fun markLost(book: Book) {
        println("${book.title} was marked as lost.")
        book.state = LostState()
    }
}