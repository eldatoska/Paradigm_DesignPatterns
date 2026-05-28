package strategy

interface BorrowS {
    fun getBorrowLimit(): Int
    fun getBorrowDays(): Int
    fun calculateFine(daysOverdue: Int): Double
}