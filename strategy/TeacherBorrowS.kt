package strategy

class TeacherBorrowS : BorrowS {

    override fun getBorrowLimit(): Int {
        return 10
    }

    override fun getBorrowDays(): Int {
        return 30
    }
}