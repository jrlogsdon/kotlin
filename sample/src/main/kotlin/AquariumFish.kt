abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

class Shark : AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("Eat algae")
    }
}

interface FishAction {
    fun eat()
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    shark.eat()
    println("Shark: ${shark.color}")

    pleco.eat()
    println("Plecostomus: ${pleco.color}")
}

fun main() {
    makeFish()
}