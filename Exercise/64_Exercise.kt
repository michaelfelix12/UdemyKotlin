fun main () {
    println("//bilangan ganjil")
    var num4 = 0
    while(num4 <= 100) {
        if (num4 % 2 != 0) {
            println("nilai ganjil: $num4")
        }
        num4++
    }
    //10 boolean comparison
    println("//Boolean Comparison")
    val is10Greater20 = (10 > 20)
    println(is10Greater20)

    val is20EqualTo20 = (20 == 20)
    println(is20EqualTo20)

    val is10NotEqualTo20 = (10 != 20)
    println(is10NotEqualTo20)

    val yes = !true
    println(yes)

    val false1 = !(100 == 100)
    println(false1)

    val true1 = !(200 > 300)
    println(true1)

    val is1LessThan2 = (1 < 2)
    println(is1LessThan2)

    val is10GreaterThanOrEqualTo9 = (10 >= 9)
    println(is10GreaterThanOrEqualTo9)

    val is10LessThanOrEqualTo20 = (10 <= 20)
    println(is10LessThanOrEqualTo20)

    val is20GreaterThanOrEqualTo20 = (20 >= 20)
    println(is20GreaterThanOrEqualTo20)

    val is30LessThanOrEqualTo45 = (30 <= 45)
    println(is30LessThanOrEqualTo45)

    //10 boolean logic examples
    println("//boolean logic")

    var age = 50
    var isUserOld = true

    //AND
    var ageResult: Boolean = (age > 60) && (isUserOld == true)
    println(ageResult)

    //OR
    var ageResultOR: Boolean = (age > 60) || (isUserOld == true)
    println(ageResultOR)

    var score = 100
    var isStudentPass = true

    //AND
    var studentResult: Boolean = (score > 75) && (isStudentPass == true)
    println(studentResult)

    //OR
    var studentResultOR: Boolean = (score > 75) || (isStudentPass == true)
    println(studentResultOR)

    var number = 205
    var isNumberBig = true

    //AND
    var numberResult: Boolean = (number > 200) && (isNumberBig == true)
    println(numberResult)

    //OR
    var numberResultOR: Boolean = (number > 200) || (isNumberBig == true)
    println(numberResultOR)

    var point = 585
    var isPointHuge = false

    //AND
    var pointResult: Boolean = (point > 1000) && (isPointHuge == true)
    println(pointResult)

    //OR
    var pointResultOR: Boolean = (point > 1000) || (isPointHuge == true)
    println(pointResultOR)

    var height = 165
    var isPersonShort = false

    //AND
    var heightResult: Boolean = (number < 150) && (isPersonShort == false)
    println(heightResult)

    //OR
    var heightResultOR: Boolean = (number < 150) || (isPersonShort == false)
    println(heightResultOR)

    /*logic AND permutaion
    1  x 1   = 1
    1  x 0   = 0
    0  x 1   = 0
    0  x 0   = 0
    */

    println("//permutation")
    var value: Boolean = (true) && (true)
    println(value)

    var value1: Boolean = (true) && (false)
    println(value1)

    var value2: Boolean = (false) && (true)
    println(value2)

    var value3: Boolean = (false) && (false)
    println(value3)

    println("OR permutation")
    /*logic OR permutaion
    1  + 1   = 1
    1  + 0   = 1
    0  + 1   = 1
    0  + 0   = 0
    */
    var valueOR: Boolean = (true) || (true)
    println(valueOR)

    var valueOR1: Boolean = (true) || (false)
    println(valueOR1)

    var valueOR2: Boolean = (false) || (true)
    println(valueOR2)

    var valueOR3: Boolean = (false) || (false)
    println(valueOR3)

    //5 string equality
    println("//String Equality")
    val iphone = "iphone"
    val nexus = "nexus"

    var stringResult: Boolean = (iphone == nexus)
    println(stringResult)

    val stringResult1: Boolean = (iphone > nexus)
    println(stringResult1)

    val stringResult2: Boolean = ("x" > "y")
    println(stringResult2)

    val stringResult3: Boolean = ("x" < "y")
    println(stringResult3)

    val stringResult4: Boolean = ("x" == "x")
    println(stringResult4)

    //if else expression
    println("//if expression")
    val ages = 20
    val isUserSingle = true
    if (ages > 18 && isUserSingle) {
        //code
        println("Sign up")
    } else {
        println("you are not eligible")
    }

    if (ages < 18 && !isUserSingle) {
        println("You are not eligible")
    } else {
        println("Sign up")
    }

    //if else expression - maxmin number
    println("//if else expression - maxmin number")
    val firstNumber = 10
    val secondNumber = 20
    val minNumber: Int

    val maxNumber = if (firstNumber > secondNumber) {
        val a = 2
        val b = 100
        firstNumber //return value in last line inner scope
    } else {
        secondNumber
    }
    minNumber = if (firstNumber < secondNumber) {
        firstNumber
    } else {
        secondNumber
    }
    println(maxNumber)
    println(minNumber)

    //if and else if expression - Score
    println("//if else expression - Score")
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

    //meaning of short circuiting
    println("Short circuiting is the stoppage of a boolean operation if " +
            "the truth value of the expression has already been determined." +
            "In other words, if the evaluation of a logical expression exit in " +
            "between before complete evaluation, then it is known as Short-circuit. " +
            "A short circuit happens because the result is clear even before the " +
            "complete evaluation of the expression, and the result is returned." +
            "Contoh: dalam logic expression OR, ketika argumen pertama terpenuhi maka" +
            "output nya akan true tanpa perlu mengecek argumen kedua")

    //meaning of scope
    println("A scope is a region of code which constitutes a context " +
            "in which entities and their names can be introduced. Scopes can be nested, with " +
            "entities introduced in outer scopes possibly available in the inner scopes if linked" +
            "contoh: main() {" +  //outer scope
            "                   func() {" +  //inner scope
            "                           }" +
            "               }")

    //5 while loops
    println("//while loop")
    //pertama
    var counter: Int = 0
    while (counter < 5) {
        println("Hi World - $counter")
        counter++
    }

    //kedua
    var x: Double = 10.0
    while (x > 0) {
        println(x)
        x--
    }

    //ketiga
    var arr: Int = 10
    while (arr > 0) {
        println("Hi Guest - $arr")
        arr--
    }

    //keempat
    var animals: Double = 0.0
    while (animals < 10.0) {
        println("beast")
        animals++;
    }

    //kelima
    var i = 1

    while (i <= 5) {
        println("Line $i")
        ++i
    }

    //do while loop
    //pertama
    var sum: Int = 0
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")

    //kedua
    var num = 100
    do {
        println("Loop: $num")
        num++
    }
    while (num<=105)

    //ketiga
    var num1 = 100
    do {
        println("Loop: $num1")
        num1++
    }
    while (false)



    //keempat (infinite do while loop)
    var num2 = 100
    do {
        println("Loop: $num2")
        num2--
    }
    while (num2<=105)

    //kelima (infinite do while loop)
    var num3 = 105
    do {
        println("Loop: $num3")
        num3++
    }
    while (num3>=100)

}