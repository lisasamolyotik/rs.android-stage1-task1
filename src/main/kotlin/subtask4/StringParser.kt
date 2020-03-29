package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var result: MutableSet<String> = mutableSetOf()
        for( i in inputString.indices) {
            var openBracket = inputString[i]
            if (openBracket == '[' || openBracket == '(' || openBracket == '<') {
                var closeBracket = findCloseBracket(openBracket)
                var isCloseBracketMet: Boolean = false
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == closeBracket) {
                        result.add(inputString.substring(i+1, j))
                        isCloseBracketMet = true
                    }
                    if (inputString[j] == openBracket && isCloseBracketMet) {
                        break
                    }
                }
            }
        }
        return result.toTypedArray()
    }

    private  fun findCloseBracket (openBracket: Char): Char =
        when (openBracket) {
            '[' -> ']'
            '(' -> ')'
            '<' -> '>'
            else -> '0'
        }
}
