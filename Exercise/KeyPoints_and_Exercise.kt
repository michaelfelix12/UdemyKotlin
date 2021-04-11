fun main(args: Array<String>) {

    //constant
    val laptopRam = 16
    println("constant: $laptopRam")

    //average
    val numbers = listOf(6, 42, 10, 4)
    println("Average: ${numbers.average()}")

    //integer
    var myIntNumber = 10
    val res = myIntNumber + 2
    val res1 = res - 10
    val res2 = res1 * 9
    val res3 = res2 / 4 //should be 4.5 but because the type is int, so = 4
    val res4 = res3 shr 3 // should be 0.5 but because the type is int, so = 0
                          //shifting right is similar to divide it by the exponent result of it,
                          //e.g. 4 shr 3 = 4 / 8
    val res5 = res4 + 1
    val res6 = res5 * 2
    val res7 = res6 shl 4 //shifting left is similar to multiply it by the exponent result of it,
                          //e.g. 2 shl 4 = 2 * 16
    println("the end result: "+ res7)
}