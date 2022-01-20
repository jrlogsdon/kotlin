// Enums are singletons
enum class Direction (val degrees: Int){
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(Direction.EAST.name)
    println(Direction.EAST.degrees)
    println(Direction.EAST.ordinal)

}