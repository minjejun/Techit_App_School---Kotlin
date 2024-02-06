package AnimalManagerProject.Model

import java.util.*

class ElephantModel() : AnimalModel() {

    var noseLength = 0

    override fun inputAnimalInfo(scanner: Scanner, animalType: Int) {
        super.inputAnimalInfo(scanner, animalType)
        print("코의 길이 : ")
        noseLength = scanner.nextInt()
    }

    override fun printAnimalInfo() {
        super.printAnimalInfo()
        println("코의 길이 : ${noseLength}cm")
    }
}