fun whenStatement(){
    //inbuilt data classes in Kotlin, you dont have to write your data class
    val pair = Pair("foo", "bar")
    //or
    val pair2 = "foo" to "bar"

    //triple
    val triple = Triple(5, "Names", "Noise Makers")


//    val user = User("Segun", "Tayo", false)

//    when(user.firstName){
//        "Segun" -> println("this is segun")
//        "Ola" -> println("This is Ola")
//        else -> println("Neither here nor there")
//    }

//when without a bracket
//    when{
//        user.lastName == "Tayo" -> println("Last name is Tayo")
//        else -> println("Not Tayo")
//    }



    //you have to add an else or all the enum types  when working with enums in when statement
//    val accountType = AccountType.GOLD
//    val message = when (accountType) {
//        AccountType.GOLD ->"Gold Member"
//        else ->  "not eligible"
//    }
//    println(message)

    val p1 = Person("Jon", "Doe")
    val p2 = Person("Jon", "Doe")
//returns true cos it's a data class
//    println(p1==p2)
//    println(p1.fullName())

    //data classes give you access to components which represent parameters passed into the class
//    val firstName = p1.component1()
//    val lastName = p1.component2()

    //destructuring - could be named anything
//    val (firstName, lastName) = p1
//    println(firstName)
//    println(lastName)

    //copy values from a class
//    var sibling = p1.copy()

}

//a data class represent sa class that just carries data.
//normal when you equal two instances of the same class with the same values it returns false,
//but with the data keyword they become true
data class Person(val firstName:String, val lastName:String){
    fun fullName():String{
        return "$firstName $lastName"
    }
}