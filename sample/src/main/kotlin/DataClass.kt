// data class creates equals, printing, and easy copying of contents
data class Decoration(val rocks: String) {

}

data class AdvancedDecoration(val decoration: Decoration, val color: String) {

}

fun makeDecorations() {
    val decoration = Decoration("granite")
    println(decoration)
    val decoration2 = Decoration("slate")
    val decoration3 = Decoration("granite")

    println("first and 2nd: ${decoration.equals(decoration2)}")
    println("first and 3rd: ${decoration.equals(decoration3)}")

    //destructuring - prints only "granite" not the class object - does not need to match string it goes based off ordering
    val (rocks) = decoration

    println(rocks)

    val advancedDecoration = AdvancedDecoration(decoration, "blue")
    println(advancedDecoration)
    //skipping destructured value
    val (_ , color) = advancedDecoration
    println(color)
}

fun main() {
    makeDecorations()
}