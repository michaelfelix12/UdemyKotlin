fun main(args: Array<String>) {
    //var favNumber: Int? = 10
    //println(favNumber + 5) //not make sense

    var animalNames: Array<String> = arrayOf("Lion", "Tiger", "Leopard")
    println(animalNames.get(0))

    var oddNumber: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(oddNumber.get(1))

    var lions = Array(10, {"lion"})
    println(lions.get(8))

    val iphones = arrayOf("iphone 4", "iphone 5", "iphone 6")
}