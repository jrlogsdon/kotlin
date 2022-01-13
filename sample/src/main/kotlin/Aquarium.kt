class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40){
    init {
        println("aquarium initializing")
    }

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println("Width: $width cm " +
        "Length: $length cm " +
        "Height: $height cm")
        println("Volume $volume l")
    }

}