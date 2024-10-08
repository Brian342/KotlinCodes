val names = "Nate"
var greetings: String? = null
fun main() {
    val greetingToPrint = when(greeting){
// when expressions works as the switch expressions in java
        null -> "hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}