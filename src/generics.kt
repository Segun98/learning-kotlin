fun generics(){
    val map: Map<String, Int> = mapOf("Donn" to 32, "Tushan" to 42)

    val listOfString = listOf("Donn", "Felker", "Ace")

//    println(map)
    val result = EvenList<String>(listOfString)
    println(result.items())

    val otherResult =  EvenList(listOf(1,2,3,4,5))
    println(otherResult.items())
}

//generic class

class EvenList<T>(val list: List<T>){
    fun items(): List<T>{
        return list.filterIndexed {index, value -> index % 2 == 0}
    }
}