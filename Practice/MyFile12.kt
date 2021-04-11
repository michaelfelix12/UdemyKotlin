fun main() {
    //lambda sorting
    var alphabetArray = arrayOf('B','G','F','Z','Y','A')
    println(alphabetArray.joinToString())

    //sorting
    println(alphabetArray.sorted())

    //other ex, sorting based on the sum of the characters, from the least to the most
    val brands = arrayOf("Apple","Samsung","Sony","lG","HTC")

    println(brands.sortedWith(compareBy({
        it.length
    })))  //because brands contains string elements
         // compareBy need lambda that have parameter string

    //other ex, sorting based on the sum of the characters, reverse order
    println(brands.sortedWith(compareBy({
        -it.length
    })))

    //other ex
    var brandsSorted = (brands.sortedWith(compareBy({
        -it.length
    })))
    println(brandsSorted)

    //lambda iteration over all elements, without loop struct
    brands.forEach {
        println("$it")
    }

    //other ex, imagine dating app
    val ages = arrayOf(2,15,19,20,18,27,25,35)
    println(ages.filter{
        it >= 18
    })  //value 15 is eliminated
        //filter function is create new array, and not modified the previous array

    //convert
    val oddNumbers = arrayOf(1,3,5,7,9,11,13,15)
    val evenNumbers = oddNumbers.map {
        it * 2
    } //map in here is lambda
    println(evenNumbers.joinToString())

    val oddNumberString = oddNumbers.map {
        it.toString()
    }
    println(oddNumberString)

    val brands1 = arrayOf("Apple","Samsung","20")
    val integerBrands = brands1.map {
        it.toIntOrNull()
    }
    println(integerBrands) //only value that can be convert to Int that pass, other will be Null

    //other fun
    val integerBrandsNotNull = brands.mapNotNull {
        it.toIntOrNull()
    }
    println(integerBrandsNotNull)

    //iteration, initial number (0) will be added with the values inside array one by one (accumulation)
    val evenNumbers1 = arrayOf(2,4,6,8,10)
    val evenNumbersSum = evenNumbers1.fold(0, {firstNum, secondNum ->
        firstNum + secondNum
    })
    println(evenNumbersSum)

    //reduce fun
    val evenNumberSumReduce = evenNumbers.reduce({fn, sn ->
        fn + sn
    }) //reduce uses current element in array as the initial value because reduce doesnt have initial value
    println(evenNumberSumReduce)

    //
    val personAges = mapOf("Jack" to 20, "Monica" to 25, "Joey" to 30, "Chandler" to 28, "Rachel" to 24)
    personAges.forEach {
        println("${it.key} - ${it.value}")
    }
}