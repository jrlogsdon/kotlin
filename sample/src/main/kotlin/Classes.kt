fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()

    val aquarium1 = Aquarium(width = 25)
    aquarium1.printSize()

    val aquarium2 = Aquarium(height = 35, length = 110)
    aquarium2.printSize()

    val aquarium3 = Aquarium(width = 25, height = 55, length = 100)
    aquarium3.printSize()

    aquarium3.volume = 40
    aquarium3.printSize()

}

fun main() {
    buildAquarium()
}