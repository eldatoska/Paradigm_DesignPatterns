package models

import state.AvailableState
import state.BookState

class Book(
    val title: String,
    val author: String
) {

    var state: BookState = AvailableState()

    fun borrow() {
        state.borrow(this)
    }

    fun returnBook() {
        state.returnBook(this)
    }

    fun reserve() {
        state.reserve(this)
    }

    fun markLost() {
        state.markLost(this)
    }

}