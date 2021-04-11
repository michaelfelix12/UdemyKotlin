fun main() {
    //maps
    var names: Map<Char, String> = mapOf('A' to "Mory", 'C' to "Jack", 'Z' to "John")
    println(names)

    //mutable maps
    var mutableNames = mutableMapOf('A' to "Mory")
    println(mutableNames)

    var emptyNames: Map<Int, Double> = mutableMapOf()
    var computers: HashMap<String, String> = HashMap(30)

    //in maps we use key to access the value, if there is no value then return null (not crash like aray)
    //it is the advantage maps over array

    println(names['A'])

    println(names['a']) //retutn value null because there is no key 'a'

    println(names.get('z'))

    if (names.isEmpty()) { //to check the map
        println("The map is empty")
    } else {
        println("The map is not empty")
    }

    //check the size
    println(names.size)

    //add element to map
    var moryBoxer = mutableMapOf("punchPower" to 100)
    moryBoxer.put("punchSpeed", 70)

    println(moryBoxer["punchSpeed"])

    //other way to add pair to map (subscripting)
    moryBoxer["stamina"] = 150
    println(moryBoxer.get("stamina"))

    //update element in map
    moryBoxer.put("punchPower", 200) //same like adding element
                                     //"put" function will return old value after update the value
                                     //if key does not exist then, it will create the key
                                     //if key exist then, it will update
    println(moryBoxer)

    moryBoxer["punchSpeed"] = 300
    println(moryBoxer)

    //remove elements
    var moryBoxer1 = mutableMapOf("punchPower" to 100, "punchSpeed" to 200, "stamina" to 400)
    moryBoxer1.remove("stamina")
    println(moryBoxer1)

    //other way
    moryBoxer1.remove("punchSpeed", 200) //if the value is 200 then removed, if not 200 then will not removed
    println(moryBoxer1) //punchSpeed and associated value is removed

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
}