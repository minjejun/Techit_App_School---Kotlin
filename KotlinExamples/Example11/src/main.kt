import java.util.Scanner

// 학생들의 이름, 국어, 영어, 수학 점수를 관리하는 프로그램을 작성.
// 학생의 정보는 모두 입력을 받음.
// 입력이 완료된 후에 각 학생별 정보를 출력하고, 각 과목별 총점과 평균을 출력함.

// step1) 출력 화면을 구현한다.
// 출력화면 구현시 필요한 데이터는 임의의 데이터로 설정해준다.

// step2) 프로그램에서 필요한 기능들을 정리한다.
// 1. 학생들의 정보(이름, 국어 점수, 수학 점수, 영어 점수)를 입력받는 기능 -> 학생
// 2. 평균을 구하는 기능 -> 학생들
// 3. 과목별 총점을 구하는 기능 -> 학생들
// 4. 각 학생들의 정보 출력하는 기능 -> 학생
// 4. 평균과 총점을 출력하는 기능. -> 학생들

// step3) step3에서 정리한 기능들을 그룹으로 묶어 준다.


// step4) 출력 화면과 step2, step3에서 정의한 기능을 보고 필요한 데이터를 정리한다.
// 필요할 데이터 : 화면을 구성하기 위해 필요한 데이터, 입력받는 데이터, 발생되는 데이터, 계산되는 데이터 등등
// 학생의 이름
// 학생의 국어 점수
// 학생의 영어 점수
// 학생의 수학 점수
// 국어 총점
// 영어 총점
// 수학 총점
// 국어 평균
// 영어 평균
// 수학 평균

// step5) step4에서 정리한 변수들을 그룹으로 묶어 준다.
// 학생의 이름 -> 학생
// 학생의 국어 점수 -> 학생
// 학생의 영어 점수 ->학생
// 학생의 수학 점수 -> 학생
// 국어 총점 -> 학생들
// 영어 총점 -> 학생들
// 수학 총점 -> 학생들
// 국어 평균 -> 학생들
// 영어 평균 -> 학생들
// 수학 평균 -> 학생들

// step6) 클래스를 정의함
// ⇒ 클래스 내부에 변수를 작성해주고 메소드를 작성해줌.
// ⇒ 메소드의 코드는 아직 작성하지 않음
// 학생들 관리
// 학생

// step7) 메소드 내부의 코드를 작성하고 이를 테스트함.

// step8) main에서 필요한 만큼 객체를 생성하고 메서드를 호출하여 프로그램을 완성함.
// - 주의!!! main에서는 절대로 객체가 관리하는 변수에 직접 접근하지 마세요

fun main() {
    val studentManagerClass = StudentManagerClass()

    studentManagerClass.inputStudentInfo()

    studentManagerClass.getAvg()

    studentManagerClass.getTotal()

    studentManagerClass.printStudentInfo()

    studentManagerClass.printResult()
}

class StudentClass {
    // 이름, 국어, 영어, 수학 점수 정의.
    var name = ""
    var kor = 0
    var eng = 0
    var math = 0

    // 학생 정보 입력하는 메소드
    fun inputStudentInfo(scanner: Scanner) {
        print("학생 이름을 입력해주세요 : ")
        name = scanner.next()
        print("국어 점수를 입력해주세요 : ")
        kor = scanner.nextInt()
        print("영어 점수를 입력해주세요 : ")
        eng = scanner.nextInt()
        print("수학 점수를 입력해주세요 : ")
        math = scanner.nextInt()
    }
    // 학생 정보 출력하는 메소드
    fun printStudentInfo() {
        println("학생 이름 : $name")
        println("국어 점수 : $kor")
        println("영어 점수 : $eng")
        println("수학 점수 : $math")
        println()
    }
}

class StudentManagerClass {
    var korAvg = 0
    var engAvg = 0
    var mathAvg = 0
    var korTotal = 0
    var engTotal = 0
    var mathTotal = 0

    val s1 = StudentClass()
    val s2 = StudentClass()
    val s3 = StudentClass()

    // 각 학생들의 정보를 입력받기 위한 메서드
    fun inputStudentInfo(){
        val scanner = Scanner(System.`in`)
        s1.inputStudentInfo(scanner)
        s2.inputStudentInfo(scanner)
        s3.inputStudentInfo(scanner)
    }

    // 각 학생들의 정보를 출력하는 메소드
    fun printStudentInfo() {
        s1.printStudentInfo()
        s2.printStudentInfo()
        s3.printStudentInfo()
    }

    // 학생들 평균 구하는 메소드
    fun getAvg() {
        korAvg = (s1.kor + s2.kor + s3.kor) / 3
        engAvg = (s1.eng + s2.eng + s3.eng) / 3
        mathAvg = (s1.math + s2.math + s3.math) / 3
    }

    // 학생들 총점 구하는 메소드
    fun getTotal() {
        korTotal = s1.kor + s2.kor + s3.kor
        engTotal = s1.eng + s2.eng + s3.eng
        mathTotal = s1.math + s2.math + s3.math
    }

    // 학생들 평균 및 총점 출력하는 메소드
    fun printResult() {
        println("국어 평균 : $korAvg")
        println("영어 평균 : $engAvg")
        println("수학 평균 : $mathAvg")
        println("국어 총점 : $korTotal")
        println("영어 총점 : $engTotal")
        println("수학 총점 : $mathTotal")
    }

}

