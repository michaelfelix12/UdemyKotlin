fun main() {
    //no 1 create classes
    val myComputer: Computer = Computer("Macbook", "Apple")
    println(myComputer.fullIdentity)

    //no 2 references to each classes
    var myLion2: AnimalClass = AnimalClass("Lion")
    var anotherLion = myLion2

    myLion2.name = "Lion A"
    println(myLion2.name)

    println(anotherLion.name)

    //no 3 use the identity operator
    if (myLion2 === anotherLion) {
        println("These two references are the same")
    } else {
        println("These two references are not the same")
    }

    //no 4 create data classes
    val iphone = Mobile("iphone7")
    println(iphone)

    val nexus = Mobile("Nexus5")
    println(nexus)

    val iphoneCopy = iphone.copy()
    println(iphoneCopy)

    println(iphone == nexus)

    println(iphone === nexus)

    //no 5 use DD to extract data
    val iphone1 = Mobile1("iphone7", "Apple")
    val nexus1 = Mobile1("Nexus5", "Google")

    val(name, brand) = iphone1
    println(name)
    println(brand)
}

class Computer(var cName: String, var cBrand: String) {
    val fullIdentity: String
    get() = "$cName - $cBrand"
}

class AnimalClass(name: String) {
    var name: String = ""
}

data class MobileClass (val name: String)

data class Mobile1(val name: String, val brand: String)