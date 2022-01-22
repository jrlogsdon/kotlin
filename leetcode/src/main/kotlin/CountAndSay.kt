class CountAndSay {
    fun countAndSay(n: Int): String {
        var said = "1"
        for (i in 2..n) {
            var count = 1
            var temp = ""
            for (j in 0..said.length - 1) {
                if (j + 1 < said.length && said[j] == said[j + 1]) {
                    count++
                } else {
                    temp = temp + count.toString() + said[j]
                    count = 1
                }
            }
            said = temp
        }
        return said

    }
}