fun main() {
    //while loop
    println("//while loop")
    var counter: Int = 0
    while (counter < 10) {
        println("Hi World - $counter")
        counter++
    }

    //do while loop
    println("//do while loop")
    var counter1: Int = 20
    do {
        println("Hi World")
        counter1++
    } while (counter1 < 10)

    //breaking out of loop
    var counter2 = 0
    while (true) {
        println("Hi World - $counter2")
        counter2++

        if (counter2 == 10) {
            break
        }
    }

    //ranges in kotlin
    println("//range in kotlin")
    val myClosedRange: IntRange = 0..10
    //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

    val myHalfOpenRange: IntRange = 0 until 10
    //0, 1, 2, 3, 4, 5, 6, 7, 8, 9

    //for loop
    println("//for loop")
    var multiplyResult =1
    for (i in 1..5) {
        multiplyResult *= 2
    }
    println(multiplyResult)


    //for loop using half range
    for (i in 1 until 5) {
        multiplyResult = multiplyResult * 2 + 1
    }
    println(multiplyResult)

    //repetition
    println("//repetition")
    repeat(5) {
        println("Hi World")
    }

    //using step
    println("//using step")
    var myNumber = 10
    for (i in 1..10 step 2) { // 1  3  5  7  9
        myNumber = myNumber * 2
    }
    println(myNumber)

    for (i in 100 downTo 0 step 2) {
        println(i)
    }

    //labelled statements
    println("//labelled statements")
    for (i in 0..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }

    //table
    for (row in 0 until 3) {
        println(row)

        for (column in 0 until 2) {
            println(column)
        }
    }

    //when expression
    var age = 20
    when (age) {
        20 -> println("You are qualified")
        else -> println("You are not qualified")
    }

    var ram = 16
    when (ram) {
        16 -> println("ram is 16")
    }

    var myComputer = "MacBook"
    when (myComputer) {
        "Mackbook", "PC" -> println("my computer is either Macbook or PC")
        else -> println("my computer is something else")
    }

    //returning values in kotlin
    println("//returning values")
    var grade = 20
    var description = when (grade) {
        10 -> "Bad Grade"
        20 -> {
            println("The grade is 20")
            "Not Bad"
        }
        30 -> "Good"
        else -> "Unknown"
    }
    println(description)

    //advanced when expression
    println("//advanced when expression")
    var grade1 = 50
    var description1: String

    description1 = when (grade) {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> "Bad Grade"
        11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> "Not Bad"
        21, 22, 23, 24, 25, 26, 27, 28, 29, 30 -> "Good"
        31, 32, 33, 34, 35, 36, 37, 38, 39, 40 -> "Very Good"
        41, 42, 43, 44, 45, 46, 47, 48, 49, 50 -> "Great"

        else -> "invalid grade"
    }

    //advanced when expression using range
    println("//advanced when expression")
    var grade2 = 50
    var description2: String

    description2 = when (grade) {
        in 1..10 -> "Bad Grade"
        in 11..20 -> "Not Bad"
        in 21..30 -> "Good"
        in 31..40 -> "Very Good"
        in 41..50 -> "Great"

        else -> "invalid grade"
    }

    //example
    var score = 20
    when {
        score % 2 == 0 && score == 20 -> println("This score is even and it is 20")
        else -> println("the score is unknown")
    }
}