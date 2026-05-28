import strategy.*
import models.Book
import models.User
import observer.*

fun main() {

    // =====================
    // STRATEGY PATTERN
    // =====================
    println("===== STRATEGY PATTERN =====")

    // 1. Showcase individual standalone strategies (Your original logic updated)
    var strategy: BorrowS

    strategy = StudentBorrowS()
    println("Student Rules")
    println("Borrow Limit: ${strategy.getBorrowLimit()}")
    println("Borrow Days: ${strategy.getBorrowDays()}")

    strategy = TeacherBorrowS()
    println("\nTeacher Rules")
    println("Borrow Limit: ${strategy.getBorrowLimit()}")
    println("Borrow Days: ${strategy.getBorrowDays()}")

    println("---------------------------------------------")
    println("CONTEXTUAL STRATEGY SWITCHING VIA USER CLASS")
    println("---------------------------------------------")

    // 2. Demonstration of Strategies cleanly bound inside User objects
    val member = User("Charlie", "Student", StudentBorrowS())
    member.displayBorrowRules()
    member.checkEstimatedFine(5) // Calculates student fine rate

    println("\n... Upgrading Charlie's account status to Teacher ...")
    // Dynamic behavior swap at runtime!
    member.borrowStrategy = TeacherBorrowS() 
    member.displayBorrowRules()
    member.checkEstimatedFine(5) // Calculates teacher fine rate for the same delay

    println("\n... Checking Guest account rules ...")
    val guestUser = User("Dave", "Guest", GuestBorrowS())
    guestUser.displayBorrowRules()
    guestUser.checkEstimatedFine(5) // Calculates strict guest fine rate


    // =====================
    // STATE PATTERN
    // =====================
    println("\n=== STATE PATTERN ===")

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