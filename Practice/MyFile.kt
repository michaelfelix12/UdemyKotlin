fun main() {
    // type conversion in kotlin
    println("Type Conversion")
    var myIntNumber: Int = 10
    println(myIntNumber)

    var myDecimalNumber: Double = 27.5
    println(myDecimalNumber)

    myIntNumber = myDecimalNumber.toInt()

    println(myIntNumber)

    //Operators with mixed types
    println("Mixed Types")
    var punchPower: Int = 20
    var punchSpeed: Double = 48.3

    var overalPerformance: Double = punchPower * punchSpeed

    println(overalPerformance)

    //Type inference
    println("Type Inference")
    var computerRam = 16.0.toInt()

    println(computerRam)

    //Concatenation
    println("Concatenation")
    var myProfession = "I am" + "a" + "Boxer"
    println(myProfession)

    var myName = "Michael"
    var profession = "IT Specialist"
    //myName = myName + profession
    myName += profession
    println(myName)

    //pairs
    println("Pairs")
    val XandY = Pair(10, 20)
    println(XandY.first)
    println(XandY.second)

    val XandYwithTo = 10 to 20
    println(XandYwithTo.first)
    println(XandYwithTo.second)

    val mixedPair = 3.5 to 7
    val(x,y) = mixedPair
    println(x)
    println(y)

    //Triple
    println("Triples")
    val xyz: Triple<Int, Double, Float> = Triple(10, 20.5, 30.9f)
    println(xyz.first)
    println(xyz.second)
    println(xyz.third)

    val (x2, y2, _) = xyz
    println(x2)
    println(y2)
    //println(z2)
}