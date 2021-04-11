import kotlin.random.Random

fun main(args: Array<String>) {

    val boxerA = Boxer23("John")
    val boxerB = Boxer23("Jack")

    BoxingArena.startTheFight(boxerA, boxerB)



}

class Boxer23(val name: String) {

    var punchPower: Int = 0
    var punchSpeed: Int = 0

    private var healthAmount: Int = 200


    fun coachMessage(message: String) {

        println(message)

    }

    init {

        punchPower = punchPower + 150
        punchSpeed = punchSpeed + 100

        coachMessage("Added punch power: $punchPower and punch speed: $punchSpeed")

    }

    // properties or methods for fighting

    var canBoxerFight: Boolean = true

    fun throwPunch(boxer: Boxer23) {

        val damageAmount = punchPower * punchSpeed * 0.2

        boxer.damageEnemy(damageAmount)


    }

    fun damageEnemy(damageAmount: Double) {

        val punchBlocked: Boolean = Random.nextBoolean()

        if (punchBlocked) {

            coachMessage("The enemy has blocked the punch. Try again")
            return

        }

        val punchMissed: Boolean = Random.nextBoolean()

        if (punchMissed) {


            coachMessage("The punch is missed. Try Again")
            return
        }

        healthAmount -= damageAmount.toInt()
        coachMessage("The damage is: $damageAmount - The health is: $healthAmount")

        if (healthAmount <= 0) {

            canBoxerFight = false

        }



    }


}


object BoxingArena {


    fun fight(boxerA: Boxer23, boxerB:Boxer23) {

        boxerA.throwPunch(boxerB)

        if (boxerB.canBoxerFight.not()) {

            return

        }

        boxerB.throwPunch(boxerA)
        if (boxerA.canBoxerFight.not()) {

            return

        }

        fight(boxerA, boxerB)

    }

    fun startTheFight(boxerA: Boxer23, boxerB: Boxer23) {

        var fightWinner: Boxer23? = null

        fight(boxerA, boxerB)

        fightWinner = if (boxerA.canBoxerFight) boxerA else boxerB
        println(fightWinner.name)


    }


}