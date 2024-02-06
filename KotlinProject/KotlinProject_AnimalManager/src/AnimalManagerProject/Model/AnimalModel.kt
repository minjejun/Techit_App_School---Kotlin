package AnimalManagerProject.Model

import AnimalManagerProject.Util.AnimalType
import java.io.Serializable
import java.util.Scanner

open class AnimalModel: Serializable {

    lateinit var name : String
    var age = 0
    var animalType = 0

    open fun inputAnimalInfo(scanner: Scanner, animalType: Int) {
        this.animalType = animalType

        print("동물 이름 : ")
        name = scanner.next()
        print("동물 나이 : ")
        age = scanner.nextInt()
    }


    // 동물 한 마리의 공통된 정보를 출력하는 메소드.
    open fun printAnimalInfo() {
        println()
        when(animalType) {
            AnimalType.ANIMAL_TYPE_TIGER.num ->
                println("동물 타입 -> 호랑이")
            AnimalType.ANIMAL_TYPE_LION.num ->
                println("동물 타입 -> 사자")
            AnimalType.ANIMAL_TYPE_ELEPHANT.num ->
                println("동물 타입 -> 코끼리")
        }
        println("동물 이름 : $name")
        println("동물 나이 : ${age}살")
    }
}