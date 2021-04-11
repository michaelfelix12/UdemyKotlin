fun main(args: Array<String>) {

    //10 constant
    val constant = 11
    val constant1 = 12
    val constant2 = 13
    val constant3 = 14
    val constant4 = 15
    val constant5 = 16
    val constant6 = 17
    val constant7 = 18
    val constant8 = 19
    val constant9 = 20

    //conversion to double
    val constantDouble = 11.toDouble()
    val constant1Double = 12.toDouble()
    val constant2Double = 13.toDouble()
    val constant3Double = 14.toDouble()
    val constant4Double = 15.toDouble()
    val constant5Double = 16.toDouble()
    val constant6Double = 17.toDouble()
    val constant7Double = 18.toDouble()
    val constant8Double = 19.toDouble()
    val constant9Double = 20.toDouble()

    //print the result
    println("//conversion to double")
    println("$constantDouble,$constant1Double,$constant2Double,$constant3Double,$constant4Double"+
            "$constant5Double,$constant6Double,$constant7Double,$constant8Double,$constant9Double")

    //10 strings
    var myName= "Michael"
    var myName1  = "Felix"
    var myName2  = "Jones"
    var myName3  = "Adit"
    var myName4  = "Julio"
    var myName5  = "Syifa"
    var myName6  = "Donny"
    var myName7  = "Aura"
    var myName8  = "Rachel"
    var myName9  = "Tono"

    //concatenate
    println("//concatenate")
    val nameConcatenate = "$myName $myName1 $myName2"
    println(nameConcatenate)

    //string template
    println("//string template")
    val myScore = 80
    val message = "my score is $myScore"
    println(message)

    val subtraction = "2 - 2 = ${2 - 2}"
    println(subtraction)

    //pairs
    println("//Pairs")
    println("//pertama")
    val pair = Pair(100, 205)
    println(pair.first)
    println(pair.second)

    println("//kedua")
    val pair1 = 100 to 205
    println(pair1.first)
    println(pair1.second)

    println("//ketiga")
    val pair2 = Pair(5, 10)
    println(pair2.first)
    println(pair2.second)

    println("//keempat")
    val pair3 = 5 to 10
    println(pair3.first)
    println(pair3.second)

    println("//kelima")
    val mixedPair = 87.5 to 100
    val(x,y) = mixedPair
    println(x)
    println(y)

    val pair4 = Pair("a", 80)
    println(pair4.first)
    println(pair4.second)

    //pair list
    val listPair = listOf(Pair("a","b"), Pair("a1","b1"), Pair("a2","b2"), Pair("a3","b3"), Pair("a4","b4"),
                    Pair("a","b"), Pair("a","b"), Pair("a","b"), Pair("a","b"), Pair("a","b"))

    println("${listPair[1].first}, ${listPair[1].second}")


    //Triple
    println("//Triples")
    println("//pertama")
    val abc: Triple<Int, Double, Float> = Triple(10, 20.5, 30.9f)
    println(abc.first)
    println(abc.second)
    println(abc.third)

    println("//kedua")
    val xyz: Triple<Int, Double, Float> = Triple(10, 20.5, 30.9f)
    println(xyz.first)
    println(xyz.second)
    println(xyz.third)

    println("//ketiga")
    val ijk = Triple(10, 20.5, 30.9f)
    println(ijk.first)
    println(ijk.second)
    println(ijk.third)

    println("//keempat")
    val (x2, y2, z2) = xyz
    println(x2)
    println(y2)
    println(z2)

    println("//kelima")
    val (a2, b2, _) = abc
    println(a2)
    println(b2)
}