import strategy.*
import models.Book
import observer.*

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

    // =====================
// OBSERVER PATTERN
// =====================

println("\n=== OBSERVER PATTERN ===")

    val notifier = BookNotifier()

    val user1 = UserObserver("Alice")
    val user2 = UserObserver("Bob")

    notifier.addObserver(user1)
    notifier.addObserver(user2)

    notifier.bookBorrowed("Harry Potter")
    notifier.bookReturned("Harry Potter")
    notifier.bookReserved("Harry Potter")
    notifier.bookLost("Harry Potter")

}