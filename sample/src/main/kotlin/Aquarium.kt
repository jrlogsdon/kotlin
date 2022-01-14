open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40){
    init {
        println("aquarium initializing")
    }

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * .9

    fun printSize() {
        println("Width: $width cm " +
        "Length: $length cm " +
        "Height: $height cm")
        println("Volume $volume l Water: $water l (${water/volume*100.0} % full)")
    }

}