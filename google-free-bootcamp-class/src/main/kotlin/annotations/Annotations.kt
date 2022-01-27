package annotations
import kotlin.reflect.full.*

annotation class ImAPlant {}

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

@ImAPlant class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false
}

fun testReflection() {
    val classObj = Plant::class
    for (m in classObj.declaredMemberFunctions) {
        println(m.name)
    }
}

fun testAnnotations() {
    val plantObject = Plant::class
    for (a in plantObject.annotations) {
        println(a.annotationClass.simpleName)
    }
}

fun testGetters() {
    val plantObject = Plant::class
    for (a in plantObject.memberProperties) {
        println(a)
    }
}

fun labels() {
    outerLoop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (i > 10) break@outerLoop
        }
    }
}

val newPart = "----\npart"

fun main() {
    testReflection()
    println("$newPart 2")
    testAnnotations()
    println("$newPart 3")
    testGetters()
    println("$newPart 4")
    labels()
}
