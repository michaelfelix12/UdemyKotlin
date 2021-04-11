import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.properties.Delegates

fun main() {

    //constructor properties
    var firstJob = Job("Java Programming")
    firstJob.name = "Kotlin Programming" //this property is exclusively made for only fistJob
    println(firstJob.name)

    var secondJob = Job("Swift Programming") //this property is exclusively made for only secondJob
    println(secondJob.name)

    //if i wanna have shared properties (use companion objects)
    Job1.salary = 1000
    println(Job1.salary)

    //access default value
    var thirdJob = Job()

    //we use dot notation to access property of an object or instance or a class

    //default value
    var firstJob2 = Job2("Accountant",1000)
    var secondJob2 = Job2("Programming",5000, true) //healthy value is not required because
                                                                        //already has default value

    //property initializers
    var firstJob3 = Job3("Accountant",1000)
    var secondJob3 = Job3("Programming",5000, true)
    println(firstJob3.jobDefinition) //each instances have its own jobDefinition
    println(secondJob3.jobDefinition)

    val myComputer = Computer5()
    println(myComputer.cpuKind)

    //getter
    val math = MyMath(15.5,10.8,2.7,12.4)
    println(math.squareArea)
    println(math.rectangleArea)
    println(math.numberSquareRoot)

    //setter
    math.squareAreaCalculation = 7
    println(math.squareAreaCalculation)

    math.squareHeight = 5.5 //directly changing the value
                            //using custom setter can changing indirectly the value


    //companion object properties
    val boxer1 = Boxer(100,200)
    Boxer.numberOfBoxer++
    println(Boxer.numberOfBoxer)

    val boxer2 = Boxer(250,100)
    Boxer.numberOfBoxer++
    println(Boxer.numberOfBoxer)

    //delegated properties
    //companion object properties
    val boxer3 = Boxer1(100,200)
    Boxer1.numberOfBoxer++
    boxer3.newBoxerCreated = true
    println(Boxer.numberOfBoxer)

    val boxer4 = Boxer1(250,100)
    Boxer1.numberOfBoxer++
    boxer4.newBoxerCreated = true
    println(Boxer1.numberOfBoxer)

    //variable limitation
    val myLaptop = Laptop("Macbook Pro", "Apple")
    myLaptop.orderedRamAmount = 128
    println(myLaptop.orderedRamAmount)

    //Lazy properties
    val myDownloadObject = Download()
    // Profile Picture is not being downloaded at this point
    println(myDownloadObject.downloadProfilePic)
    val myMath = MyMath1()
    println(myMath.heavyCalculation)

    //late init
    val myComputer6 = Computer6()
    myComputer6.cpu = "Core i7 7th Generation"
    println(myComputer6.cpu)

    //extension properties
    val mathObject = MyMath2(9.0)
    println(mathObject.numberSquareRoot)
}

class Job(var name: String = "Accountant") //have default value accountant

//companion object
class Job1(var name: String) {
    companion object {
        var salary = 0
    }
}

//default values
class Job2(val name: String, val salary: Int, val healthy: Boolean = true)

//property initializer
class Job3(val name: String, val salary: Int, val healthy: Boolean = true) {
    val jobDefinition = "Name: $name - Salary: $salary - Healthy: $healthy" //property initializer
}

class Computer5 {
    val name: String = ""
    val brand: String

    val ram = 0
    val cpuKind: String? = null
    init { //init plug
        brand = ""
    }
}

//getter
class MyMath(var squareHeight: Double, val rectangleWidth: Double,
            val rectangleHeight: Double, val number: Double) {
    val squareArea: Int
    get() {
        return (squareHeight + squareHeight).roundToInt()
    }
    val rectangleArea: Int
    get() {
        val areaResult = (rectangleWidth * rectangleHeight).roundToInt()
        return areaResult //use curly braked if the code is more than one line
    }
    val numberSquareRoot: Int
    get() = sqrt(number).roundToInt() //getter that doesn't have curly braked, only have one line

    //setter
    var squareAreaCalculation: Int
    get() {
        return (squareHeight * squareHeight).roundToInt()
    }
    set(value) {
        squareHeight = value.toDouble()
    }
}

//companion object properties
class Boxer(val punchPower: Int, val punchSpeed: Int) {
    companion object {
        var numberOfBoxer = 0
    }
}

//delegated properties
class Boxer1(val punchPower: Int, val punchSpeed: Int) {
    companion object {
        var numberOfBoxer = 0
    }
    var newBoxerCreated: Boolean by
        Delegates.observable(false) {
            _, oldValue, newValue ->
            if (newValue) {
                numberOfBoxer++
            }
        }
}

//Variable Limitation
class Laptop(name: String, brand: String) {
    companion object {
        var maximumRamAmount = 128
    }

    var orderedRamAmount by Delegates.vetoable(0)
    {
            _,_, newValue ->
        if (newValue > maximumRamAmount) {
            println("A Laptop with this amount of ram can not be ordered")
            false
        } else {
            true
        }
    }
}

//lazy properties
class Download {
    val downloadProfilePic:String by lazy {
        "Downloading Profile picture"
    }
}

class MyMath1 {
    val heavyCalculation: Int by lazy {
        2*7+4/5*9+10
    }
}

//Late Init
class Computer6 {
    val ram: String = "16 GBs"
    val graphicCard: String = "4 GBs"
    val powerSupply: String = "1000"

    lateinit var cpu: String
}

//extension properties
val MyMath2.numberSquareRoot: Double
    get() = Math.sqrt(number)

class MyMath2(val number: Double) {

}