import java.lang.Exception

fun main(args: Array<String>) {

    val myBoxer = Boxer22()
    Referee.checkBoxer(myBoxer)
}

class Boxer22 {

    var stamina: Int = 100
    var punchPower: Int = 110
    var punchSpeed: Int = 120

    fun fight() {

        if (stamina < 50) {

            // throw Exception("Sorry.Not enough stamina. The fight is canceled")

            throw StaminaException()
        }

        if (punchPower < 70) {

            //  throw Exception("Sorry.Not enough punch power. The fight is canceled")

            throw PunchPowerException()
        }

        if (punchSpeed < 90) {

            //   throw Exception("Sorry.Not enough punch speed. The fight is canceled")

            throw PunchSpeedException()

        }

        println("The fight is started. Let's go")

    }

    fun increaseStamina(stamina: Int) {

        this.stamina += stamina

        println("The boxer's stamina is increased")

    }
    fun increasePunchPower(punchPower: Int) {

        this.punchPower += punchPower
        println("The boxer's punch power is increased")


    }

    fun increasePunchSpeed(punchSpeed: Int) {

        this.punchSpeed += punchSpeed
        println("The boxer's punch speed is increased")


    }



}

object Referee {

    fun checkBoxer(boxer: Boxer22) {

        try {
            boxer.fight()
        } catch (staminaException: StaminaException) {

            println(staminaException.message)
            boxer.increaseStamina(100)

        } catch (punchPowerException: PunchPowerException) {

            println(punchPowerException.message)

            boxer.increasePunchPower(100)

        } catch (punchSpeedException: PunchSpeedException) {


            println(punchSpeedException.message )

            boxer.increasePunchSpeed(100)
        } finally {

            println("Good Luck!")

        }



    }
}

// Custom Exceptions

class StaminaException : Exception("Sorry.Not enough stamina. The fight is cancelled")
class PunchPowerException : Exception("Sorry.Not enough punch power. The fight is cancelled")
class PunchSpeedException : Exception("Sorry.Not enough punch speed. The fight is cancelled")