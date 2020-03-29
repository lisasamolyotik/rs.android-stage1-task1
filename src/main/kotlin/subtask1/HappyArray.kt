package subtask1

import java.net.Inet4Address

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (isHappy(sadArray)) return sadArray
        var counter: Int = 0
        for(i in 1..sadArray.size-2) {
            if(sadArray[i-1] + sadArray[i+1] < sadArray[i]) {
                counter++
            }
        }
        val happyArray: IntArray = IntArray(sadArray.size - counter)
        var j: Int = 0
        happyArray[0] = sadArray[0]
        for (k in 1..sadArray.size-2) {
            if (sadArray[k-1] + sadArray[k+1] < sadArray[k]) {
                j++
            } else {
                happyArray[k-j] = sadArray[k]
            }
        }
        happyArray[happyArray.size-1] = sadArray[sadArray.size-1]
        return if(isHappy(happyArray)) happyArray else convertToHappy(happyArray)
    }

    private fun isHappy(array: IntArray): Boolean {
        var i: Int = 1
        while(i < array.size-1) {
            if (array[i-1] + array[i+1] < array[i]) {
                return false
            }
            i++
        }
        return true
    }
}