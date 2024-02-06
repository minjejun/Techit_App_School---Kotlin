import java.util.*

//주민등록 번호를 입력받아 다음과 같이 출력한다.
//주민등록 번호는 - 없이 13자리의 숫자를 입력받는다.
//처음 두자리는 생년을 의미한다.
//세번째 네번째는 생월을 의미한다.
//다섯번째 여섯번째는 생일을 의미한다.
//일곱번째 숫자는 다음과 같다.
//9 : 1800년대생 남성
//0 : 1800년대생 여성
//1 : 1900년대생 남성
//2 : 1900년대생 여성
//3 : 2000년대생 남성
//4 : 2000년대생 여성
//5 : 1900년대생 외국인 남성
//6 : 1900년대생 외국인 여성
//7 : 2000년대생 외국인 남성
//8 : 2000년대생 외국인 여성
//
//출력은 다음과 같이 한다
//
//1999년 10월 21에 태어난 남성입니다

// step1) 기능 정리

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {
    val residentNum = inputResidentNum()
    val year = getBirthYear(residentNum)
    val month = getBirthMonth(residentNum)
    val date = getBirthDate(residentNum)
    val sevenNum = getSevenNum(residentNum)
    val ages = getBirthAges(sevenNum)
    val gender = getGender(sevenNum)

    printResult(ages + year, month, date, gender)

}

// 1. 주민등록 번호를 입력받는 기능
fun inputResidentNum() : Long{
    val scanner = Scanner(System.`in`)
    print("주민등록번호 13자리를 입력하세요(- 빼고 입력해주세요) : ")
    val residentNum = scanner.nextLong()

    // return 하여 메인 함수로 돌아가기
    return residentNum
}

// 2. 생년을 추출한다.
fun getBirthYear(residentNum: Long) : Long{
    val year = residentNum / 100000000000
    return year
}

// 3. 생월을 추출한다.
fun getBirthMonth(residentNum: Long): Long {
    val a = residentNum / 1000000000
    val month = a % 100
    return month
}

// 4. 생일을 추출한다.
fun getBirthDate(residentNum: Long): Long {
    val a = residentNum / 10000000
    val date = a % 100
    return date
}
// 5. 일곱번째 숫자를 추출한다.
fun getSevenNum(residentNum: Long) : Long {
    val a = residentNum / 1000000
    val sevenNum = a % 10
    return sevenNum
}

// 6. 몇년대 생인지를 파악한다.
fun getBirthAges(sevenNum: Long) = when(sevenNum) {
    9L, 0L -> 1800
    1L, 2L, 5L, 6L -> 1900
    3L, 4L, 7L, 8L -> 2000
    else -> 0
}

// 7. 성별을 파악한다.
fun getGender(sevenNum: Long) : String {
    if ( sevenNum % 2 == 0L )  {
        return "여성입니다."
    } else {
        return "남성입니다."
    }
}
// 8. 출력한다.
fun printResult(year: Long, month: Long, date: Long, gender: String) {
    println("${year}년 ${month}월 ${date}일에 태어난 ${gender} 입니다.")
}