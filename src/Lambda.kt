fun lambda(){
    val myName: (String, String) -> String = {firstName:String, lastName:String->
        val age = 24
        "Hello $firstName $lastName, age: $age"
    }

    val greeting = myName("Segun", "Olanitori")

//    println(greeting)

    //kotlin can infer lambda type
    val myAge = {currentYear:Int, birthYear:Int -> currentYear - birthYear}

//    println(myAge(2021, 1998))
logger {
    println("hello world")
}
//    lineLogger("Hello There", "Hello Again")
}

fun lineLogger(message:String, message2:String){
    repeat(2) { println("------")}
    println(message)
    println(message2)
    repeat(2){ println("-----")}
}

//lambda inside of function parameter
//8:40 for more functionalities
fun logger(block: () -> Unit){
    println("before block runs")
    block()
    println(
        "after block runs"
    )
}