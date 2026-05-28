package strategy

class GuestBorrowS : BorrowS {
    override fun getBorrowLimit(): Int = 1
    override fun getBorrowDays(): Int = 3
    
    // Guests get a heavy penalty fine: $2.00 per day overdue
    override fun calculateFine(daysOverdue: Int): Double {
        return if (daysOverdue <= 0) 0.0 else daysOverdue * 2.00
    }
}