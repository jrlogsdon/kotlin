package higherOrderFunctions

import java.util.*

// another higher order
fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

data class Fish(var name: String)

fun fishExampleOne() {
    val fish = Fish("splashy")
    myWith(fish.name) {
        println(replaceFirstChar({ if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }))
    }
}

fun fishExampleTwo() {
    val fish = Fish(name = "splashy").apply {
        name = "sharky"
    }
    println(fish.name)

}

fun main() {
    fishExampleOne()
    println("\n\n")
    fishExampleTwo()
}