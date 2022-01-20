fun main() {
    val pairExample = "dog" to "frisbee"
    println(pairExample.first)
    println(pairExample.second)

    println(pairExample)

    val triple = Triple(1, "two", 3)
    println(triple.first)


    val chainedPair = ("dog" to "frisbee") to "play"
    println(chainedPair)

    println(chainedPair.first.first)

}