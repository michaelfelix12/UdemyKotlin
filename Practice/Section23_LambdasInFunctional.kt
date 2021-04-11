import kotlin.random.Random

fun main(args: Array<String>) {

    val boxerA = Boxer234("John")
    val boxerB = Boxer234("Jack")


    val onFightFinished = { boxingWinner: Boxer234 ->

        Referee233.sendMessage(boxingWinner.name + " won the fight!")

    }

    BoxingArena233.startTheFight(boxerA, boxerB) {

        Referee233.sendMessage("${it.name} won the fight!")
    }



}

fun fightFinished(boxer: Boxer234) {

    Referee233.sendMessage(boxer.name + " won the fight!!!")
}


class Boxer234(val name: String) {

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

    fun throwPunch(boxer: Boxer234) {

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


object BoxingArena233 {

    fun fight(boxerA: Boxer234, boxerB:Boxer234) {

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

    fun startTheFight(boxerA: Boxer234, boxerB: Boxer234, onFightFinished: (Boxer234) -> Unit) {

        var fightWinner: Boxer234? = null

        fight(boxerA, boxerB)

        fightWinner = if (boxerA.canBoxerFight) boxerA else boxerB
        // println(fightWinner.name)

        onFightFinished(fightWinner)


    }

}


object Referee233 {

    fun sendMessage(message: String) {

        println(message)

    }

}


fun tellMeYourAge1(): (Int) -> Int {

    return ::randomAge1

}

fun randomAge1(until: Int) : Int {

    val randAge = Random.nextInt(until)
    return randAge

}

