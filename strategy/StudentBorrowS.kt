package strategy

class StudentBorrowS : BorrowS{

    override fun getBorrowLimit(): Int {
        return 3
    }

    override fun getBorrowDays(): Int {
        return 7
    }
}