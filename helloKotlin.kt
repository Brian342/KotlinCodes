val number = 1234
val name: String? = null // top level variables
var greeting: String? = "Hello"

fun main() {
    // val is a read only keyword meaning it only assigned to one variable
    // var can be assigned to another keyword
//    name = "Kimanzi"
    if(greeting != null){
        println(greeting)

    } else {
        greeting = "hi"

    }

    println(name)

    println(greeting)
    print(name)
    when (greeting){

    }
}
