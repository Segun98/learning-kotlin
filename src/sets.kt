fun sets (){

    //sets are unique
    val names = mutableSetOf<String>("Donn", "Jonn","Felicia")

    names.add("olant")
    names.add("olant")

    //wont print 2 olants
//    println(names)

    //classes are normally different, but are the same since it's a data class
    val people = setOf(
        Persons("Donn"),
        Persons("Donn"),
    )

    val anotherPerson = listOf(Persons("Freddy"))
    val anotherPerson2 = listOf(Persons("Thomas"))
    val anotherPerson3 = listOf(Persons("Freddy"))

    val uniqueValues = anotherPerson.union(anotherPerson2).union(anotherPerson3)
//doesn't print Freddy twice
println(uniqueValues)


}

data class Persons(val name:String)