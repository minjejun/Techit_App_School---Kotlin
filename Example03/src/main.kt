import java.util.*

// 주민등록번호를 입력받아 다음과 같이 출력.
// 주민등록번호는 - 없이 13자리의 숫자를 입력받음
// 처음 두자리는 생년 의미
// 세번째 네번째는 생월 의미
// 다섯번째 여섯번째는 생일을 의미
// 일곱번째 숫자는 다음과 같음.
// 9 : 1800년대 생 남성
// 0 : 1800년대 생 여성
// 1 : 1900년대 생 남성
// 2 : 1900년대 생 여성
// 3 : 2000년대 생 남성
// 4 : 2000년대 생 여성
// 5 : 1900년대 생 외국인 남성
// 6 : 1900년대 생 외국인 여성
// 7 : 2000년대 생 외국인 남성
// 8 : 2000년대 생 외국인 여성

fun main() {
    val residentNumber = inputResidentNum()
    printBirthDateandGender(residentNumber)
}

fun inputResidentNum() : String { // 주민 번호 입력받는 함수
    val scanner = Scanner(System.`in`)
    print("주민등록번호를 입력해주세요 : ")
    val residentNumber = scanner.nextLine()

    return residentNumber
}

fun printBirthDateandGender(residentNumber : String) { // 주민번호 분석하여 생년월일, 성별 출력하는 함수
    // 맨 앞 6자리는 몇년 몇월 며칠에 태어났는지 알려주는 것.
    // substring - 특정 부분 추출하는 함수
    val year = when (residentNumber[6]) { // 년도 - 주민번호 7번째 자리로 결정
        '9', '0' -> "18" + residentNumber.substring(0, 2) // 9, 0이면 1800년대 + 1, 2번째 숫자와 합친 것
        '1', '2', '5', '6' -> "19" + residentNumber.substring(0, 2) // 1, 2, 5, 6이면 1900년대 + 1, 2번째 숫자와 합친 것
        '3', '4', '7', '8' -> "20" + residentNumber.substring(0, 2) // 3, 4, 7, 8이면 2000년대 + 1, 2번째 숫자와 합친 것
        else -> ""
    }
    val month = residentNumber.substring(2, 4) // 3, 4번째 숫자로 월 결정
    val day = residentNumber.substring(4, 6) // 5, 6번째 숫자로 일 결정

    val gender = when (residentNumber[6]) { // 7번째 자리로 성별 결정
        '1', '3', '5', '7', '9' -> "남성" // 홀수 남성
        '2', '4', '6', '8', '0' -> "여성" // 짝수 여성
        else -> "" // 아무것도 아니면 아무것도 출력 X.
    }

    println("${year}년 ${month}월 ${day}일에 태어난 ${gender}입니다.")
}