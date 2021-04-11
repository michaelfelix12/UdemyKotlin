
fun main(args: Array<String>) {


//    val gamingConsoles = listOf(GamingConsole1("PS4"),
//                                GamingConsole1("XBOX One"),
//                                GamingConsole1("PS4 Pro"),
//                                GamingConsole1("XBOX One X"))
//    val gamingConsoleShopper = Shopper1(gamingConsoles)
//
//    gamingConsoleShopper.bringShoppingThingsToCar()
//    gamingConsoleShopper.bringShoppingThingsToHome()
//    gamingConsoleShopper.finalize()

    val htcOne = SmartPhone2("HTC One", true)
    val smartPhones = listOf(
        SmartPhone2("iPhone X", false),
        SmartPhone2("Nexus 5", false),
        SmartPhone2("Galaxy S9", false),
        SmartPhone2("Xperia Z3", false),
        htcOne)
    val smartPhoneShopper = Shopper1<SmartPhone2>(smartPhones)

    smartPhoneShopper.bringBoxesOrShoppingThingsToCar(SmartPhoneBox())
    smartPhoneShopper.bringShoppingThingsToHome()
    smartPhoneShopper.finalize()
}

class Shopper1<T: Testable1>(shoppingThings: List<T>) {


    private var shoppingThingsInStore = mutableListOf<T>()
    private var shoppingThingsInCar = mutableListOf<Any>()
    private var shoppingThingsInHome = mutableListOf<T>()
    private var defectiveShoppingThings = mutableListOf<T>()


    init {
        shoppingThingsInStore.addAll(shoppingThings)
    }

    fun bringBoxesOrShoppingThingsToCar(firstBox: Box<T>?) {

        var currentBox = firstBox

        while (shoppingThingsInStore.count() > 0) {

            val shoppingThing = shoppingThingsInStore.removeAt(0)

            if (shoppingThing.testIsFine()) {

                if (currentBox != null) {

                    if (!currentBox.hasBoxMoreSpace()) {

                        bringBoxToCar(currentBox)
                        currentBox = currentBox.getNewBox()

                    }

                    currentBox.addShoppingThingToBox(shoppingThing)


                } else {

                    shoppingThingsInCar.add(shoppingThing)

                    println("brought the $shoppingThing to the car")
                }
            } else {

                defectiveShoppingThings.add(shoppingThing)
                println("There is something wrong with $shoppingThing. Let's bring it back to store")


            }
        }

        currentBox?.let {
            bringBoxToCar(it)
        }

    }

    fun bringShoppingThingsToHome() {

        //  val gamingConsoles = shoppingThingsInCar.filterIsInstance<GamingConsole1>()
        //  gamingConsoles
        val boxes = shoppingThingsInCar.filterIsInstance<Box<T>>()
        for (box in boxes) {

            shoppingThingsInCar.remove(box)

            while (!box.isBoxEmpty()) {

                val shoppingThingInBox = box.removeShoppingThingFromBox()
                println("Unboxing the $shoppingThingInBox")
                bringTheActualShoppingThingToHome(shoppingThingInBox)

            }

        }


        while (shoppingThingsInCar.count() > 0) {

            @Suppress("UNCHECKED_CAST")
            val shoppingThing = shoppingThingsInCar.removeAt(0) as? T

            if (shoppingThing != null) {

                bringTheActualShoppingThingToHome(shoppingThing)

            } else {

                println("There is a null in the car. Sorry")

            }

        }

    }

    private fun bringTheActualShoppingThingToHome(actualShoppingThing: T) {

        shoppingThingsInHome.add(actualShoppingThing)
        println("Brought the $actualShoppingThing to home")


    }

    fun finalize() {

        println("The things that you have bought are $shoppingThingsInHome")

        if (!defectiveShoppingThings.isEmpty()) {

            println("The things that we couldn't buy were $defectiveShoppingThings")

        }

    }

    private fun bringBoxToCar(box: Box<T>) {


        shoppingThingsInCar.add(box)
        println("Brought a box of ${box.listOfShoppingThings()} to the car")


    }

}


class GamingConsole1(val name: String) : Testable1 {

    override fun toString(): String {
        return name
    }

    override fun testIsFine(): Boolean {
        return true
    }


}

class SmartPhone2(val name: String, val defectiveBattery: Boolean) : Testable1 {


    override fun toString(): String {
        return name
    }

    override fun testIsFine(): Boolean {
        return !defectiveBattery
    }

}

interface Testable1 {

    fun testIsFine() : Boolean

}

interface Box<T> {

    fun hasBoxMoreSpace() : Boolean
    fun addShoppingThingToBox(shoppingThing: T)
    fun isBoxEmpty() : Boolean
    fun removeShoppingThingFromBox() : T
    fun getNewBox() : Box<T>
    fun listOfShoppingThings() : List<T>

}

class SmartPhoneBox : Box<SmartPhone2> {

    private val allSmartPhones = mutableListOf<SmartPhone2>()

    override fun hasBoxMoreSpace(): Boolean {

        return allSmartPhones.count() < 5
    }

    override fun addShoppingThingToBox(shoppingThing: SmartPhone2) {

        allSmartPhones.add(shoppingThing)

    }

    override fun isBoxEmpty(): Boolean {

        return allSmartPhones.count() <= 0

    }

    override fun removeShoppingThingFromBox(): SmartPhone2 {

        val lastSmartPhone = allSmartPhones.last()
        allSmartPhones.remove(lastSmartPhone)
        return lastSmartPhone

    }

    override fun getNewBox(): Box<SmartPhone2> {

        return SmartPhoneBox()
    }

    override fun listOfShoppingThings(): List<SmartPhone2> {

        return allSmartPhones.toList()
    }
}