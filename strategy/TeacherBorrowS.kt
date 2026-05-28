package strategy

class TeacherBorrowS : BorrowS {
    override fun getBorrowLimit(): Int = 10 [cite: 143]
    override fun getBorrowDays(): Int = 30 [cite: 146]
    
    // Teachers get a lenient fine: $0.25 per day overdue
    override fun calculateFine(daysOverdue: Int): Double {
        return if (daysOverdue <= 0) 0.0 else daysOverdue * 0.25
    }
}