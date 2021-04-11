fun main(args: Array<String>) {

    val myIphone = IPhone("iPhone 7", "Apple", 2)
    println(myIphone.iPhoneDetails)
}

open class Computer8(val name: String, private val brand: String, protected val ram: Int)

class IPhone(name:String, brand: String, ram: Int) : Computer8(name, brand, ram) {
    val iPhoneDetails: String
        get() = "$name - $ram"
}