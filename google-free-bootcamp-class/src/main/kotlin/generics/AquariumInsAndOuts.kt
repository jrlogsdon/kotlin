package generics
// key word out - lets the compiler ensure nothing unsafe is happening with the type
class AquariumForGenerics<T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }

}
inline fun <reified R: WaterSupply> AquariumForGenerics<*>.hasWaterSupplyOfType() = waterSupply is R

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply : T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean (waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun addItemTo(aquarium: AquariumForGenerics<WaterSupply>) = println("item added")

fun <T: WaterSupply> isWaterClean(aquarium: AquariumForGenerics<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

class OceanWater : WaterSupply(false) {}

fun generic() {
    val cleaner = TapWaterCleaner()
    val aquarium = AquariumForGenerics(TapWater())
    aquarium.addWater(cleaner)
}

fun genericTwo() {
    val aquarium = AquariumForGenerics(TapWater())
    isWaterClean(aquarium)
}

fun genericUsingReifiedVar() {
    val aquarium = AquariumForGenerics(TapWater())
    println(aquarium.hasWaterSupplyOfType<TapWater>())
    println(aquarium.hasWaterSupplyOfType<OceanWater>())
}

fun main() {
    generic()
    println("----\npart2")
    genericTwo()
    println("----\npart3")
    genericUsingReifiedVar()
}

class TapWaterOut : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}