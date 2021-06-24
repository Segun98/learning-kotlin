fun sequence(){

    measure {
        listOf("A","B","C")
            .filter{
                println("filter: $it")
                true
            }
            .forEach{
                println("forEach: $it")
            }

    }

    println("-------")

    measure {
        sequenceOf("A","B","C")
            .filter{
                println("filter: $it")
                true
            }
            .forEach{
                println("forEach: $it")
            }
    }

}