fun main(args: Array<String>) {
    //Lists
    val myMap = mapOf(1 to "Lion",
        2 to 5.9,
        3 to true)

    //  println(myMap.get(false))
    // myMap[true]

    val myKeySet = myMap.keys
    println(myKeySet)

    val myAnyCollection = myMap.values
    println(myAnyCollection.joinToString())

    //Maps
    val myMap1 = mapOf(1 to "Lion",
        2 to 5.9,
        3 to true)

    //  println(myMap.get(false))
    // myMap1[true]
    val myKeySet1 = myMap1.keys
    println(myKeySet1)
    val myAnyCollection1 = myMap1.values
    println(myAnyCollection1.joinToString())

    //extension function vs generic
    val animalList = listOf("Lion", "Tiger", "Elephant", "Leopard", "Cat")
    println(animalList.orderByStars())

    val myAnyList: List<Any> = listOf(1, "Cat", 5.7, true)
    println(myAnyList.orderByStars())
}

//extension function vs generic
fun List<Any>.orderByStars() : String {
    val mySeparator = "\n ***"
    return this.map { "$it" }.joinToString(mySeparator, mySeparator, "\n")
}
