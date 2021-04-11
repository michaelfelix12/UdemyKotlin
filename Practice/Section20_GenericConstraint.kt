
fun main(args: Array<String>) {


//    val gamingConsoles = listOf(GamingConsole("PS4"),
//                                GamingConsole("XBOX One"),
//                                GamingConsole("PS4 Pro"),
//                                GamingConsole("XBOX One X"))
//    val gamingConsoleShopper = Shopper(gamingConsoles)
//
//    gamingConsoleShopper.bringShoppingThingsToCar()
//    gamingConsoleShopper.bringShoppingThingsToHome()
//    gamingConsoleShopper.finalize()

    val htcOne = SmartPhone1("HTC One", true)
    val smartPhones = listOf(
        SmartPhone1("iPhone X", false),
        SmartPhone1("Nexus 5", false),
        SmartPhone1("Galaxy S9", false),
        SmartPhone1("Xperia Z3", false),
        htcOne)
    val smartPhoneShopper = Shopper<SmartPhone1>(smartPhones)

    smartPhoneShopper.bringShoppingThingsToCar()
    smartPhoneShopper.bringShoppingThingsToHome()
    smartPhoneShopper.finalize()
}

class Shopper<T: Testable>(shoppingThings: List<T>) {


    private var shoppingThingsInStore = mutableListOf<T>()
    private var shoppingThingsInCar = mutableListOf<T>()
    private var shoppingThingsInHome = mutableListOf<T>()
    private var defectiveShoppingThings = mutableListOf<T>()


    init {
        shoppingThingsInStore.addAll(shoppingThings)
    }

    fun bringShoppingThingsToCar() {

        while (shoppingThingsInStore.count() > 0) {

            val shoppingThing = shoppingThingsInStore.removeAt(0)
            if (shoppingThing.testIsFine()) {
                shoppingThingsInCar.add(shoppingThing)
                println("brought the $shoppingThing to the car")
            } else {

                defectiveShoppingThings.add(shoppingThing)
                println("There is something wrong with $shoppingThing. Let's bring it back to store")


            }
        }

    }

    fun bringShoppingThingsToHome() {


        while (shoppingThingsInCar.count() > 0) {

            val shoppingThing = shoppingThingsInCar.removeAt(0)
            shoppingThingsInHome.add(shoppingThing)
            println("Brought the $shoppingThing to home")

        }

    }


    fun finalize() {

        println("The things that you have bought are $shoppingThingsInHome")

        if (!defectiveShoppingThings.isEmpty()) {

            println("The things that we couldn't buy were $defectiveShoppingThings")

        }

    }
}


class GamingConsole(val name: String) : Testable {

    override fun toString(): String {
        return name
    }

    override fun testIsFine(): Boolean {
        return true
    }


}

class SmartPhone1(val name: String, val defectiveBattery: Boolean) : Testable {


    override fun toString(): String {
        return name
    }

    override fun testIsFine(): Boolean {
        return !defectiveBattery
    }

}

interface Testable {

    fun testIsFine() : Boolean

}