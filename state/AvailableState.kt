package state

import models.Book

class AvailableState : BookState {
    override fun borrow(book: Book) {
        println("${book.title} by ${book.author} was borrowed.")
        book.state = BorrowedState()
    }

    override fun returnBook(book: Book) {
        println("${book.title} is already available.")
    }

    override fun reserve(book: Book) {
        println("${book.title} was reserved.")
        book.state = ReservedState()
    }

    override fun markLost(book: Book) {
        println("${book.title} was marked as lost.")
        book.state = LostState()
    }
}