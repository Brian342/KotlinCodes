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
fun sayHello(itemToGreet:String, greeting:String) = println("$greeting,$itemToGreet")
//    val msg = "Hello $itemToGreet"
    // This function takes on parameters


fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(1))

//    for (interesting in interestingThings) {
//        println(interesting)
//    }
//    interestingThings .forEach { interestingThing ->
//    println(interestingThing)
//    }
    interestingThings . forEach {
println(it) // default variable name for the interestingThings
    }
//    println("Hello World")
//    println(getGreeting())
//    sayHello()
//    sayHello(greeting = "Hey ", itemToGreet = "Kotlin")
//    sayHello(greeting = "Hello ", itemToGreet = "World")

}