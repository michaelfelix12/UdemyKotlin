//Inheritance methods and override
fun main(args: Array<String>) {
    val myAndroidDeveloper = AndroidDeveloper3("Paul", 27)
    myAndroidDeveloper.developAnApp()
    myAndroidDeveloper.developAnAndroidWidget()
}

open class Person3(val name: String, val age: Int) {
    fun giveMeTheFullIdentity() = "$name $age"
}

open class Employee3(name: String, age: Int) : Person3(name, age) {
    var id: Int = 0
}

open class Developer3(name: String, age: Int) : Employee(name, age) {
    open fun developAnApp() {
        println("An App is created")
    }
}

class AndroidDeveloper3(name: String, age: Int) : Developer3(name, age) {
    var mainProgrammingLanguages = arrayOf("Java", "Kotlin")
    override fun developAnApp() {
        super.developAnApp()
        println("Android App is Developed")
    }
    fun developAnAndroidWidget() {
        println("An Android App Widget is Developed")
    }
}

class IOSDeveloper3(name: String, age: Int) : Developer3(name, age) {
    var mainProgrammingLanguages = arrayOf("Swift", "Objective-C")
}