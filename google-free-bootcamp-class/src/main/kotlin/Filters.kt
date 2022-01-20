
val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {

    val eager = decorations.filter{it[0] == 'p'}

    println(eager)

    val lazy = decorations.asSequence().filter {it[0] == 'p'}
    // is a FilteringSequence Object
    println(lazy)

    // if one wants the list of objects
    println("manually converting to list: ${lazy.toList()}")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("\n\nLazy Map part")
    println("lazy: $lazyMap")
    println("first: ${lazyMap.first()}")
    println("\n\n--toList calls inner parts, which will print the access portion of above code")
    println("lazy map as a list ${lazyMap.toList()}")

    println("\n\nLazy Map Part 2")
    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p'}.map {
        println("access $it")
        it
    }
    println("filtered: ${lazyMap2.toList()}")


}