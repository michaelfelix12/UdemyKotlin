fun main(args: Array<String>) {
    val myPerson = Person6("Female", "Suzan", 27)
    val person2 = Person6("Male", "Mory", 25, "Programmer")
    val myEmployee = Employee6("Male", "John", 35, "Acountant")
}

open class Person6(val name: String, val age: Int) {
    fun giveMeTheFullIdentity() = "$name $age"
    constructor(gender: String, name: String, age: Int) : this(name, age) {

        if (gender.contains("Male")) {
            println("The Gender is male")
        } else if (gender.contains("Female")) {
            println("The gender is female")
        }
    }
    constructor(gender: String, name: String, age: Int, job: String): this(gender, name, age)
}

class Employee6(gender: String, name: String, age: Int, job: String) : Person6("Name", 0) {
}
