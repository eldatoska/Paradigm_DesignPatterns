package state

import models.Book

class LostState : BookState {
    override fun borrow(book: Book) {
        println("${book.title} cannot be borrowed because it is lost.")
    }

    override fun returnBook(book: Book) {
        println("${book.title} was found and returned.")
        book.state = AvailableState()
    }

    override fun reserve(book: Book) {
        println("${book.title} cannot be reserved because it is lost.")
    }

    override fun markLost(book: Book) {
        println("${book.title} is already marked as lost.")
    }
}
