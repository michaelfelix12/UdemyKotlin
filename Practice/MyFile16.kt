fun main(args: Array<String>) {
    //introduction to methods
    val myAnimals = mutableListOf<String>()
    myAnimals.add("Lion")
    myAnimals.add(0, "Tiger")
    println(myAnimals.joinToString())

    //method vs getter vs setter
    val myBoxer = Boxer2(150, 200)
    println(myBoxer.overallPerformance)
    myBoxer.overallPerformance =  100
    println(myBoxer.overallPerformance)

    //function conversion to method
    val myMobile = Mobile2("iPhone X")
    val myApp = Application("What's App")

    myMobile.installApp(myApp)

    //object methods
    println(MyMath3.giveMeTheSquareRootOfNumber(10))

    //extension methods
    val mathObject = MyMath4(20)
    println(mathObject.isItODD())

    //companion object extension
    println(MyMath5.giveMeTheMaximumValue(2, 5))
}

//method vs getter vs setter
class Boxer2(var punchPower: Int, var punchSpeed: Int) {

    var overallPerformance: Int
        get() = punchPower * punchSpeed
        set(value) {
            punchPower = punchPower + value
            punchSpeed = punchSpeed + value
        }
}

//function conversion to method
class Mobile2(val name: String) {
    fun installApp(app: Application) {
        println("${app.name} is installed on ${name}")
    }
}

class Application(val name: String) {
}

//object methods
class MyMath3(val myNumber: Int) {
    companion object {
        fun giveMeTheSquareRootOfNumber(number: Int): Int {
            return Math.sqrt(number.toDouble()).toInt()
        }
    }
}

//extension methods
fun MyMath4.isItODD() : Boolean {
    if (myNumber % 2 == 0) {
        return false
    } else {
        return true
    }
}

class MyMath4(val myNumber: Int) {
    companion object {
        fun giveMeTheSquareRootOfNumber(number: Int): Int {
            return Math.sqrt(number.toDouble()).toInt()
        }
    }
}

//companion object extension
fun MyMath5.Companion.giveMeTheMaximumValue(firstNum: Int, secondNum: Int) : Int {
    return java.lang.Math.max(firstNum, secondNum)
}

class MyMath5(val number: Int) {
    companion object {
        fun giveMeTheSquareRootOfNumber(number: Int): Int {
            return Math.sqrt(number.toDouble()).toInt()
        }
    }
}