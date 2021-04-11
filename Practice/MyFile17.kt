fun main(args: Array<String>) {

    //introduction to inheritance
    val myPerson = Person1("John", 20)
    println(myPerson.giveMeTheFullIdentity())
    val myEmployee = Employee("Monica", 25)
    println(myEmployee.giveMeTheFullIdentity())

    // myPerson.id
    myEmployee.id = 10

    //polymorphism
    println(giveMePersonAge(AndroidDeveloper("Paul", 27)))

    //checking runtime hierarchy
    var myPerson1 = Person2("Joey", 25)
    val myAndroidDeveloper = AndroidDeveloper1("Paul", 27)

    myPerson1 = myAndroidDeveloper
    println(myPerson1 is Person2)
    println(myPerson1 is AndroidDeveloper1)
    println(myPerson1 !is IOSDeveloper)

    //  myPerson.main
    // as infix operator
    // println(myPerson as IOSDeveloper)
    // println(myPerson as? IOSDeveloper)
    println((myPerson1 as? AndroidDeveloper1)?.mainProgrammingLanguages?.joinToString())
    println(hobbies(myPerson1 as? Person2))
}

//introduction to inheritance
open class Person1(val name: String, val age: Int) {
    fun giveMeTheFullIdentity() = "$name $age"
}

open class Employee(name: String, age: Int) : Person1(name, age) {
    var id: Int = 0
}

open class Developer(name: String, age: Int) : Employee(name, age) {
}

class AndroidDeveloper(name: String, age: Int) : Developer(name, age) {
}

//polymorphism
fun giveMePersonAge(person: Person1) : Int {
    return person.age
}

//checking runtime hierarchy
fun hobbies(androidDeveloper: Person2?) : String {
    return "Yoga, Tai chi"
}
fun giveMePersonAge(person: Person2) : Int {
    return person.age
}

open class Person2(val name: String, val age: Int) {
    fun giveMeTheFullIdentity() = "$name $age"
}

open class Employee1(name: String, age: Int) : Person2(name, age) {
    var id: Int = 0
}

open class Developer1(name: String, age: Int) : Employee1(name, age) {
}

class AndroidDeveloper1(name: String, age: Int) : Developer1(name, age) {
    var mainProgrammingLanguages = arrayOf("Java", "Kotlin")
}

class IOSDeveloper(name: String, age: Int) : Developer1(name, age) {
    var mainProgrammingLanguages = arrayOf("Swift", "Objective-C")
}