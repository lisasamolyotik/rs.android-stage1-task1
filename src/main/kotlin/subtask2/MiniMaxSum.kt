package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val minMaxArray: IntArray = IntArray(2)
        minMaxArray[0] = input.sum() - input.max()!!
        minMaxArray[1] = input.sum() - input.min()!!
        return minMaxArray
    }

}
