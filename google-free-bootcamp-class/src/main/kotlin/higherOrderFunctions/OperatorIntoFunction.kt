package higherOrderFunctions

// higher order function (takes a function)
fun updateDirty(dirty : Int, operation: (Int) -> Int): Int {

    return operation(dirty)
}

// compact function
fun increaseDirty( start : Int) = start + 1

fun main() {
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    // lambda
    println(waterFilter(dirtyLevel))

    dirtyLevel = updateDirty(30, waterFilter)
    println(dirtyLevel)

    println("\n-----\npassing in normal function as an operator to a higher order function")
    println(updateDirty(20, ::increaseDirty))

    println("\n\nspecial syntax for last parameter as lambda")
    println(updateDirty(20) { it + 23})

}