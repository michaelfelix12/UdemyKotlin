fun main() {
    var addLambdaFunction: (Int,Int) -> Int
    addLambdaFunction = {firstNumber, secondNumber ->
        firstNumber + secondNumber
    }
    var addResult = addLambdaFunction(2,9)
    println(addResult)

    println(addLambdaFunction(1,10))

    //it keyword
    //lambda is expression, it return value
    var multiplyBy5 = {number: Int -> number * 5}
    multiplyBy5 = {it * 5}

    var multiplyBy10: (Int) -> Int = {it * 10} //"it" can be used if there is only 1 parameter

    //lambda as argument
    var multiplyLambda = {firstNumber: Int, secondNumber: Int ->
        firstNumber * secondNumber
    }
    println(multiply(10,20,multiplyLambda))

    println(multiply(2,3,::multiplyFunction))

    println(multiply(5,2,{firstNumber, secondNumber ->
        firstNumber * secondNumber
    }))

    //simplicity
    println(multiply(4,3) {firstNumber, secondNumber ->
        firstNumber * secondNumber
    })
}

fun multiply(fn: Int, sn: Int, multiplyFunction: (Int, Int) -> Int) : Int {
    var multiplyResult = multiplyFunction(fn, sn)
    return multiplyResult
}

fun multiplyFunction(fn: Int, sn: Int) = fn * sn