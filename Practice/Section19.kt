fun main() {
    //interface in kotlin
    //interface is just like classes and object, interface is also custom type,
    //cannot create an object or instance from interface in kotlin.
    //Interface is protocol that contains methods

    //create methods
    val myPerson = PersonEx()
    myPerson.sleep()
    myPerson.talk()
    myPerson.walk()

    println(myPerson.owns())
    println(myPerson.isDeveloper())

    //interface inheritance
    val myAndroidDeveloper = AndroidDeveloperEx("Jack", 25)
    myAndroidDeveloper.developAnApp()

    //iterator
    val myAnimals = listOf("Lion", "Tiger", "Leopard", "Cat")

    val mySmartPhones = mapOf(1 to "iPhone", 2 to "Nexus", 3 to "HTC Desire")

    for (animal in myAnimals) { // list -> collection -> Iterable
        println(animal)
    }

    for (smartPhone in mySmartPhones.values) {// map -> map extension function
        println(smartPhone)
    }

    //comparable
    val boxerEx1 = BoxerEx(100)
    val boxerEx2 = BoxerEx(200)

    println(boxerEx1.compareTo(boxerEx2))
}

//create interfaces
interface PersonBehavior1 {
    fun sleep()
    fun talk()
    fun walk()
}

//create methods
interface PersonBehaviorEx {

    //create properties
    val name: String //abstract properties because there is no value assigned
        //the class need to override this properties
        get() = "John"

    fun sleep() {
        println("Sleep")
    }

    fun talk()
    fun walk()
    fun owns(device: ElectronicGadget = ElectronicGadget.iMac) : String
    fun isDeveloper() : Boolean
}

enum class ElectronicGadget {
    iPhone7,
    Macbook,
    iMac,
    iPod,
    iPad
}

class PersonEx : PersonBehaviorEx {
    override val name: String = "Mory" //value is assigned

    override fun sleep() {
        println("The person is sleeping")
    }
    override fun talk() {
        println("The person is talking")
    }
    override fun walk() {
        println("The person is walking")
    }
    override fun owns(device: ElectronicGadget): String {
        return device.name
    }
    override fun isDeveloper(): Boolean {
        return true
    }
}

interface PersonIDea {
    val name: String
    val age: Int

    fun sleep()
    fun walk()
    fun talk()
}

//interface inheritance
interface DeveloperIdea: PersonIDea {

    val mainProgrammingLanguage: String
    val mainPlatform: String

    fun developAnApp()

}

class AndroidDeveloperEx(val developerName: String, val developerAge: Int) : DeveloperIdea {

    override val mainProgrammingLanguage: String
        get() = "Kotlin"
    override val mainPlatform: String
        get() = "Android"

    override fun developAnApp() {
        println("Develop an Android App")
    }

    override val name: String
        get() = developerName

    override val age: Int
        get() = developerAge

    override fun sleep() {
        println("The Developer is sleeping")
    }

    override fun walk() {
        println("The Developer is walking")
    }

    override fun talk() {
        println("The Developer is talking")
    }
}

class BoxerEx(val punchPower: Int) : Comparable<BoxerEx> {

    override fun compareTo(other: BoxerEx): Int {

        return when {
            punchPower > other.punchPower -> 1
            punchPower == other.punchPower -> 0
            else -> -1
        }
    }
}
