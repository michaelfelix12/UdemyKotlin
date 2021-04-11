fun main() {
    //list
    val fruitList = listOf("Apple", "Orange", "Cucumber")
    val fruitArrayList = arrayListOf("Apple", "Orange", "Cucumber")

    println(fruitList[0])
    println(fruitArrayList[1])

    val emptyList: List<Int> = listOf()
    val emptyArrayList: ArrayList<Double> = arrayListOf()

    //mutable list (by using mutable list you can update the values inside the list
    val foodList = mutableListOf("Burger","Pizza","Fish")
    //empty mutable list
    val emptyMutableList: List<Int> = mutableListOf()

    //properties and methods
    val users = mutableListOf("Jack", "John","Rosa","Mike")
    if(users.isEmpty()) {
        println("List is empty, sorry")
    } else {
        println("List is not empty, continue")
    }
    if (users.size > 5) {
        println("continue")
    } else {
        println("sorry")
    }
    println(users.first())
    println(users.last())

    println(users.min())
    println(users.max())

    //List
    val userAge = listOf(24, 25, 26, 27, 28, 29)
    println(userAge.min())
    println(userAge.max())

    //indexing
    val animals = arrayOf("Lion","Tiger","Cat","Bird", "Fox", "Elephant")
    println(animals[2])

    //slice by ranges
    println(animals.joinToString())

    val firstTwoAnimals = animals.slice(0..1)
    println(firstTwoAnimals.joinToString())

    val nextTwoAnimals = animals.slice(2..3)
    println(nextTwoAnimals.joinToString())

    //in
    println(isAnimalRemoved("Lion", animals))

    //return
    println(doesAnimalExist("Tiger", animals))

    //other way
    if (animals.contains("Leopard")) {
        println("Leopard Exists")
    } else {
        println("Leopard does not exist")
    }
    if (animals.slice(1..3).contains("Fox")) { //see only index 1 until 3
        println("Fox Exists")
    } else {
        println("Fox does not exists")
    }

}

fun isAnimalRemoved (animal:String, array: Array<String>) : Boolean {
    return (animal !in array)
}

fun doesAnimalExist(animal: String, array: Array<String>): Boolean {

    return animal in array
}