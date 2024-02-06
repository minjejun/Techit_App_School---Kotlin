import java.util.*

// step1) 출력 화면을 구현한다.
// 출력화면 구현시 필요한 데이터는 임의의 데이터로 설정해준다.

// step2) 프로그램에서 필요한 기능들을 정리한다.
// 1. 달리는 기능
// 2. 슛을 쏘는 기능
// 3. 퇴장 당하는 기능
// 4. 홈런을 치는 기능
// 5. 학생들의 정보 입력받는 기능
// 6. 학생들의 정보 출력하는 기능.

// step3) step3에서 정리한 기능들을 그룹으로 묶어 준다.
// 1. 달리는 기능 - 농구부 학생, 축구부 학생, 야구부 학생
// 2. 슛을 쏘는 기능 - 농구부 학생
// 3. 퇴장 당하는 기능 - 축구부 학생
// 4. 홈런을 치는 기능 - 야구부 학생
// 5. 학생들의 정보 입력받는 기능 - 학생 관리
// 6. 학생들의 정보 출력하는 기능. - 학생 관리
// 7. 학생의 정보를 입력받는 기능 -> 농구부 학생, 축구부 학생, 야구부 학생
// 8. 학생의 정보를 출력하는 기능 -> 농구부 학생, 축구부 학생, 야구부 학생

// step4) 출력 화면과 step2, step3에서 정의한 기능을 보고 필요한 데이터를 정리한다.
// 필요할 데이터 : 화면을 구성하기 위해 필요한 데이터, 입력받는 데이터, 발생되는 데이터, 계산되는 데이터 등등
// 1. 학생 이름
// 2. 부소속 이름
// 3. 총 슛 개수
// 4. 퇴장 갯수
// 5. 홈런 갯수

// step5) step4에서 정리한 변수들을 그룹으로 묶어 준다.
// 1. 학생 이름 -> 농구부 학생, 축구부 학생, 야구부 학생
// 2. 부소속 이름 -> 농구부, 축구부, 야구부 학생
// 3. 총 슛 개수 -> 농구부 학생
// 4. 퇴장 갯수 -> 축구부 학생
// 5. 홈런 갯수 -> 야구부 학생

// step6) 클래스를 정의한다.
// 클래스 내부에 변수를 작성해주고 메서드를 작성해준다.
// 메서드의 코드는 아직 작성하지 않는다.

// step7) 메서드 내부의 코드를 작성하고 이를 테스트 한다.

// step8) main에서 필요한 만큼 객체를 생성하고 메서드를 호출하여 프로그램을 완성한다.

// 주의!!! main에서는 절대로 객체가 관리하는 변수에 직접 접근하지 마세요

fun main() {
    // 학생 관리 객체 생성
    val studentManage = StudentManage()

    studentManage.inputStudentsInfo()

    studentManage.doStudent()

    studentManage.printStudentsInfo()
}



// 1. 달리는 기능 - 농구부 학생, 축구부 학생, 야구부 학생
// 2. 슛을 쏘는 기능 - 농구부 학생
// 3. 퇴장 당하는 기능 - 축구부 학생
// 4. 홈런을 치는 기능 - 야구부 학생
// 5. 학생들의 정보 입력받는 기능 - 학생 관리
// 6. 학생들의 정보 출력하는 기능. - 학생 관리
// 7. 학생의 정보를 입력받는 기능 -> 농구부 학생, 축구부 학생, 야구부 학생
// 8. 학생의 정보를 출력하는 기능 -> 농구부 학생, 축구부 학생, 야구부 학생

// 학생 관리
class StudentManage {

    val scanner = Scanner(System.`in`)

