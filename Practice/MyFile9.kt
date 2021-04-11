fun main() {
    //Sets in kotlin
    //set is unordered collection of unique values (cannot have same values)

    //creating sets
    var alphabetSet: Set<Char> = setOf('B','G','C','A','A') //if there is 2 same values, then it will not printed
                                                 //one accepted and one rejected
    println(alphabetSet)

    //empty set
    var emptyAlphabetSet = HashSet<Int>()

    //converting array to set
    //* Spread Operator
    var alphabetArray = arrayOf('A','B','C','D','A','B','A','A') //we can have same values in array
    println(alphabetArray.joinToString())

    var alphabetSet1 = setOf(*alphabetArray)
    println(alphabetSet1) //same char cannot appear more than once

    //mutable set
    var mutableAlphabetSet = mutableSetOf('A','B') //mutable set (it can be updated)

    //getting element from sets - check existance
    var alphabetSet2: Set<Char> = setOf('B','G','C','A','A')

    if (alphabetSet2.contains('G')) {
        println("G Does Exists")
    } else {
        println("G Does Not Exist")
    }

    //in - check existance
    if ('H' in alphabetSet2) {
        println("H does exist")
    } else {
        println("H does not exist")
    }

    println(alphabetSet2.first())
    println(alphabetSet2.last())

    //get specific element with index pass to function
    println(alphabetSet2.elementAt(1)) //give us letter G

    //Adding and removing element from sets
    var alphabetSet3: MutableSet<Char> = mutableSetOf('B','G','C','A','A')
    alphabetSet3.add('D')
    println(alphabetSet3)

    //adding element that already exist
    alphabetSet3.add('A') //do nothing because same value cannot appear more than 1
    println(alphabetSet3)

    //remove
    alphabetSet3.remove('A')
    println(alphabetSet3)

    var trueOrFalse = alphabetSet3.remove('B')
    println(trueOrFalse) //true if B is removed
}