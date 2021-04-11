fun main() {
    //class is actually named type, class is crucial component in OOP
    //OOP is style programming consist of data and behavior (function/methon)
    val mySmartphone: HandPhone = HandPhone("Vivo","Android")
    println(mySmartphone.fullIdentity)

    //reference
    var myLion: Animal1 = Animal1("Lion") //myLion is reference to location in memory that store
                                              //the instance (Lion)
    var anotherLion = myLion

    myLion.name = "Lion A"
    println(myLion.name)
    println(anotherLion.name) //if we change the property of myLion then anotherLion will follow

    //Object Identity
    //Identity operator (===), using this operator you can simply check the references are same or not
    if (myLion === anotherLion) {
        println("These two references are the same")
    } else {
        println("These two references are not the same")
    }

    //method and mutability
    //you don't need to pass any argument for the parameter or properties that has initial values or default valus
    //ramCard and ramAmount has default value
    val myComputer = Computer2("Macbook Pro", "Apple")
    myComputer.ramCards.add(2)
    myComputer.ramAmount = 8

    //mutability and constant
    val myLion1 = Animal("Lion")
    //myLion1 = Animal("Tiger") //cannot be changed because Animal is a constant

    var myLion2 = Animal("Lion")
    myLion2 = Animal("Tiger") //can be changed, because it is a variable

    //data classes
    //data classes is used to module object in a lot of programming pattern
    //data classes is used in order to copy objects, printing instances, comparing instances
    val iphone = Mobile("iphone 7")
    println(iphone)

    val nexus = Mobile("Nexus 5")
    println(nexus)

    var iphoneCopy = iphone.copy()
    println(iphoneCopy) //the result will be same "iphone 7"

    //check two objects are the same or not
    println(iphone == nexus) //gonna false

    //use identity operator
    println(iphone === nexus)
}

//create class
class HandPhone(var cName: String, var cBrand: String) { //property in primary constructor
    //create other property
    val fullIdentity: String
    get() = "$cName - $cBrand"
}

//reference
class Animal1(name: String) {
    var name: String = ""
}

//method and mutability
//it is not required to use curly braked in kotlin
class Computer2(val name: String,
                val brand: String, //if you are not using var/val keyword the properties cannot be used
                val ramCards: MutableList<Int> = mutableListOf(),
                var ramAmount: Int = 0)

//mutability and constant
class Animal(val name: String)

//data classes
data class Mobile(val name: String)





