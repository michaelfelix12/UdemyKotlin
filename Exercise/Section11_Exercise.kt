fun main() {
    //no 1 create maps
    var names: Map<Char, String> = mapOf('A' to "Mory", 'C' to "Jack", 'Z' to "John")
    println(names)

    //no 2 indexing
    println(names['A'])

    println(names['a']) //retutn value null because there is no key 'a'

    println(names.get('z'))

    //no 3 mutable maps
    var mutableNames = mutableMapOf('A' to "Mory")
    println(mutableNames)

    var emptyNames: Map<Int, Double> = mutableMapOf()
    var computers: HashMap<String, String> = HashMap(30)

    //no 4 add pairs
    //add element to map
    var moryBoxer = mutableMapOf("punchPower" to 100)
    moryBoxer.put("punchSpeed", 70)

    println(moryBoxer["punchSpeed"])

    //other way to add pair to map (subscripting)
    moryBoxer["stamina"] = 150
    println(moryBoxer.get("stamina"))

    //no 5 update pairs
    moryBoxer.put("punchPower", 200)
    println(moryBoxer)

    //no 6 remove pairs
    //remove elements
    var moryBoxer1 = mutableMapOf("punchPower" to 100, "punchSpeed" to 200, "stamina" to 400)
    moryBoxer1.remove("stamina")
    println(moryBoxer1)

    //other way
    moryBoxer1.remove("punchSpeed", 200) //if the value is 200 then removed, if not 200 then will not removed
    println(moryBoxer1) //punchSpeed and associated value is removed

    //no 7 iterate through maps
    var personAndJobs = mutableMapOf("personA" to "Engineer", "personB" to "Programmer", "personC" to "Accountant")
    println(personAndJobs)

    for((personName, personJob) in personAndJobs) {
        println("$personName - $personJob")
    }

    for(personName in personAndJobs.keys) {
        println(personName)
    }

    for (personJob in personAndJobs.values) {
        println(personJob)
    }

    //no 8 create sets
    var alphabetSet: Set<Char> = setOf('B','G','C','A','A')

    //no 9 array convert to sets
    var alphabetArray = arrayOf('A','B','C','D','A','B','A','A') //we can have same values in array
    println(alphabetArray.joinToString())

    var alphabetSet1 = setOf(*alphabetArray)
    println(alphabetSet1)

    //no 10 get set elements
    var alphabetSet2: Set<Char> = setOf('B','G','C','A','A')

    if (alphabetSet2.contains('G')) {
        println("G Does Exists")
    } else {
        println("G Does Not Exist")
    }

}