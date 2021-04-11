
fun main(args: Array<String>) {


//    val gamingConsoles = listOf(GamingConsole2("PS4"),
//                                GamingConsole2("XBOX One"),
//                                GamingConsole2("PS4 Pro"),
//                                GamingConsole2("XBOX One X"))
//    val gamingConsoleShopper = Shopper2(gamingConsoles)
//
//    gamingConsoleShopper.bringShoppingThingsToCar()
//    gamingConsoleShopper.bringShoppingThingsToHome()
//    gamingConsoleShopper.finalize()

//    val htcOne = SmartPhone3("HTC One", true)
//    val smartPhones = listOf(
//        SmartPhone3("iPhone X", false),
//        SmartPhone3("Nexus 5", false),
//        SmartPhone3("Galaxy S9", false),
//        SmartPhone3("Xperia Z3", false),
//                             htcOne)
//    val smartPhoneShopper = Shopper2<SmartPhone3>(smartPhones)
//
//    smartPhoneShopper.bringBoxesOrShoppingThingsToCar(SmartPhoneBox1())
//    smartPhoneShopper.bringShoppingThingsToHome()
//    smartPhoneShopper.finalize()

//    val ages = listOf(20, 25, 30, 40, 27)
//    // int, float, double
//    // Number
//    val myNumbers: List<Number> = ages
//
//    val myIntegerNumbers: List<Int> = myNumbers

//    val myMutableAges: MutableList<Int> = mutableListOf(25, 28, 20, 18, 32)
//    val myMutableNumbers: MutableList<Number> = myMutableAges



}

fun relateNumbers(comparator: Comparable<Number>) {

    val myAge: Int = 25
    comparator.compareTo(myAge)

    val price: Double = 44.5
    comparator.compareTo(price)

    val myIntegerComparator: Comparable<Int> = comparator
    myIntegerComparator.compareTo(5)

}

class Shopper2<T: Testable2>(shoppingThings: List<T>) {


    private var shoppingThingsInStore = mutableListOf<T>()
    private var shoppingThingsInCar = mutableListOf<Any>()
    private var shoppingThingsInHome = mutableListOf<T>()
    private var defectiveShoppingThings = mutableListOf<T>()


    init {
        shoppingThingsInStore.addAll(shoppingThings)
    }

    fun bringBoxesOrShoppingThingsToCar(firstBox: Box1<T>?) {

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

        //  val gamingConsoles = shoppingThingsInCar.filterIsInstance<GamingConsole2>()
        //  gamingConsoles
        val boxes = shoppingThingsInCar.filterIsInstance<Box1<T>>()
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

    private fun bringBoxToCar(box: Box1<T>) {


        shoppingThingsInCar.add(box)
        println("Brought a box of ${box.listOfShoppingThings()} to the car")


    }

}


class GamingConsole2(val name: String) : Testable2 {

    override fun toString(): String {
        return name
    }

    override fun testIsFine(): Boolean {
        return true
    }


}

class SmartPhone3(val name: String, val defectiveBattery: Boolean) : Testable2 {


    override fun toString(): String {
        return name
    }

    override fun testIsFine(): Boolean {
        return !defectiveBattery
    }

}

interface Testable2 {

    fun testIsFine() : Boolean

}

interface Box1<T> {

    fun hasBoxMoreSpace() : Boolean
    fun addShoppingThingToBox(shoppingThing: T)
    fun isBoxEmpty() : Boolean
    fun removeShoppingThingFromBox() : T
    fun getNewBox() : Box1<T>
    fun listOfShoppingThings() : List<T>

}

class SmartPhoneBox1 : Box1<SmartPhone3> {

    private val allSmartPhones = mutableListOf<SmartPhone3>()

    override fun hasBoxMoreSpace(): Boolean {

        return allSmartPhones.count() < 5
    }

    override fun addShoppingThingToBox(shoppingThing: SmartPhone3) {

        allSmartPhones.add(shoppingThing)

    }

    override fun isBoxEmpty(): Boolean {

        return allSmartPhones.count() <= 0

    }

    override fun removeShoppingThingFromBox(): SmartPhone3 {

        val lastSmartPhone = allSmartPhones.last()
        allSmartPhones.remove(lastSmartPhone)
        return lastSmartPhone

    }

    override fun getNewBox(): Box1<SmartPhone3> {

        return SmartPhoneBox1()
    }

    override fun listOfShoppingThings(): List<SmartPhone3> {

        return allSmartPhones.toList()
    }
}