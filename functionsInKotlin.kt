//fun getGreeting(): String = "Hello Kotlin"
////fun getGreeting() = "hello Kotlin"
//fun getGreeting(): String{
//    return "Hello Kotlin"
//}


//fun sayHello(): Unit{
//fun sayHello(){
//// Unit is similar to saying this returns nothing useful used when we don't want to return anything
//    println(getGreeting())
//}
//fun sayHello(itemToGreet:String, greeting:String) = println("$greeting,$itemToGreet")
//    val msg = "Hello $itemToGreet"
    // This function takes on parameters

// list of Strings
fun sayHello(greeting:String, itemToGreet:List<String>){
    itemToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
//    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    val interestingThings = listOf("Kotlin", "programming", "Comic Books")
    sayHello(greeting = "Hi", interestingThings)

//    interestingThings . forEach{ interestingThing ->
//        println(interestingThing)
//    }
//    val msg = mapOf(1 to "a", 2 to "b", 3 to "c")
//    msg.forEach { (key, value) -> println("$key -> $value")}

    // using MutableListOf
//    val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
//    interestingThings.add("Dogs")
//
//    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//    map.forEach { (key, value) -> println("$key -> $value") }
//    map.put(4, "d")

//    interestingThings[0]
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(1))

//    for (interesting in interestingThings) {
//        println(interesting)
//    }
//    interestingThings .forEach { interestingThing ->
//    println(interestingThing) // using lambda expressions
//    }
//    interestingThings . forEach {
//println(it) // default variable name for the interestingThings
//    }
//    interestingThings.forEachIndexed{index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }
//    println("Hello World")
//    println(getGreeting())
//    sayHello()
//    sayHello(greeting = "Hey ", itemToGreet = "Kotlin")
//    sayHello(greeting = "Hello ", itemToGreet = "World")

}