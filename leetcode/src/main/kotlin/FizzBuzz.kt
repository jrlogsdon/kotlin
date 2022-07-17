package main.kotlin

class FizzBuzz {

    fun fizzBuzz(n: Int) : List<String> {
        val ans: Array<String?> = arrayOfNulls(n);
        for (i in 1..n) {
            if (i % 3 == 0) {
                ans[i - 1] = "Fizz"
            }
            if (i % 5 == 0) {
                if (ans[i-1].isNullOrBlank()) {
                    ans[i-1] = "Buzz";
                } else {
                    ans[i-1] += "Buzz";
                }
            }
            if (i % 3 != 0 && i % 5 != 0) {
                ans[i-1] = i.toString();
            }
        }
        return ans.toList().requireNoNulls();
    }

    fun fizzBuzzWithMutableList(n: Int) : List<String> {
        val answer = mutableListOf<String>()
        for (i in 1 .. n) {
            if (i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz")
            } else if (i % 3 == 0) {
                answer.add("Fizz")
            } else if (i % 5 == 0) {
                answer.add("Buzz")
            }
            else {
                answer.add(i.toString())
            }
        }
        return answer;
    }

}