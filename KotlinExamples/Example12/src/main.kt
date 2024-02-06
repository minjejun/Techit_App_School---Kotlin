import java.util.Scanner

// step1) 출력 화면을 구현한다.
// 출력화면 구현시 필요한 데이터는 임의의 데이터로 설정해준다.

// step2) 프로그램에서 필요한 기능들을 정리한다.
// 1. 동물들의 정보(동물 종류, 다리 갯수, 우는 소리)를 입력받는 기능 -> 동물
// 2. 동물 다리 갯수 총합을 구하는 기능 -> 동물 전체
// 3. 각 동물들의 정보를 출력하는 기능 -> 동물
// 4. 동물의 다리 갯수 총합을 출력하는 기능. -> 동물 전체


// step3) step3에서 정리한 기능들을 그룹으로 묶어 준다.
// 1. 동물들의 정보(동물 종류, 다리 갯수, 우는 소리)를 입력받는 기능 -> 동물
// 2. 동물 다리 갯수 총합을 구하는 기능 -> 동물 전체
// 3. 각 동물들의 정보를 출력하는 기능 -> 동물
// 4. 동물의 다리 갯수 총합을 출력하는 기능. -> 동물 전체

// step4) 출력 화면과 step2, step3에서 정의한 기능을 보고 필요한 데이터를 정리한다.
// 필요할 데이터 : 화면을 구성하기 위해 필요한 데이터, 입력받는 데이터, 발생되는 데이터, 계산되는 데이터 등등

// step5) step4에서 정리한 변수들을 그룹으로 묶어 준다.
// 동물의 종류
// 동물 다리 갯수
// 동물 우는 소리
// 동물 다리 갯수 총합

// step6) 클래스를 정의함
// ⇒ 클래스 내부에 변수를 작성해주고 메소드를 작성해줌.
// ⇒ 메소드의 코드는 아직 작성하지 않음
// 동물 정보
// 동물 전체 관리

// step7) 메소드 내부의 코드를 작성하고 이를 테스트함.

// step8) main에서 필요한 만큼 객체를 생성하고 메서드를 호출하여 프로그램을 완성함.
// - 주의!!! main에서는 절대로 객체가 관리하는 변수에 직접 접근하지 마세요

fun main() {
    val animal = AnimalsManagerClass()

    animal.inputAnimalInfo()

    animal.getLegTotal()

    animal.printAnimalInfo()

    animal.printLegTotal()
}

// 동물 하나를 관리하는 클래스
class AnimalClass {
    // 동물에 대한 변수 정의
    var name = "" // 동물 종류 : 문자열을 입력해야 하므로 String
    var leg = 0 // 동물 다리 갯수 : 숫자를 입력해야 하므로 Integer
    var cries = "" // 동물 울음 소리 : 문자열을 입력해야 하므로 String

    // 동물 정보 입력받는 메소드
    fun inputAnimalInfo(scanner: Scanner) {
        print("동물 종류를 입력해주세요 : ")
        name = scanner.next()
        print("동물 다리 갯수를 입력해주세요 : ")
        leg = scanner.nextInt()
        print("동물 울음 소리를 입력해주세요 : ")
        cries = scanner.next()
    }

    // 동물 정보 출력하는 메소드
    fun printAnimalInfo() {
        println("동물 종류 : $name")
        println("동물 다리 갯수 : ${leg}개")
        println("동물 울음 소리 : $cries")
        println()
    }

}

// 동물 전체를 관리하는 클래스
class AnimalsManagerClass {
    // 다리 갯수 총합 정의
    var legTotal = 0

    // 동물 하나를 입력받는 것을 3마리를 입력받아야 하므로 AnimalClass에 대한 변수를 3개 정의.
    val s1 = AnimalClass()
    val s2 = AnimalClass()
    val s3 = AnimalClass()


    // 동물 정보 입력받게 하는 메소드
    fun inputAnimalInfo() {
        val scanner = Scanner(System.`in`)
        s1.inputAnimalInfo(scanner)
        s2.inputAnimalInfo(scanner)
        s3.inputAnimalInfo(scanner)
    }

    // 동물 정보 출력하게 하는 메소드
    fun printAnimalInfo() {
        s1.printAnimalInfo()
        s2.printAnimalInfo()
        s3.printAnimalInfo()
    }

    // 동물 다리 총합 구하는 메소드
    fun getLegTotal() {
        legTotal = s1.leg + s2.leg + s3.leg
    }

    // 동물 다리 총합 출력하는 메소드
    fun printLegTotal() {
        println("입력한 동물들의 다리 갯수 총합은 ${legTotal}개입니다. ")
    }

}
