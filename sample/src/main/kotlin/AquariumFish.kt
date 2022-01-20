abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

class Shark : AquariumFish(), FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

// interace delegation on FishColor
class Plecostomus(fishColor: FishColor = GoldColor): AquariumFish(), FishAction, FishColor by fishColor  {
    override fun eat() {
        println("Eat algae")
    }
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
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


    val secondpleco = Plecostomus(fishColor = BlueColor)
    println("Pleco: ${secondpleco.color}")
}

fun main() {
    makeFish()
}

// object is used for creating a single instance of something
object GoldColor : FishColor {
    override val color = "golden"
}

object BlueColor : FishColor {
    override val color = "blue"
}