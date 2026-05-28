package strategy

class StudentBorrowS : BorrowS {
    override fun getBorrowLimit(): Int = 3 [cite: 136]
    override fun getBorrowDays(): Int = 7 [cite: 138]
    
    // Students get a light fine: $0.50 per day overdue
    override fun calculateFine(daysOverdue: Int): Double {
        return if (daysOverdue <= 0) 0.0 else daysOverdue * 0.50
    }
}