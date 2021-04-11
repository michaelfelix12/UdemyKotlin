fun main() {
    //no 1 lambda expression
    val addLambdaFunction: (Int, Int) -> Int =
        {firstNumber: Int, secondNumber: Int -> Int //already use join declaration
        firstNumber + secondNumber
    }
    val addResult = addLambdaFunction(2,9)
    println(addResult)

    println(addLambdaFunction(1,10))

    //no 2 shorthand syntax
    val addLambdaFunction1: (Int, Int) -> Int =
        {firstNumber, secondNumber ->  //already use join declaration
            firstNumber + secondNumber
        }

    //no 3 lambda expression with one parameter (it)
    var multiplyBy5 = {number: Int -> number * 5}
    multiplyBy5 = {it * 5}

    var multiplyBy10: (Int) -> Int = {it * 10}

    //no 4 lambda expression as argument
    var multiplyLambda = {firstNumber: Int, secondNumber: Int ->
        firstNumber * secondNumber
    }
    println(multiply1(10,20,multiplyLambda))

    println(multiply1(2,3,::multiplyFunction1))

    println(multiply1(5,2,{firstNumber, secondNumber ->
        firstNumber * secondNumber
    }))

    //simplicity
    println(multiply1(4,3) {firstNumber, secondNumber ->
        firstNumber * secondNumber
    })

    //no 5 lambda expression with meaningless return value
    var playFootball: () -> Unit = { //Unit indicates we are going to return meaningless value
        println("Play Football")
        //exp1
        //exp2 --> exp2 is the last exp, only the last expression will be returned
    }
    playFootball()

    //no 6 sort array using lambdas
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

    //no 7 create collection and iterate over them using lambdas
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
        //other example in practice file (My File)

}
//function for number 4
fun multiply1(fn: Int, sn: Int, multiplyFunction: (Int, Int) -> Int) : Int {
    var multiplyResult = multiplyFunction(fn, sn)
    return multiplyResult
}

fun multiplyFunction1(fn: Int, sn: Int) = fn * sn