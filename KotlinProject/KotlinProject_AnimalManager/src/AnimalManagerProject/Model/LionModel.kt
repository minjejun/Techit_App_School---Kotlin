package AnimalManagerProject.Model

import java.util.*

class LionModel(): AnimalModel() {

    var fur = 0

    override fun inputAnimalInfo(scanner: Scanner, animalType: Int) {
        super.inputAnimalInfo(scanner, animalType)
        print("털의 개수 : ")
        fur = scanner.nextInt()
    }

    override fun printAnimalInfo() {
        super.printAnimalInfo()
        println("털의 개수 : ${fur}개")
    }
}