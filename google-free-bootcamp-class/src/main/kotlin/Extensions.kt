fun String.hasSpaces() = find {it == ' '} != null

fun main() {
    println("testing".hasSpaces())
    println("has spaces".hasSpaces())

    fun AquariumPlant.print() = println("AquariumPlant")
    fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()

    println(aquariumPlant.isGreen)
}

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

// adding isGreen property
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

