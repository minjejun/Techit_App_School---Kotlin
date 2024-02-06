import java.util.*

// 문제 9) 1부터 1씩 증가시키는 값 중 3의 배수이거나 7의 배수인 숫자를 누적함.
// 누적값이 10000이상이 됐을 때의 숫자가 몇인지 출력한다.

// Step 1) 기능 정리

// Step 2) 각 기능별 함수 구현
// → 아직 함수 내부의 코드는 작성하지 않음.

// Step 3) 각 함수 내부의 코드 구현
//→ 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트 해줌.

// Step 4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해줌.

// sum으로 전역 변수를 둬서 누적값을 관리함.
var sum = 0

fun main() {
    // 1부터 1씩 증가시키는 값을 써야 하므로 1을 정의해줘야 함.
    var num = 1

    while(true) {
        accumulateNum(num)
        // 누적값이 10000이 넘었을 때, 반복문 종료.
        if (exceedsTenThousand()) {
            break
        }
        num++
    }
    printAccumulation(num)
}

// 3의 배수이거나 7의 배수이면 숫자를 누적하는 함수
fun accumulateNum(num: Int) {
    if( num % 3 == 0 || num % 7 == 0) {
        sum += num
    }
}

// 누적값이 10000이 넘었는지 확인하는 함수
fun exceedsTenThousand(): Boolean {
    return sum >= 10000
}

// 누적값과 마지막 입력 숫자를 출력하는 함수.
fun printAccumulation(num: Int) {
    println("누적값은 ${sum}입니다.")
    println("누적값이 10000이 넘어간 상태에서 입력한 값은 ${num}입니다.")
}