object AnimalBook {

    //specify namespace, useful when you wanna parse some Json data from internet
    const val LION_NAME = "Lion"

    var allAnimals = mutableListOf<Animal4>()

    //function to add animals to list
    fun addAnimal(animal: Animal4) {
        allAnimals.add(animal)
    }

    //function to remove animals from list
    fun removeAnimal(animal: Animal4) {
        allAnimals.remove(animal)
    }

    //function to print all the animals to console
    fun printAllAnimals() {
        allAnimals.forEach {
            println(it.definition)
        }
    }
}
