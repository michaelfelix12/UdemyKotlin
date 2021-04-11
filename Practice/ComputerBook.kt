object ComputerBook {
    var allComputers: MutableList<Computer3> = mutableListOf()
    fun addComputer(computer: Computer3) {
        allComputers.add(computer)
    }
    fun removeComputer(computer: Computer3) {
        allComputers.remove(computer)
    }
    fun printComputers() {
        allComputers.forEach {
            println("${it.cName} - ${it.cBrand}")
        }
    }
}