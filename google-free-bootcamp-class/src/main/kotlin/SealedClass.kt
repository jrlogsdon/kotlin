// sealed classes can only be subclasses within the same file
// no one would be able to create a different type of Seal outside of this
sealed class Seal(val type: String)

class SeaLion: Seal("sea lion")
class Walrus : Seal("walrus")

fun main() {

    val seaLion = SeaLion()
    val walrus = Walrus()

    println(seaLion.type)
    println(walrus.type)

}

