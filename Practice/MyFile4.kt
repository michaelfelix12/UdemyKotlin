fun main() {
    printHobbies("Boxing, Yoga, Programming")
    printOutAnyGivenMultipleOfNine(3)
    multiplyTwoNumber(7, 10)
}

fun printHobbies(hobbies: String) {
    //Body of the function
    println(hobbies)
}

fun printOutAnyGivenMultipleOfNine(number: Int) {
    println("$number * 9 = ${number * 9}")
}

fun multiplyTwoNumber(firstnumber: Int = 4, secondnumber: Int = 3 /*default values*/){
    println("$firstnumber * $secondnumber = ${firstnumber * secondnumber}")
}

//parameter as contants
fun multiply(number: Int){
    val newNumber = number * 2
    println(newNumber)
}

//function overloading
fun multiplyBy2(num: Int): Int{
    return num * 2
}
fun multiplyBy2(number: Double, secondNumber: Int): Double{
    return number * 2
}

//function variable
