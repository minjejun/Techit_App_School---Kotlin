import java.util.*

// step1) 출력 화면을 구현한다.
// 출력화면 구현시 필요한 데이터는 임의의 데이터로 설정해준다.

// step2) 프로그램에서 필요한 기능들을 정리한다.
// 1. 동물들의 정보를 입력받는다.
// 2. 각 동물들의 정보를 출력한다.
// 3. 동물의 다리개수를 구해 출력한다.

// step3) step3에서 정리한 기능들을 그룹으로 묶어 준다.
// 1. 동물들의 정보를 입력받는다. -> 동물원
// 2. 각 동물들의 정보를 출력한다. -> 동물원
// 3. 동물의 다리개수를 구해 출력한다. -> 동물원
// 4. 동물 한 마리의 정보를 입력받는다 -> 동물
// 5. 동물 한 마리의 정보를 출력한다 -> 동물

// step4) 출력 화면과 step2, step3에서 정의한 기능을 보고 필요한 데이터를 정리한다.
// 필요할 데이터 : 화면을 구성하기 위해 필요한 데이터, 입력받는 데이터, 발생되는 데이터, 계산되는 데이터 등등
// 1. 동물 종류
// 2. 울음 소리
// 3. 다리 개수
// 4. 다리 갯수의 총합

// step5) step4에서 정리한 변수들을 그룹으로 묶어 준다.
// 1. 동물 종류 -> 동물
// 2. 울음 소리 -> 동물
// 3. 다리 개수 -> 동물
// 4. 다리 갯수의 총합 -> 동물원

// step6) 클래스를 정의한다.
// 클래스 내부에 변수를 작성해주고 메서드를 작성해준다.
// 메서드의 코드는 아직 작성하지 않는다.

// step7) 메서드 내부의 코드를 작성하고 이를 테스트 한다.

// step8) main에서 필요한 만큼 객체를 생성하고 메서드를 호출하여 프로그램을 완성한다.

// 주의!!! main에서는 절대로 객체가 관리하는 변수에 직접 접근하지 마세요

fun main() {
    // Animal class test
    val s1 = AnimalClass()

    // inputAnimalInfo method test
//    val scanner = Scanner(System.`in`)
//    s1.inputAnimalInfo(scanner)
//
//    println(s1.animalType)
//    println(s1.animalSound)
//    println(s1.animalLegCount)

    // printAnimalInfo method test
//    s1.animalType = "lion"
//    s1.animalSound = "oooo"
//    s1.animalLegCount = 200
//    s1.printAnimalInfo()

    val zoo = ZooClass()

    zoo.inputAnimalInfo()

    zoo.printAnimalsInfo()

    zoo.printAnimalsLegCount()
}

// 동물원 클래스
class ZooClass {
    // 4. 다리 갯수의 총합 -> 동물원
    var totalLegCount = 0

    // 동물 3마리 객체 생성
    val s1 = AnimalClass()
    val s2 = AnimalClass()
    val s3 = AnimalClass()

    // 1. 동물들의 정보를 입력받는다. -> 동물원
    fun inputAnimalInfo() {
        val scanner = Scanner(System.`in`)
        s1.inputAnimalInfo(scanner)
        s2.inputAnimalInfo(scanner)
        s3.inputAnimalInfo(scanner)
    }


    // 2. 각 동물들의 정보를 출력한다. -> 동물원
    fun printAnimalsInfo() {
        s1.printAnimalInfo()
        s2.printAnimalInfo()
        s3.printAnimalInfo()
    }

    // 3. 동물의 다리개수를 구해 출력한다. -> 동물원
    fun printAnimalsLegCount() {
        totalLegCount = s1.animalLegCount + s2.animalLegCount + s3.animalLegCount
        println("다리 갯수의 총 합은 ${totalLegCount}개 입니다. ")
    }
}

// 동물 클래스
class AnimalClass {
    // 동물 종류
    var animalType = ""
    // 울음 소리
    var animalSound = ""
    // 다리 갯수
    var animalLegCount = 0

    // 4. 동물 한 마리의 정보를 입력받는다 -> 동물
    fun inputAnimalInfo(scanner: Scanner) {
        print("동물 종류 : ")
        animalType = scanner.next()
        print("울음 소리 : ")
        animalSound = scanner.next()
        print("다리 갯수 : ")
        animalLegCount = scanner.nextInt()

    }

    // 5. 동물 한 마리의 정보를 출력한다 -> 동물
    fun printAnimalInfo() {
        println("동물 종류 : $animalType")
        println("울음 소리 : $animalSound")
        println("다리 갯수 : $animalLegCount")
        println()
    }
}