import java.util.*

// step1) 출력 화면을 구현한다.
// 출력화면 구현시 필요한 데이터는 임의의 데이터로 설정해준다.

// step2) 프로그램에서 필요한 기능들을 정리한다.
// 1. 먹는 기능
// 2. 달리는 기능
// 3. 염색하는 기능
// 4. 유혹하는 기능
// 5. 동물들의 정보 입력하는 기능
// 6. 동물들의 정보 출력하는 기능.

// step3) step3에서 정리한 기능들을 그룹으로 묶어 준다.
// 1. 먹는 기능 - 호랑이, 사자, 여우
// 2. 달리는 기능 - 호랑이
// 3. 염색하는 기능 - 사자
// 4. 유혹하는 기능 - 여우
// 5. 동물들의 정보 입력하는 기능 - 동물원
// 6. 동물들의 정보 출력하는 기능 - 동물원
// 7. 동물 각각의 정보 입력하는 기능 - 호랑이, 사자, 여우
// 8. 동물 각각의 정보 출력하는 기능 - 호랑이, 사자 여우

// step4) 출력 화면과 step2, step3에서 정의한 기능을 보고 필요한 데이터를 정리한다.
// 필요할 데이터 : 화면을 구성하기 위해 필요한 데이터, 입력받는 데이터, 발생되는 데이터, 계산되는 데이터 등등
// 1. 동물 이름
// 2. 동물 종류
// 3. 다리 갯수
// 4. 털 갯수
// 5. 꼬리 갯수


// step5) step4에서 정리한 변수들을 그룹으로 묶어 준다.
// 1. 동물 이름 - 호랑이, 사자, 여우
// 2. 동물 종류 - 호랑이, 사자, 여우
// 3. 다리 갯수 - 호랑이
// 4. 털 갯수 - 사자
// 5. 꼬리 갯수 - 여우

// step6) 클래스를 정의한다.
// 클래스 내부에 변수를 작성해주고 메서드를 작성해준다.
// 메서드의 코드는 아직 작성하지 않는다.

// step7) 메서드 내부의 코드를 작성하고 이를 테스트 한다.

// step8) main에서 필요한 만큼 객체를 생성하고 메서드를 호출하여 프로그램을 완성한다.

// 주의!!! main에서는 절대로 객체가 관리하는 변수에 직접 접근하지 마세요

fun main() {
    // 동물원 관리 정의
    val zoo = ZooManage()

    zoo.inputAnimalsInfo()

    zoo.doAction()

    zoo.printAnimalsInfo()
}

class ZooManage {
    val scanner = Scanner(System.`in`)

    lateinit var s1 : Tiger
    lateinit var s2 : Tiger
    lateinit var s3 : Lion
    lateinit var s4 : Lion
    lateinit var s5 : Fox
    lateinit var s6 : Fox

    fun inputAnimalsInfo() {
        s1.inputAnimalInfo(scanner)
        s2.inputAnimalInfo(scanner)
        s3.inputAnimalInfo(scanner)
        s4.inputAnimalInfo(scanner)
        s5.inputAnimalInfo(scanner)
        s6.inputAnimalInfo(scanner)
    }

    fun printAnimalsInfo() {
        s1.printAnimalInfo()
        s2.printAnimalInfo()
        s3.printAnimalInfo()
        s4.printAnimalInfo()
        s5.printAnimalInfo()
        s6.printAnimalInfo()
    }

    // 동물들이 행동 출력.
    fun doAction() {
        s1.eatFood()
        s1.doRunning()
        s2.eatFood()
        s2.doRunning()
        s3.eatFood()
        s3.dyeFur()
        s4.eatFood()
        s4.dyeFur()
        s5.eatFood()
        s5.ensnaring()
        s6.eatFood()
        s6.ensnaring()
    }
}

open class Animal(var animalType : String) {
    // 동물 이름
    var animalName = ""

    // 먹는다는 행동 메소드
    fun eatFood() {
        println("${animalType}인 ${animalName}은 먹이를 먹고 있습니다.")
        println()
    }

    open fun inputAnimalInfo(scanner: Scanner) {
        print("동물 이름 : ")
        animalName = scanner.next()
    }

    open fun printAnimalInfo() {
        println("동물 이름 : $animalName")
        println("동물 종류 : $animalType")
    }
}

class Tiger : Animal("호랑이") {
    // 다리 갯수
    var legCount = 0

    // 달린다는 행동 메소드
    fun doRunning() {
        println("${animalType}인 ${animalName}은 달립니다.")
        println()
    }

    override fun inputAnimalInfo(scanner: Scanner) {
        super.inputAnimalInfo(scanner)
        print("다리 갯수 : ")
        legCount = scanner.nextInt()
    }

    override fun printAnimalInfo() {
        super.printAnimalInfo()
        println("호랑이의 다리 갯수는 ${legCount}개 입니다.")
        println()
    }
}

class Lion : Animal("사자") {
    // 털 갯수 정의
    var animalFurCount = 0

    // 염색한다는 행동 메소드
    fun dyeFur() {
        println("${animalType}인 ${animalName}은 염색을 하는 중입니다.")
        println()
    }

    override fun inputAnimalInfo(scanner: Scanner) {
        super.inputAnimalInfo(scanner)
        print("털 갯수 : ")
        animalFurCount = scanner.nextInt()
    }

    override fun printAnimalInfo() {
        super.printAnimalInfo()
        println("사자의 털 갯수는 ${animalFurCount}개 입니다.")
        println()
    }
}

class Fox : Animal("여우") {
    // 꼬리 갯수 정의
    var tailCount = 0

    // 유혹하는 행동 메소드
    fun ensnaring() {
        println("${animalType}인 ${animalName}은 유혹하고 있습니다.")
        println()
    }

    override fun inputAnimalInfo(scanner: Scanner) {
        super.inputAnimalInfo(scanner)
        print("꼬리 갯수 : ")
        tailCount = scanner.nextInt()
    }

    override fun printAnimalInfo() {
        super.printAnimalInfo()
        println("여우의 꼬리 갯수는 ${tailCount}개 입니다.")
        println()
    }
}