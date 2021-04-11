
fun main(args: Array<String>) {
    val myBoxer = Fighter.Boxer5(400)
}

abstract class Person5(val name: String, val age: Int) {

    fun giveMeTheFullIdentity() = "$name $age"
    abstract fun sleepAt10PM()
}

open class Employee5(name: String, age: Int) : Person5(name, age) {
    var id: Int = 0
    override fun sleepAt10PM() {
        println("Employee sleeps at 10 pm")
    }
}

open class Developer5(name: String, age: Int) : Employee5(name, age) {
    open fun developAnApp() {
        println("An App is created")
    }
}

class AndroidDeveloper5(name: String, age: Int) : Developer5(name, age) {
    var mainProgrammingLanguages = arrayOf("Java", "Kotlin")
    override fun developAnApp() {
        super.developAnApp()
        println("Android App is Developed")
    }

    fun developAnAndroidWidget() {
        println("An Android App Widget is Developed")
    }
}

class IOSDeveloper5(name: String, age: Int) : Developer5(name, age) {
    var mainProgrammingLanguages = arrayOf("Swift", "Objective-C")
}


sealed class Fighter {

    class Boxer5(val punchPower: Int) : Fighter()
    class KickBoxer5(val kickPower: Int) : Fighter()

    val myBoxer = Boxer5(100)
    val myKickBoxer = KickBoxer5(200)

    val boxerB = Boxer5(500)
    val kickBoxerB = KickBoxer5(300)

    fun giveMeTheFighterPower(fighter: Fighter) : Int {
        return when (fighter) {

            is Fighter.Boxer5 -> fighter.punchPower
            is Fighter.KickBoxer5 -> fighter.kickPower
        }
    }

    fun giveMeMyBoxerPunchPower () = myBoxer.punchPower

}