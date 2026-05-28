package models

import strategy.BorrowS
import strategy.StudentBorrowS

class User(
    val name: String,
    val role: String,
    // Provide a default strategy (e.g., Student) so it doesn't break other parts of the system
    var borrowStrategy: BorrowS = StudentBorrowS()
) {
    fun displayBorrowRules() {
        println("$name's ($role) Account Rules:")
        println("  -> Borrow Limit: ${borrowStrategy.getBorrowLimit()} books")
        println("  -> Borrow Duration: ${borrowStrategy.getBorrowDays()} days")
    }

    fun checkEstimatedFine(daysOverdue: Int) {
        val fine = borrowStrategy.calculateFine(daysOverdue)
        println("  -> Fine for $daysOverdue days overdue: $$fine")
    }
}