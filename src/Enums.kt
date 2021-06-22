enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM;

    //adding functions

    companion object{
        fun getAccountTypeByName(name:String) = valueOf(name.uppercase())
    }
}

//enums with default values

enum class AccountTypeTwo(val discountPercent:Int){
    BRONZE(20),
    SILVER(15),
    GOLD(39),
    PLATINUM(40)
}

//implementing an abstract method inside of an enum. Also a wa of passing default values

enum class AccountTypeThree {
    BRONZE{
        override fun discountPercentage() = 18
          },
    SILVER{
        override fun discountPercentage() = 10
    },
    GOLD{
        override fun discountPercentage() = 25
    },
    PLATINUM{
        override fun discountPercentage() = 15
    };

    abstract fun  discountPercentage():Int
}