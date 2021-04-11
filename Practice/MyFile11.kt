fun main() {
    //meaningless return value
    //lambda that don't take parameter and don't return any value like function
    //lambda is return value
    var playFootball: () -> Unit = { //Unit indicates we are going to return meaningless value
        println("Play Football")
        //exp1
        //exp2 --> exp2 is the last exp, only the last expression will be returned
    }
    playFootball()

    //nothing function, to crash the application is something has gone wrong
    //var nothingLambda: () -> Nothing = {
    //    throw ArrayIndexOutOfBoundsException()
    //}
    //nothingLambda()

    //capturing lambda expression, lambda capture the variable in parent scope
    var myNumber = 1
    var multiplyMyNumberBy2 = {
        myNumber *= 2
        //myNumber = myNumber * 2
    }
    multiplyMyNumberBy2()
    println(myNumber)

    multiplyMyNumberBy2()
    println(myNumber)

    multiplyMyNumberBy2()
    println(myNumber)

    //other ex
    var firstMultiply = multiplyMyNumberBy5()
    var secondMultiply = multiplyMyNumberBy5()
    println(firstMultiply())
    println(firstMultiply())

    println(secondMultiply())
    println(secondMultiply())
}

fun multiplyMyNumberBy5(): () -> Int {
    var myNumber: Int = 1

    var myLambda: () -> Int = {
        myNumber *= 5
        myNumber
    }
    return myLambda
}