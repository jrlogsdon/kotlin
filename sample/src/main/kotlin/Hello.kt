import java.util.*

fun main(args: Array<String>) {

    for (i in 1..5) {
        feedTheFish()
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish ate $food")
    println("Change water: ${shouldChangeWater(day)}")

}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20) : Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun randomDay() : String {

    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
        "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String) : String {
    return when (day) {
        "Monday" ->  "flakes"
        "Tuesday" ->  "pellets"
        "Wednesday" ->  "red worms"
        "Thursday" ->  "granules"
        "Friday" ->  "mosquitoes"
        "Saturday" ->  "lettuce"
        "Sunday" ->  "plankton"
        else ->  "nothing"
    }
}

