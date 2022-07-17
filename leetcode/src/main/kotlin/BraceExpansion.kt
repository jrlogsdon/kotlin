class BraceExpansion {
    fun expand(s: String): Array<String> {

        var strings = mutableListOf<StringBuilder>(StringBuilder())
        var i = 0
        while (i < s.length) {
            if (s[i] == '{') {
                i++
                var chars = mutableListOf<Char>()
                while (s[i] != '}') {
                    if (s[i] != ',')
                        chars.add(s[i])
                    i++;
                }
                // for each string, make # of chars copies
                var replacementStrings = mutableListOf<StringBuilder>()
                for (c in chars) {
                    for (string in strings) {
                        var stringBuilder = StringBuilder(string).append(c)
                        replacementStrings.add(stringBuilder)
                    }
                }
                strings = replacementStrings

            } else {
                for (string in strings) {
                    string.append(s[i])
                }
            }
            i++
        }
        //var arr = arrayOf()
        var result = mutableListOf<String>()
        for (string in strings) {
            result.add(string.toString())
        }
        return result.toTypedArray().sortedArray()
    }
}