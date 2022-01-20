
// in addition to not changing like all "val" variables in Kotlin
// the value will be assigned at compile time versus runtime
const val constantValue = "value that will not change"

class ClassWithConstants {
    /// done through companion object
    // difference between a regular object, companion objects are created when the object is created
    // regular object are initialized on first access to the object
    companion object {
        const val constantValue = 47
    }

}

