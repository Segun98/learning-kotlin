fun maps(){
    val states = mapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California"
    )

    val result = states["NY"] // or states.get("NY")
//get default values   states.getOrDefault("XX", "it's Unknown")

//    for (state in states){
//        println(state)
//    }
    val items = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California"
    )

    items["TX"] = "Texas" // or items.put("TX", "Texas")
//items.remove("NY").. //items.putIfAbsent() //6.04 min 
    println(items)
}