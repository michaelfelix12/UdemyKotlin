//private constructor means other classes or method cannot create an object or instance
//using this private constructor
class Computer3 private constructor(val cID: Int, val cName: String, val cBrand: String) {
    //companion object
    companion object {
        var currentComputerID = 0

        //other classes or method, if they wanna create new instance, the must use this companion object
        fun createNewComputer(cName: String, cBrand: String) : Computer3 { //the parameter inside this will shadow
                                                                            //the parameter inside private const.
            currentComputerID = currentComputerID + 1
            //currentComputerID += 1
            return Computer3(currentComputerID, cName, cBrand)
        }
    }
}

