fun lists(){

    //video time: 4hr thereabout

//    listOf is immutable
    var ages = listOf<Int>(27,29,25,14,35, 16)

    var names = listOf("segun","tola", "andibob")

    var shortestNames = names.filter { it.length <6 }

//    println(shortestNames)

    var adults = ages.filter{it >= 18}
//println(adults)

    println("-------")

    //how to pass in a function
    var children = ages.filter(::children)

//    println(children)

    //merge a list into another based on a condition
    var newList = mutableListOf<String>("Sunday","Igboho")
    names.filterTo(newList) { it.contains("") }
//    println(newList)

    //5:10 hr
    val mine = listOf<String>("Apples","Grapes")
    val theirs = listOf<String>("Oranges", "Pears", "Strawberries")
    val others = listOf<String>("Kiwi", "Watermelon")
    val allOfUs = listOf(mine, theirs, others)

    //flattens to a single list
//println(allOfUs.flatten())

    //merge lists easily..
//    println(mine.plus(theirs).plus(others))

    //map
    val square = ages.map(::checking)
println(square)

}

fun checking(value: Int):Int{

    return value * 2
}
fun children (value:Int):Boolean{

    return value < 18
}