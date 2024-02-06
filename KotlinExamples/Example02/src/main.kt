import java.util.*

// 키보드로부터 입력 받아 짝수라면 "짝수입니다"를 출력
// 홀수라면 "홀수입니다" 출력.

// step 1) 기능 정리
// 1. 키보드로 부터 입력 받는 기능
// 2. 짝수 여부를 판단하여 출력하는 기능

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step 2) 각 기능 별로 필요한 데이터, 발생되는 데이터, 입력되는 데이터 등 정리.
// -> 객체 지향 하고 하는 방법 알려주신다고 하심.
fun main() {
    val num = inputNum()
    printOdd(num)
}

fun inputNum(): Int {
    // 입력 하는 부분 만들기
    val scanner = Scanner(System.`in`)
    print("숫자를 입력하세요 : ")
    val num = scanner.nextInt()

    return num
}

fun printOdd(num : Int) {
    if ( num % 2 == 0 ) {
        println("짝수입니다.")
    } else {
        println("홀수입니다.")
    }
}