// when : 주어진 변수의 수식의 값에 맞는 부분이 수행됨.

fun main() {
    val a1 = 10

    // 변수 a1의 값에 맞는 부분 수행.
    when (a1) {
        // 수행될 코드가 한 줄이라면 { }러 묶지 않아도 됨.
        1 -> println("a1은 1입니다.")
        5 -> println("a1은 5입니다.")
        // 수행될 코드가 여러 줄이라면 { }로 묶어줌.
        10 -> {
            println("a1은 10입니다.")
            println("코드가 두 줄.")
            println("코드가 세 줄.")
        }
        else -> println("a1은 1, 5, 10이 아닙니다.")
    }

    // 두 가지 이상의 조건 만족하는 것도 설정 가능.
    val a2 = 3
    when (a2) {
        1, 2 -> println("a2는 1이거나 2입니다")
        3, 4 -> println("a2는 3이거나 4입니다")
        4, 5, 6 -> println("a2는 5이거나 6이거나 7입니다")
        else -> println("a2는 1, 2, 3, 4, 5, 6, 7이 아닙니다.")
    }

    // 실수도 가능.
    val a3 = 55.55
    when(a3) {
        33.33 -> println("a3은 33.33입니다")
        55.55 -> println("a3은 55.55입니다")
        77.77 -> println("a3은 77.77입니다")
        else-> println("a3은 33.33, 55.55, 77.77이 아닙니다.")
    }

    // 문자열도 가능
    val a4 = "문자열2"
    when(a4) {
        "문자열1" -> println("첫번째 문자열 입니다.")
        "문자열2" -> println("두번째 문자열 입니다.")
        "문자열3" -> println("세번째 문자열 입니다.")
        else -> println("else 문자열 입니다.")
    }

    // 논리값
    val a5 = true
    when(a5) {
        true -> println("a5는 true입니다")
        false -> println("a5는 false입니다")
    }

    // 범위 지정
    val a6 = 6
    when(a6) {
        in 1..3 -> println("a6는 1부터 3 사이 입니다.")
        in 4..6 -> println("a6는 4부터 6 사이 입니다.")
        else -> println("a6는 1부터 6 사이의 숫자가 아닙니다.")
    }

    // 범위 관련 예제
    // 1 ~ 10
    if ( a6 in 1..10 ) {
        println("a6은 1이상 10이하 입니다.")
    }

    if ( a6 in 1 until 10 ) { // 마지막 포함 X.
        println("a6은 1이상 10미만 입니다.")
    }

    // 조건에 따라 값을 반환하는 함수를 사용하여
    // 변수에 값을 저장한다.
    var a7 = setValue1(1)
    var a8 = setValue1(2)
    var a9 = setValue1(3)
    println("a7 : $a7")
    println("a8 : $a8")
    println("a9 : $a9")

    var a10 = setValue1(1)
    var a11 = setValue1(2)
    var a12 = setValue1(3)
    println("a10 : $a10")
    println("a11 : $a11")
    println("a12 : $a12")

    var a13 : String
    var a14 = 2

    if (a14 == 1) {
        a13 = "문자열1"
    } else if (a14 == 2) {
        a13 = "문자열2"
    } else if (a14 == 3) {
        a13 = "문자열3"
    } else {
        a13 = "그 외의 문자열"
    }
    println("a13 : $a13")

    val a15 = when(a14) {
        1 -> "문자열1"
        2 -> "문자열2"
        3 -> "문자열3"
        else -> "그 외의 문자열"
    }
    println("a15 : $a15")
}

// 조건에 따라 값을 반환하는 함수
fun setValue1 (a1: Int) : String {
    if (a1 == 1) {
        return "문자열1"
    } else if (a1 == 2) {
        return "문자열2"
    } else {
        return "그 외의 문자열"
    }
}

// 위 함수를 when으로 바꿔 쓸 수 있음.
fun setValue2 (a1: Int) = when(a1) {
    1 -> "문자열1"
    2 -> "문자열2"
    else -> "그 외의 문자열"
}