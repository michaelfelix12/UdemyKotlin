fun main() {
    //Objects
    //objects is used to create instance, single instance, anonymus objects

    //singletons
    //1. restrict a class to only have one instances inside our program
    //2. introduce global state in our program (which is not good because can access from other class)
    //3. there are some cases that is the scope is limited, so singletons is usefull

    //named objects
    //1. only have one instances
    //2. no constructor (because only one instances)

    //Singleton
    val myLion = Animal4(AnimalBook.LION_NAME, "Yellow")
    val myTiger = Animal4("Tiger", "Orange")
    val myPanther = Animal4("Panther", "Black")

    AnimalBook.addAnimal(myLion)
    AnimalBook.addAnimal(myTiger)
    AnimalBook.addAnimal(myPanther)

    AnimalBook.printAllAnimals()

    //objects vs classes
    //1. properties and methods
    //2. properties in object need to be initialize
    //3. objects can inherit from the classes, objects can inherit interfaces

    //creating companion
    var myComputer = Computer3.createNewComputer("MacBook", "Apple")
    println("${myComputer.cName} - ${myComputer.cBrand}")

    var macbookAir = Computer3.createNewComputer("MacBook Air", "Apple")

    //adding
    println("//adding")
    ComputerBook.addComputer(myComputer)
    ComputerBook.addComputer(macbookAir)

    ComputerBook.printComputers()

    //anonymous objects
    //we use anon classes in java to override the behavior the existing classes without using the subclass
    //implement the interface without creating the congcrit class
    //anon instances

    //in kotlin we have anon objects same like anon classes in java
    //anonymous object, everytime we use it, it creates new object
    val howMany = object : HowManyComputers {
        override fun numberOfComputers(): Int {
            return ComputerBook.allComputers.size
        }
    }

}

data class Animal4(val name: String, val color: String) {
    var definition: String = "$name is $color" //Lion is Yellow
}

//anon objects
//interface
interface HowManyComputers {
    fun numberOfComputers(): Int
}

