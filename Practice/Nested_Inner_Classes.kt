fun main(args: Array<String>) {
    val myBoxer = Fighter7.Boxer7(300)
    println(myBoxer.boxerDetails)
}

class Fighter7(val stamina: Int) {

    class Boxer7(val punchPower: Int) {
        val boxerDetails = "$punchPower"
    }
}