    val s1 = BasketBallStudent()
    val s2 = BasketBallStudent()
    val s3 = SoccerStudent()
    val s4 = SoccerStudent()
    val s5 = BaseBallStudent()
    val s6 = BaseBallStudent()
    // 5. 학생들의 정보 입력받는 기능 - 학생 관리
    fun inputStudentsInfo() {
        s1.inputBasketBallStudentInfo(scanner)
        s2.inputBasketBallStudentInfo(scanner)
        s3.inputSoccerStudentInfo(scanner)
        s4.inputSoccerStudentInfo(scanner)
        s5.inputBaseBallStudentInfo(scanner)
        s6.inputBaseBallStudentInfo(scanner)
    }

    // 6. 학생들의 정보 출력하는 기능. - 학생 관리
    fun printStudentsInfo() {
        s1.printBasketBallStudentInfo()
        s2.printBasketBallStudentInfo()
        s3.printSoccerStudentInfo()
        s4.printSoccerStudentInfo()
        s5.printBaseBallStudentInfo()
        s6.printBaseBallStudentInfo()
    }

    // 학생들의 행동 메소드 호출하는 메소드
    fun doStudent() {
        s1.running()
        s1.shooting()
        s2.running()
        s2.shooting()
        s3.running()
        s3.shutOutting()
        s4.running()
        s4.shutOutting()
        s5.running()
        s5.homeRun()
        s6.running()
        s6.homeRun()
    }
}

// 농구부 학생
class BasketBallStudent : Student("농구부"){
    // 총 슛 개수
    var shootCount = 0

//    constructor() {
//        partName = "농구부"
//    }

    fun shooting() {
        println("$partName ${studentName}이 슛을 쏩니다.")
    }

    // 농구부 학생 정보를 입력받는 기능
    fun inputBasketBallStudentInfo(scanner: Scanner) {
        inputStudentInfo(scanner)
        print("슛 개수 : ")
        shootCount = scanner.nextInt()
    }

    // 농구부 학생 정보를 출력하는 기능
    fun printBasketBallStudentInfo() {
        printStudentInfo()
        println("총 슛 개수 : ${shootCount}개")
    }
}

// 축구부 학생
class SoccerStudent : Student("축구부") {
    // 퇴장 개수
    var outCount = 0

//    constructor() {
//        partName = "축구부"
//    }

    fun shutOutting() {
        println("$partName ${studentName}이 퇴장 당합니다.")
    }

    // 축구부 학생 정보를 입력받는 기능
    fun inputSoccerStudentInfo(scanner: Scanner) {
        inputStudentInfo(scanner)
        print("퇴장 횟수 : ")
        outCount = scanner.nextInt()
    }

    // 축구부 학생 정보를 출력하는 기능
    fun printSoccerStudentInfo() {
        printStudentInfo()
        println("총 퇴장 횟수 : ${outCount}번")
    }
}

// 야구부 학생
class BaseBallStudent : Student("야구부") {

    // 홈런 개수
    var homeRunCount = 0

//    constructor() {
//        partName = "야구부"
//    }

    fun homeRun() {
        println("$partName ${studentName}이 홈런을 쳤습니다.")
    }

    // 야구부 학생 정보를 입력받는 기능
    fun inputBaseBallStudentInfo(scanner: Scanner) {
        inputStudentInfo(scanner)
        print("홈런 개수 : ")
        homeRunCount = scanner.nextInt()
    }

    // 야구부 학생 정보를 출력하는 기능
    fun printBaseBallStudentInfo() {
        printStudentInfo()
        println("총 홈런 개수 : ${homeRunCount}개")
    }
}

// 각 운동부 학생들이 상속받을 클래스 - 중복되는 메소드만 모아놓음 -> Super Class
open class Student(var partName: String) {
    // 학생 이름
    var studentName = ""
    // 부 소속 이름
    // var partName = ""

    fun running() {
        println("$partName ${studentName}이 달립니다.")
    }

    fun inputStudentInfo(scanner: Scanner) {
        print("이름 : ")
        studentName = scanner.next()
    }

    fun printStudentInfo() {
        println()
        println("이름 : $studentName")
        println("소속부 : $partName")
    }
}