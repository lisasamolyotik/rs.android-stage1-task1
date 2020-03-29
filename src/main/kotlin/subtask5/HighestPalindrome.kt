package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var result = digitString.toCharArray()
        val lastIndex = n - 1
        var differenceCounter = 0
        for(i in 0..lastIndex / 2) {
            if (result[i] != result[lastIndex-i]) {
                differenceCounter++
            }
            if (differenceCounter >= k && i < (lastIndex / 2)) {
                return "-1"
            }
        }
        var counter = k - differenceCounter
        for (i in 0..lastIndex / 2) {
            if(result[i] != result[lastIndex - i] && counter > 0) {
                result[i] = '9'
                result[lastIndex - i] = '9'
                counter -= 2
            } else if (result[i] != result[lastIndex - i]) {
                if(result[i] > result[lastIndex - i]) {
                    result[lastIndex - i] = result[i]
                } else {
                    result[i] = result[lastIndex - i]
                }
            }
        }
        return String(result)
    }
}
