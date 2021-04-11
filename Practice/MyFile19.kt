//Abstract Classes
fun main(args: Array<String>) {

    //   val myPerson = Person("John", 34)
    val myEmployee = Employee4("Paul", 27)
    myEmployee.sleepAt10PM()
}

abstract class Person4(val name: String, val age: Int) {
    fun giveMeTheFullIdentity() = "$name $age"
    abstract fun sleepAt10PM()
}

open class Employee4(name: String, age: Int) : Person4(name, age) {
    var id: Int = 0

    override fun sleepAt10PM() {
        println("Employee sleeps at 10 pm")
    }
}

open class Developer4(name: String, age: Int) : Employee4(name, age) {
    open fun developAnApp() {
        println("An App is created")
    }
}

class AndroidDeveloper4(name: String, age: Int) : Developer4(name, age) {
    var mainProgrammingLanguages = arrayOf("Java", "Kotlin")
    override fun developAnApp() {
        super.developAnApp()
        println("Android App is Developed")
    }

    fun developAnAndroidWidget() {
        println("An Android App Widget is Developed")
    }
}

class IOSDeveloper4(name: String, age: Int) : Developer4(name, age) {
    var mainProgrammingLanguages = arrayOf("Swift", "Objective-C")
}