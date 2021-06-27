fun nullCheck() {
    
//    val names = listOf("Donn", "Ace", "Brad", "Jon", "Doe", null)
//    println(names.filterNotNull())


    //declare a variable as any if you want to later check the type with the 'is' keyword
//    val age:Any = 24
//
//    when(age){
//        is String -> println("Age is a String")
//        is Boolean -> println("Age is a Boolean")
//        is Int -> println("Age is an integer")
//        else -> println(age)
//    }
//
//7:10
    val obj:Any = getStuff("3")

    val casted = obj as? Int

    println(casted)

//    val name: String? = "null"
//
//    //!! forces a nullable value to be non nullable
//    val length: Int? = name?.length
//
//    println(length)
}

fun getStuff(value:String):Any{
    return when (value){
        "1"->99
        "2"-> "Hello"
        "3" -> true
        else -> false
}

}
