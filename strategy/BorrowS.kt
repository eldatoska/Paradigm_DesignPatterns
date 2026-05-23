package strategy

interface BorrowS {

    fun getBorrowLimit(): Int

    fun getBorrowDays(): Int
}