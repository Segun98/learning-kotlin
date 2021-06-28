import com.example.utils.Upper

fun main(){

//extensions at 7:50. allows you build on primitive types and also classes. eg fun String.isAdult(){}
//    println("hello".Upper())

    //  lazy variables 8:00
//    generics()

//    nullCheck()

//casting in kotlin . 7:00
//    sequence()
//    maps()
//    loops()
//sets()
//    lists()
//    val v =Vehicle("blue")
//    val t= Truck("yellow")
//t.addAxel(3)

//    whenStatement()
//var chef= Chef()
//    chef.setMyFavoriteFood("Beans")

    //enums
//    val accountType = AccountType.getAccountTypeByName("silver")
//    println(accountType)

    //iterate enums
//    AccountType.values().forEach { println(it) }
//    val accountTypeFromApi = "gold"
//    val accountType = AccountType.valueOf(accountTypeFromApi.uppercase())
//    println(accountType)
//println(AccountTypeTwo.BRONZE.discountPercent )


//    var freddy = AnotherUser()
//    println(freddy.helloAnotherUser())
//    freddy.favoriteCity =  "New York"
//
//    println(freddy.favoriteCity)

//    println("Hello world!")
//    var fullName = "Segun Olanitori"
//    println(fullName)
//
//   fullName = "Not Segun"
//
//    println(fullName)
//
//       fullName=""
//
//    println(fullName.isEmpty())
//
//    //readonlny variables
//    val name = "mr segun"
//
//    //check the type of the variable
//    println(name::class)
//
//    val myByte: Byte = 8 // 8-bit signed integer
//    val myShort: Short = 16 //16-bit signed integer
//    val myInt: Int =  32 // 32-bit signed integer
//    val myLong: Long = 64 // 64-bit signed integer
//
//    val myFloat: Float = 32.00F // 32-bit float
//    var myDouble: Double = 64.00 //64-bit number
//
////    println(myByte.toDouble()::class )
//
//    val bigLong: Long = 1_000_000
////    println(bigLong)
//
//    //operations
////    val newInt = myInt + 12
////    println(newInt)
//
////    built in operations methods
//    println(myInt.plus(13))
//
//    //char- a single character representation
//
////    val c: Char = 'x'  //16-bit unicode character
//
//    //Line break
////    println("""
////        hello,
////        how are you doing
////    """.trimIndent())
//
////    val firstName = "Segun"
////    println("Hello, your first name is $firstName and it is ${firstName.length} characters long")
//
////Booleans
////    var isBlank: Boolean = false
//
////    println(isBlank)
//
//    //conditionals
////
////    var calories: Int =1750
////
////    if (calories > 2000){
////        println("You've consumed all the calories for the day")
////    } else if (calories > 1500){
////        println("you have more calories to eat")
////    } else{
////        println("You still have some calories left")
////    }
//
//    //without curly braces
////    val age: Int = 10
////
////    if (age > 9) println("The age is greater than 9") else println("it's not greater than 9")
////
////    if (age != 5 && age > 3){
////        println("hello")
////        } else {
////        println("hi")
////        }
//
//
//    //structural equality
////    var name1 = "Segun"
////    var name2 = "Ola"
//
////    println(name1==name2)
//    //or
////    println(name1.equals(name2))
//
//non nullable references
    var name: String = "Don"
//won't work
//    name = null
    var name2:String? = "Dada"
    name2=null
//println(name2)

    var length = name2?.substring(0,2)?.length
//println(length)
//    elvis operator
//    println(name2?.substring(0,2)?.length ?: "it is null")

//    var x = sayHi()
//    println(x)

//    doWork(20, "Segun", true)
//    doWork(55, "Dami", false)
//    doWork(14, "Tolu", true)
//    doWork(18, "Solomon", false)

//    printBookInfo("50 shades", "Kevin")
//        printBookInfo("HTGWAM", "Collins", "Friday")
//    printBookInfo("Sparrow", "Arthur", "FREDDY", "Segun", "Dami")

//    var user = User("Freddy", "Benson")
//    println(user.namee)
//
//    user.namee= "tola"
//
//    print(user.namee)
//
//    user.firstName = "Don"
//    user.lastName = "Gaga"
//    user.printFullName()
//user.updateName("Obi")
//user.printWithPrefix("Mr.")

//    var friend = User("Thomas", "Shelby")
    //this doesn't override the assignment above
//    friend.firstName = "Oga"
//    friend.lastName = "Boss"
//friend.printFullName()
//friend.printWithPrefix("Mrs.")


    //I can call the companion object "createUser' directly
//
//    var newUser = User.createUser("Segun", "Olanitori", false)
//    println(newUser)
//
//    val users = User.createusers(5)
//    println(users)
}

//single line functions
//fun sayHi()=println("hello world!")


//fun doWork(age:Int, name:String, isHappy:Boolean){
//    if (isHappy){
//        println("Glad you are happy $name, we will like to learn why you are, to help people in the age range of $age")
//    }else{
//        println("Sad to hear you are not happy ${name}, you have been automatically signed up for our free therapy class for age $age")
//    }
//}

//vararg represents helps take in multiple arguments
//fun printBookInfo(title:String, vararg authors: String){
//    authors.forEach { println("The author of $title is $it") }
//}


