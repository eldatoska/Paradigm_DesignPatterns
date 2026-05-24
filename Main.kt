import strategy.*
import models.Book

fun main() {

    println("===== STRATEGY PATTERN =====")

    var strategy: BorrowS

    strategy = StudentBorrowS()

    println("Student Rules")
    println("Borrow Limit: ${strategy.getBorrowLimit()}")
    println("Borrow Days: ${strategy.getBorrowDays()}")



    strategy = TeacherBorrowS()

    println("\nTeacher Rules")
    println("Borrow Limit: ${strategy.getBorrowLimit()}")
    println("Borrow Days: ${strategy.getBorrowDays()}")



    // =====================
    // STATE PATTERN
    // =====================

    println("=== STATE PATTERN ===")

    val book = Book(
        "Harry Potter",
        "J.K. Rowling"
    )

    println("\nBorrowing:")
    book.borrow()

    println("\nReturning:")
    book.returnBook()

    println("\nReserving:")
    book.reserve()

    println("\nBorrow reserved book:")
    book.borrow()

    println("\nMark lost:")
    book.markLost()

}