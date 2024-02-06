import java.util.Scanner

// step1) 출력 화면을 구현한다.
// 출력화면 구현시 필요한 데이터는 임의의 데이터로 설정해준다.
// 1. 승용차 : 몇 대
// 2. 트럭 : 몇 대
// 3. 전기 자동차 : 몇 대
// 4. 총 타이어 개수 : 몇 개
// 5. 총 좌석의 개수 : 몇 개
// 6. 총 카시트의 개수 : 몇 개
// 7. 총 적재량 : 0000kg
// 8. 총 배터리 용량 : 0000mAh

// step2) 프로그램에서 필요한 기능들을 정리한다.
// 1. 승용차, 트럭, 전기 자동차의 구성 요소(타입, 타이어 개수, 좌석 개수, 카시트 개수, 적재랑, 배터리 용량) 입력
// 2. 구성 요소를 입력했으면, 그걸 10번 반복하는 것.
// 3. 총 타이어의 개수 구하는 기능
// 4. 총 좌석의 개수 구하는 기능
// 5. 총 타이어의 개수 출력하는 기능
// 6. 총 좌석의 개수 출력하는 기능
// 7. 총 카시트의 개수 출력하는 기능
// 8. 총 적재량 출력하는 기능
// 9. 총 배터리 용량 출력하는 기능.
// 10. 기능들을 정의하고 출력하는 기능.

// step3) step2에서 정리한 기능들을 그룹으로 묶어 준다.
// 승용차, 트럭, 전기 자동차
// 1. 타입, 타이어 개수, 좌석 개수 입력받게 하는 기능
// 2. 총 타이어의 개수 구하는 기능
// 3. 총 좌석의 개수 구하는 기능
// 4. 타입, 타이어 개수, 좌석 개수 출력하게 하는 기능
// 5. 주행한다, 후진한다는 행동 기능 출력하게 하는 기능
// 6. 보고서대로 총 정보 출력하게 하는 기능.

// 각 차
// 1. 승용차
// 1-1. 카시트 개수 입력받게 하는 기능
// 1-2. 카시트 개수 출력하는 기능
// 1-3. 자장가를 재생하는 행동 기능 출력하는 기능
// 2. 트럭
// 2-1. 적재량 입력받게 하는 기능
// 2-2. 적재량 출력하는 기능.
// 2-3. 물건을 싣는다는 행동 기능 출력하게 하는 기능
// 3. 전기 자동차
// 3-1. 총 배터리 용량 입력받게 하는 기능
// 3-2. 총 배터리 용량 출력하는 기능
// 3-3. 충전한다는 행동 기능 출력하는 기능.

// step4) 출력 화면과 step2, step3에서 정의한 기능을 보고 필요한 데이터를 정리한다.
// 필요할 데이터 : 화면을 구성하기 위해 필요한 데이터, 입력받는 데이터, 발생되는 데이터, 계산되는 데이터 등등


// step5) step4에서 정리한 변수들을 그룹으로 묶어 준다.


// step6) 클래스를 정의함
// ⇒ 클래스 내부에 변수를 작성해주고 메소드를 작성해줌.
// ⇒ 메소드의 코드는 아직 작성하지 않음

// step7) 메소드 내부의 코드를 작성하고 이를 테스트함.

// step8) main에서 필요한 만큼 객체를 생성하고 메서드를 호출하여 프로그램을 완성함.
// - 주의!!! main에서는 절대로 객체가 관리하는 변수에 직접 접근하지 마세요

fun main() {
    // 차를 관리하는 클래스 car로 프로퍼티 정의.
    val car = CarController()

    // 차의 종류 미리 설정한 것을 부름
    car.initCars()

    // 차 정보 입력하게 하는 함수
    car.inputCarsInfo()

    // 차 기능
    car.carFunction()

    // 차의 정보 출력하게 하는 함수
    car.printCarsInfo()

    // 입력했던 정보들 총 출력하는 함수
    car.getTotalCarComponentReport()
}

// 차를 관리하는 클래스
class CarController {
    val scanner = Scanner(System.`in`)

    lateinit var s1: Sedan
    lateinit var s2: Sedan
    lateinit var s3: Sedan
    lateinit var s4: Sedan
    lateinit var s5: Truck
    lateinit var s6: Truck
    lateinit var s7: Truck
    lateinit var s8: ElectricCar
    lateinit var s9: ElectricCar
    lateinit var s10: ElectricCar

    // 차의 종류 미리 설정
    fun initCars() {
        s1 = Sedan()
        s2 = Sedan()
        s3 = Sedan()
        s4 = Sedan()
        s5 = Truck()
        s6 = Truck()
        s7 = Truck()
        s8 = ElectricCar()
        s9 = ElectricCar()
        s10 = ElectricCar()
    }

    fun inputCarsInfo() {
        s1.inputCarInfo(scanner)
        s2.inputCarInfo(scanner)
        s3.inputCarInfo(scanner)
        s4.inputCarInfo(scanner)
        s5.inputCarInfo(scanner)
        s6.inputCarInfo(scanner)
        s7.inputCarInfo(scanner)
        s8.inputCarInfo(scanner)
        s9.inputCarInfo(scanner)
        s10.inputCarInfo(scanner)
    }

    fun printCarsInfo() {
        s1.printCarInfo()
        s2.printCarInfo()
        s3.printCarInfo()
        s4.printCarInfo()
        s5.printCarInfo()
        s6.printCarInfo()
        s7.printCarInfo()
        s8.printCarInfo()
        s9.printCarInfo()
        s10.printCarInfo()
    }
    // 차의 기능 출력
    fun carFunction() {
        s1.carFunction()
        s2.carFunction()
        s3.carFunction()
        s4.carFunction()
        s5.carFunction()
        s6.carFunction()
        s7.carFunction()
        s8.carFunction()
        s9.carFunction()
        s10.carFunction()
    }

