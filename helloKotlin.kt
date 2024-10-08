val number = 1234
val name = "Brian" // top level variables
var greeting: String? = "Hello"

fun main() {
    greeting = "nate"
    val greetingtoprint = if(greeting != null) greeting else "hi"

    // val is a read only keyword meaning it only assigned to one variable
    // var can be assigned to another keyword
//    name = "Kimanzi"
//    if(greeting != null){
//        println(greeting)
//
//    } else {
//        greeting = "hi"
//
//    }

//    println(name)
//
//    greeting = "Hello"
//    when (greeting){
//            null -> println("Hi")
//            else -> println(greeting)
//
//    }
    println(greetingtoprint)
    println(name)
}
