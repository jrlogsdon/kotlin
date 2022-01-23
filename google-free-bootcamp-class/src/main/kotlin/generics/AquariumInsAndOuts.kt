package generics
// key word out - lets the compiler ensure nothing unsafe is happening with the type
class AquariumOut<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply : T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean (waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun addItemTo(aquarium: AquariumOut<WaterSupply>) = println("item added")

fun generic() {
    val cleaner = TapWaterCleaner()
    val aquarium = AquariumOut(TapWater())
    aquarium.addWater(cleaner)
}

fun main() {
    generic()
}
