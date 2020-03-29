package subtask3

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val b_actual = (bill.sum() - bill[k]) / 2
        if (b == b_actual) {
            return "Bon Appetit"
        }
        return (b - b_actual).toString()
    }
}
