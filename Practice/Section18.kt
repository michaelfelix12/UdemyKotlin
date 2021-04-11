//enum is like classes, but if you wanna have specific type and value
//we use enum to create a type with a set up limited value
fun main(args: Array<String>) {
    for (mySport in Sport.values()) {
        println("Sport #${mySport.ordinal} - ${mySport.name}")
    }
    val firstSport = Sport.values()[0]
    println(firstSport)
    // val firstSportIndex = Sport.valueOf("Aikido").ordinal
    // println(firstSportIndex)

    //case order modification
    for (mySport1 in Sport1.values()) {
        println("Sport #${mySport1.ordinal} - ${mySport1.name}")
    }

    //enum properties and functions
    for (animal18 in Animal18.values()) {
        println("Animal #${animal18.ordinal} - ${animal18.name} - is wild? ${animal18.isWild}")
    }
    val randomAnimalWinner18: Animal18 = Animal18.randomWinner18()
    println("The random winner is $randomAnimalWinner18")
    val myAnimal18 = Animal18.Leopard
    myAnimal18.sleep()

    //Enum vs When
    val mySmartPhone = SmartPhone.XPeria
    when (mySmartPhone) {
        SmartPhone.iPhone -> println("Apple")
        SmartPhone.GalaxyS9 -> println("Samsung")
        SmartPhone.Nexus -> println("Google")
        else -> println("Unknown Brand")
    }

    //Sealed class creation
    val myDeveloper18 = Developer18.AndroidDeveloper()
    myDeveloper18.hoursWorked = 150
    println("Here it is my developer: ${myDeveloper18.developerName} - " +
            "and the monthly salary of my developer is ${myDeveloper18.monthlySalary} - " +
            "The annual salary of my developer is ${myDeveloper18.annualSalaryBasedOnHoursWorked()}")

    //enumeration and state machine
    val myPerson = Person18("Mory")
    myPerson.printMood(Mood.Happy)


    //nullable and enums
    val myPerson1 = Person182("Mory")
    myPerson1.printMood(Mood1.Sad)

}

enum class Sport {
    Boxing,
    Judo,
    Karate,
    TaiChi,
    Yoga
}

enum class Sport1 {
    Boxing,
    Karate,
    TaiChi,
    Yoga,
    Judo; //indicate the list is ended
}

//enum properties and functions
enum class Animal18(val isWild: Boolean = true) {

    Lion,
    Dolphin(false),
    Leopard,
    Tiger,
    Elephant(false),
    Bird(false),
    Bear,
    Cat(false);

    companion object {

        fun randomWinner18() : Animal18 {
            return Animal18.values()[(0..Animal18.values().size).random()]
        }
    }

    fun sleep() {
        println("$this is sleeping")
    }
}

//Enum vs When
enum class SmartPhone {
    iPhone,
    Nexus,
    GalaxyS9,
    XPeria;
}

//sealed class creation
sealed class Developer18 {
    abstract val monthlySalary: Int
    abstract val hourlyWage: Int
    var hoursWorked = 0

    fun annualSalaryBasedOnHoursWorked() : Int {

        return hoursWorked * hourlyWage

    }

    class AndroidDeveloper : Developer18() {

        override val monthlySalary: Int
            get() = 10000
        override val hourlyWage: Int
            get() = 100
    }
    class IOSDeveloper : Developer18() {

        override val monthlySalary: Int
            get() = 9000
        override val hourlyWage: Int
            get() = 90
    }
    class WebDeveloper : Developer18() {
        override val monthlySalary: Int
            get() = 8000
        override val hourlyWage: Int
            get() = 80
    }


    val developerName: String
        get() = when (this) {
            is AndroidDeveloper -> "Android Developer"
            is IOSDeveloper -> "iOS Developer"
            is WebDeveloper -> "Web Developer"
        }

}

//enumeration and state machine
enum class Mood {

    Happy,
    Numb,
    Sad
}

class Person18(val name: String) {
    fun printMood(mood: Mood) {
        println("${this.name} is $mood")
    }
}

//nullable and enums
enum class Mood1 {
    Happy,
    Sad
}

class Person182(val name: String) {
    fun printMood(mood: Mood1?) {
        when (mood) {
            Mood1.Happy -> println("${this.name} is Happy Now")
            Mood1.Sad -> println("${this.name} is Sad Now")
            null -> println("${this.name} is Numb Now" )
        }
    }
}
