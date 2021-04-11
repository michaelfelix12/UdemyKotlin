import kotlin.math.min

fun main() {

    //Comparison Operator
    println("//Comparison Operator")
    var sure:Boolean = true
    println(sure)

    var cancel:Boolean = false
    println(cancel)

    //Boolean Operator
    println("//Boolean Operator")
    var is10Greater20 = (10 > 20)
    println(is10Greater20)

    var is20Equalto20 = (20 == 20)
    println(is20Equalto20)

    var is10NotEqualto20 = (10 != 20)
    println(is10NotEqualto20)

    var yes = !true
    println(yes)

    var false1 = !(100 == 100)
    println(false1)

    var true1 = !(200 > 300)
    println(true1)

    var is1LessThan2 = (1 < 2)
    println(is1LessThan2)

    var is10GreaterThanOrEqualTo9 = (10 >= 9)
    println(is10GreaterThanOrEqualTo9)

    var is20LessThanOrEqualTo20 = (10 <= 20)
    println(is20LessThanOrEqualTo20)

    //if expression
    println("//if expression")
    var age = 20
    var isUserSingle = true
    if (age > 18 && isUserSingle == true) {
        //code
        println("Sign up")
    } else {
        println("you are not eligible")
    }

    //maxmin number
    println("//maxmin number")
    var firstNumber = 10
    var secondNumber = 20
    var maxNumber: Int
    var minNumber: Int
    if (firstNumber > secondNumber) {
        maxNumber = firstNumber
    } else {
        maxNumber = secondNumber
    }
    if (firstNumber < secondNumber) {
        minNumber = firstNumber
    } else {
        minNumber = secondNumber
    }
    println(maxNumber)
    println(minNumber)

    //Score
    println("//Score")
    var myScore = 10
    if (myScore >= 10) {
        println("Bad Score")
    } else if (myScore >= 20) {
        println("Not Bad")
    } else if (myScore >= 30) {
        println("Good")
    } else if (myScore >= 40) {
        println("Very Good")
    } else if (myScore >= 50) {
        println("Great")
    } else {
        println("Unknown Score")
    }

    //encapsulating variables
    println("//encapsulating variables")
    var punchpower = 110
    var punchspeed = 80

    if (punchpower > 100 && punchspeed > 70) {
        var overalPerformance: Int = punchpower * punchspeed
        println(overalPerformance)
    }
}