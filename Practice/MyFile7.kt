fun main() {

    //adding element to list
    //appending elements
    val animals = mutableListOf("Cat","Dolphin","Dog","Elephant","Fox")
    animals.add("Lion") //will added to the last element
    println(animals.joinToString())

    //other way
    animals += "Leopard, Tiger, Mouse"
    println(animals.joinToString())

    //adding element to array
    var evenNumbers = arrayOf(2,4,6) //using var instead val, val cannot be re-assign
    println(evenNumbers.joinToString())
    evenNumbers += 8
    println(evenNumbers.joinToString()) //although array is immutable, we can add element because
                                        //we use "var" and this simplified things for us.
                                        //By using this syntax, we are not adding new element to the array,
                                        //but we create new array with new element and then it will assign new array
                                        //to the existing variable.

    //inserting elements to array
    val animals1 = mutableListOf("Cat","Dolphine","Dog","Elephant","Fox","Fish")
    //adding new element in certain index
    animals1.add(2,"Lion")
    println(animals1.joinToString())

    //removing elements
    animals.remove("Cat")
    println(animals.joinToString())

    var catRemoved = animals.remove("Cat")
    println(catRemoved)

    //other remove way
    animals.removeAt(0)
    println(animals.joinToString())

    var dolphin = animals.removeAt(0)
    println("$dolphin is removed from the list")

    //updating elements
    animals.set(0,"Lion")
    println(animals.joinToString())

    //other way
    animals[1] = "Tiger"
    println(animals.joinToString())

    //sort the list in alphabetical order
    animals.sort()
    println(animals.joinToString())

    val oddNumbers = arrayOf(1,3,5)
    println(oddNumbers.joinToString())
    oddNumbers[0] = 9
    println(oddNumbers.joinToString())

    //iterating over a list
    val animals2 = mutableListOf("Cat","Dolphin","Dog","Elephant","Fox","Fish")

    for (animal in animals2) {
        println(animal + "*")
    }

    for ((index, animal) in animals.withIndex()) {
        println("${index + 1} - $animal")
    }

    val evenNumbersList = mutableListOf(1,4,6,8,10)

    var sumResult = 0
    for (evenNumber in evenNumbersList) {
        sumResult += evenNumber
    }
    println(sumResult)

    //use function to calculate sum
    println(sumOfNumbers(evenNumbersList))

    //nullable
    var animals5: List<String>? = mutableListOf("Cat","Dolphin","Dog")
    animals5 = null
    println(animals5)

    var animals6: List<String?> = mutableListOf("Cat","Dolphin","Dog") //each element can be null
    //animals6 = null
    println(animals6)
}

fun sumOfNumbers(numbers: List<Int>) : Int {
    var sumResult = 0
    for (number in numbers) {
        sumResult += number
    }
    return sumResult
}