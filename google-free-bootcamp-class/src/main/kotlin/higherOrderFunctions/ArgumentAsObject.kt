package higherOrderFunctions

import java.util.*

// another higher order function which is an object
fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

data class Fish(var name: String)

inline fun fishExampleOne() {
    val fish = Fish("splashy")

    myWith(fish.name) {
        println(replaceFirstChar({ if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }))
    }
    // without making it inline creates something like:
    // myWith(fish.name, object : Function1<String, Unit> {
    //    override fun invoke(name: String) {
    //        name.capitalize()
    //    }
    //})
    // with inline goes to fish.name.capitalize() making the compiler do the work

}

fun fishExampleTwo() {
    val fish = Fish(name = "splashy").apply {
        name = "sharky"
    }
    println(fish.name)

}

fun main() {
    fishExampleOne()
    println("\n")
    fishExampleTwo()
}
