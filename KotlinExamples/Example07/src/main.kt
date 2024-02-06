import java.util.Scanner

// 문제 7) 사용자에게 정수를 입력받고 1부터 입력받은 숫자까지의 총합을 구한다.

// Step 1) 기능 정리

// Step 2) 각 기능별 함수 구현
// → 아직 함수 내부의 코드는 작성하지 않음.

// Step 3) 각 함수 내부의 코드 구현
//→ 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트 해줌.

// Step 4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해줌.

fun main() {
    val a = getInteger()

    val sum = getSum(a)

    printSum(a, sum)
}

// 사용자에게 정수를 입력받는 함수
fun getInteger(): Int {
    // 정수를 입력받게하는 구문
    val scanner = Scanner(System.`in`)
    print("입력한 숫자 까지의 총합을 계산하고 싶으면 숫자를 입력해주세요 : ")
    // a를 입력받는 수라고 정의.
    val a = scanner.nextInt()

    // return 해서 main 함수로 감.
    return a
}

// 입력받은 숫자까지의 총합을 구하는 함수
fun getSum(a: Int): Int { // a는 입력받을 숫자.

    // 총합 정의
    var sum = 0

    // for 문을 이용해서 그 숫자까지의 합을 구함
    for ( i in 1..a) {
        sum += i
    }

    // 총합을 구해서 main함수로 리턴.
    return sum
}

// 총합을 출력하는 함수
fun printSum(a: Int, sum: Int) {
    println("1부터 ${a}까지의 총합은 ${sum}입니다.")
}