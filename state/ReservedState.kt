package state

import models.Book

class ReservedState : BookState {
    override fun borrow(book: Book) {
        println("${book.title} was borrowed by the reserved user.")
        book.state = BorrowedState()
    }

    override fun returnBook(book: Book) {
        println("${book.title} is reserved, not borrowed.")
    }

    override fun reserve(book: Book) {
        println("${book.title} is already reserved.")
    }

    override fun markLost(book: Book) {
        println("${book.title} was marked as lost.")
        book.state = LostState()
    }
}