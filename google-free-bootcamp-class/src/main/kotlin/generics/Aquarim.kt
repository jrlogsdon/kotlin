package generics

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println("needs processing? ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("needs processing? ${aquarium.waterSupply.needsProcessing}")
}

fun genericsExampleTwo() {
    // aquarium takes any type even if it isn't of type water supply
    // no longer works when switching to type WaterSupply for Aquarium
    //val aquarium = Aquarium("string")
    //println(aquarium.waterSupply)
}

fun genericsExampleThree() {
    // aquarium takes any type even if it isn't of type water supply
    // no longer works when switching to type WaterSupply for Aquarium
    //val aquarium = Aquarium(null)
    //println("waterSupply is ${aquarium.waterSupply}")
}

fun genericsExampleFour() {
    val aquarium = Aquarium(LakeWater())
    aquarium.waterSupply.filter()
    aquarium.addWater()
}

fun main() {
    genericsExample()
    println("------\npart2")
    genericsExampleTwo()
    println("------\npart3")
    genericsExampleThree()
    println("------\npart4")
    genericsExampleFour()

}

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        // throws exception if it isn't matched
        check(!waterSupply.needsProcessing) {
            "water supply needs processing first"
        }
        println("adding water to $waterSupply")
    }
}

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}