    fun getTotalCarComponentReport() {
        // 승용차 대수 출력
        val sedan = listOf(s1, s2, s3, s4).size
        val truck = listOf(s5, s6, s7).size
        val electricCar = listOf(s8, s9, s10).size

        // 총 타이어 갯수 정의
        val totalTireNum = s1.tireNumber + s2.tireNumber + s3.tireNumber + s4.tireNumber + s5.tireNumber +
                s6.tireNumber + s7.tireNumber + s8.tireNumber + s9.tireNumber + s10.tireNumber

        // 총 좌석 개수 정의
        val totalSeatsNum = s1.seatsNumbers + s2.seatsNumbers + s3.seatsNumbers + s4.seatsNumbers + s5.seatsNumbers +
                s6.seatsNumbers + s7.seatsNumbers + s8.seatsNumbers + s9.seatsNumbers + s10.seatsNumbers

        // 총 카시트의 개수 정의
        val totalCarSeatsNum = s1.carSeats + s2.carSeats + s3.carSeats + s4.carSeats

        // 총 적재량 정의
        val totalLoadCapacity = s5.loadCapacity + s6.loadCapacity + s7.loadCapacity

        // 총 배터리 용량 정의
        val totalBatteryCapacity = s8.batteryCapacity + s9.batteryCapacity + s10.batteryCapacity

        println("승용차: ${sedan}대")
        println("트럭: ${truck}대")
        println("전기자동차: ${electricCar}대")
        println("총 타이어의 개수: ${totalTireNum}개")
        println("총 좌석의 개수: ${totalSeatsNum}개")
        println("총 카시트의 개수: ${totalCarSeatsNum}개")
        println("총 적재량: ${totalLoadCapacity}kg")
        println("총 배터리 용량: ${totalBatteryCapacity}mAh")
    }

}

// 차들의 공통적 특징 담은 클래스.
open class Car(var carType: String) { // 차 타입은 입력받지 않으니 주 생성자로 정의.

        // 각 차의 타이어 개수 정의
        var tireNumber = 0

        // 각 차의 좌석 개수 정의
        var seatsNumbers = 0

    // 2. 총 타이어의 개수 구하는 기능
    // 3. 총 좌석의 개수 구하는 기능
    // 4. 타입, 타이어 개수, 좌석 개수 출력하게 하는 기능
    // 5. 주행한다는 행동 기능 출력
    open fun carFunction() {
        println("${carType}이/가 주행합니다.")
        println("${carType}이/가 후진합니다.")
    }

    open fun inputCarInfo(scanner: Scanner) {
        print("타이어 개수를 입력하세요: ")
        tireNumber = scanner.nextInt()
        print("좌석 개수를 입력하세요: ")
        seatsNumbers = scanner.nextInt()
    }

    // 타입, 타이어 개수, 좌석 개수 출력하게 하는 기능
    open fun printCarInfo() {
        println("차량 타입: $carType")
        println("타이어 개수: ${tireNumber}개")
        println("좌석 개수: ${seatsNumbers}개")
    }
}

// 1. 승용차
class Sedan : Car("승용차") {
        // 각 승용차의 카시트 정의
        var carSeats = 0

    // 1-1. 승용차 카시트 개수 입력받게 하는 기능
    override fun inputCarInfo(scanner: Scanner) {
        super.inputCarInfo(scanner)
        print("승용차 카시트 개수가 몇개인지 입력해주세요 : ")
        carSeats = scanner.nextInt()
    }

    // 1-2. 승용차 카시트 개수 출력하는 기능
    override fun printCarInfo() {
        super.printCarInfo()
        println("카시트의 개수 : ${carSeats}개")
        println()
    }

    // 1-3. 승용차에서 자장가를 재생하는 행동 기능 출력하는 기능
    override fun carFunction() {
        super.carFunction()
        println("${carType}에서 자장가가 재생됩니다.")
        println()
    }
}

// 2. 트럭
class Truck : Car("트럭"){

        // 각 트럭의 적재량 정의
        var loadCapacity = 0

    // 2-1. 트럭 적재량 입력받게 하는 기능
    override fun inputCarInfo(scanner: Scanner) {
        super.inputCarInfo(scanner)
        print("${carType}의 적재량을 입력해주세요 : ")
        loadCapacity = scanner.nextInt()
    }

    // 2-2. 트럭 적재량 출력하는 기능.
    override fun printCarInfo() {
        super.printCarInfo()
        println("적재량 : ${loadCapacity}kg")
        println()
    }

    // 2-3. 물건을 싣는다는 행동 기능 출력하게 하는 기능
    override fun carFunction() {
        super.carFunction()
        println("${carType}에 물건을 싣습니다.")
        println()
    }
}

// 3. 전기자동차
class ElectricCar : Car("전기자동차") {
        // 각 전기 자동차의 배터리 용량 정의
        var batteryCapacity = 0

    // 3-1. 전기자동차 총 배터리 용량 입력받게 하는 기능
    override fun inputCarInfo(scanner: Scanner) {
        super.inputCarInfo(scanner)
        print("${carType}의 총 배터리양을 입력해주세요: ")
        batteryCapacity = scanner.nextInt()
    }

    // 3-2. 전기자동차 총 배터리 용량 출력하는 기능
    override fun printCarInfo() {
        super.printCarInfo()
        println("총 배터리 용량 : ${batteryCapacity}mAh")
        println()
    }

    // 3-3. 충전한다는 행동 기능 출력하는 기능.
    override fun carFunction() {
        super.carFunction()
        println("${carType}에 배터리를 충전합니다.")
        println()
    }
}