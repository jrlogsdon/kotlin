class ArrayLearning {

    fun learning() {
        val mutableList = mutableListOf("Coffee", "Water", "Lemonade")
        val nonMutable = listOf("Coffee", "Water", "Kool-Aid")
        var listWithReferenceThatCanBeChanged = mutableList
        // since it is a var it can be referenced
        listWithReferenceThatCanBeChanged = nonMutable.toMutableList()
        // mutableList can add or remove elements, where-as nonMutable is unable to

        listWithReferenceThatCanBeChanged.remove("Kool-Aid")

        println(listWithReferenceThatCanBeChanged)

    }
}