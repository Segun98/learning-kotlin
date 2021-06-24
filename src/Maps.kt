import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun maps(){

//    measure {
//        val list = generateSequence(1) { it + 1 }
//            .take(50_000_000)
//            .toList()
//
//        val result = list.filter { it % 3 == 0 }
//                    .average()
//
//        println(result)
//    }
//    val states = mapOf(
//        "NY" to "New York",
//        "NJ" to "New Jersey",
//        "CA" to "California"
//    )

//    val result = states["NY"] // or states.get("NY")
//get default values   states.getOrDefault("XX", "it's Unknown")

//    for (state in states){
//        println(state)
//    }
//    val items = mutableMapOf(
//        "NY" to "New York",
//        "NJ" to "New Jersey",
//        "CA" to "California"
//    )

//    items["TX"] = "Texas" // or items.put("TX", "Texas")
//items.remove("NY").. //items.putIfAbsent() //6.04 min 
//    println(items)

    //check if there's something in the map

//    if (items.any()){
//        println("its not empty")
//    }
//
//    if (items.none()){
//        println("There are no entries")
//    }
//




}

//a helper to measure how long your code executes
fun measure(block: ()-> Unit){
    val nanotime = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nanotime)
    println("$millis ms")
}