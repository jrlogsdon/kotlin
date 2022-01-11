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

}

fun randomDay() : String {

    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
        "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String) : String {
    return when (day) {
        "Monday" ->  "flakes"
        "Tuesday" ->  "pellets"
        "Wednesday" ->  "redworms"
        "Thursday" ->  "granules"
        "Friday" ->  "mosquitoes"
        "Saturday" ->  "lettuce"
        "Sunday" ->  "plankton"
        else ->  "nothing"
    }
}
