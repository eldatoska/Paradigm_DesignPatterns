import strategy.*

fun main() {

    println("===== STRATEGY PATTERN =====")

    var strategy: BorrowStrategy

    strategy = StudentBorrowStrategy()

    println("Student Rules")
    println("Borrow Limit: ${strategy.getBorrowLimit()}")
    println("Borrow Days: ${strategy.getBorrowDays()}")

    strategy = TeacherBorrowStrategy()

    println("\nTeacher Rules")
    println("Borrow Limit: ${strategy.getBorrowLimit()}")
    println("Borrow Days: ${strategy.getBorrowDays()}") 
     }