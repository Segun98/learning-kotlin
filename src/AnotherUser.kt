//to make this class inheritable/extendable add the open keyword
open class AnotherUser {
    //enum
    var accountType:AccountType = AccountType.GOLD


    //use 'lateinit' to declare unintialized variables in a Class
    lateinit var favoriteCity: String

    //it's protect ed, so you can't change the value from other classes thst do not inherit from it.
    protected var friend: String = "Segun"

    protected fun helloAnotherUser(){
        println("I am another user")
    }


    //nested classes.
    //nested classes can't access variables of the out class, you ned to specify that its an 'inner' class to be able to access that

    inner class Age{
        val ageAtBirth = 5

        //with inner, i can
        fun outerVar() = println(friend)
    }
}

class Chef: AnotherUser() {

    fun setMyFavoriteFood(food:String){
        friend = food
        println(friend)
    }
}

//internal keyword makes the class inaccessible to the public
internal class Axle(val numberOfWheels:Int){

}

open class Vehicle(var color:String){
    private lateinit var axles:MutableList<Axle>

    fun info(){
        println("The vehicle is $color")
    }

    fun addAxel(noOfWheels:Int){
        axles.add(Axle(noOfWheels))
    }
}

class Truck(color:String):Vehicle(color){
    init{
//        axles =arrayOf(Axle(2), Axle(4))
        addAxel(2)
        addAxel(4)
    }
}

//abstract classes cannot be instantiated. 3:55
abstract class Author(var book:String){

}