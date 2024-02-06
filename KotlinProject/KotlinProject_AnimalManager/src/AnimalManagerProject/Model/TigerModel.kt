package AnimalManagerProject.Model

import java.util.*

class TigerModel(): AnimalModel() {

    var stripe = 0

    override fun inputAnimalInfo(scanner: Scanner, animalType: Int) {
        super.inputAnimalInfo(scanner, animalType)
        print("줄무늬의 개수 : ")
        stripe = scanner.nextInt()
    }

    override fun printAnimalInfo() {
        super.printAnimalInfo()
        println("줄무늬의 개수 : ${stripe}개")
    }

}