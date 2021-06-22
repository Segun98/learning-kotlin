
//you could write this without a "constructor" keyword: 1:46
class User constructor(var firstName:String, var lastName: String, var isPlatinum: Boolean){

//companion object is similar to a static method which allows you call a method directly
    companion object{
    val users = mutableListOf<User>()

    fun createusers(count:Int):List<User>{

        //access the constants file
        //Constants.MAX_AGE

for (i in 0..count){
    users.add(User("YAy $i", "mumu", false))
}
        return users
    }

        fun createUser(firstName: String, lastName: String, isPlatinum: Boolean):User{
            return User(firstName, lastName, isPlatinum)
        }
    }
    //prefix something before a variable
//    var namee = "$firstName $lastName"
//    get() = "Full Name: $field"
//    set(value) {
//        if (value.startsWith("tola")){
//            field = "Segun"
//        }
//    }


    //runs immediately the primary constructor is invoked... runs before secondary constructors
//init {
//    println("Hello Class")
//}
//you could declare variables inside the class as an alternative to not using a construcor
//    var firstName: String = ""
//    var lastName: String = ""
//

    //secondary constructor, used to pass a default value, isPlatinum in this case
//    constructor(firstName: String, lastName: String): this(firstName, lastName, false){
//println(isPlatinum)
//    }
//
//
//    fun printFullName (){
//        println("$firstName $lastName")
//    }
//
//    fun printWithPrefix(prefix:String){
//        println("$prefix $lastName")
//    }
//
//    fun updateName(newName:String){
//      lastName=newName
//        println("$firstName $lastName")
//
//    }


}