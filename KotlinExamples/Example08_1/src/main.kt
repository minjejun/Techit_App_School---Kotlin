import java.util.*

// 문제 8) 사용자에게 정수를 입력받아 누적한다.
// 사용자가 0을 입력하면 입력을 중단하고 그 때까지의 총합을 출력한다.

// Step 1) 기능 정리

// 1. 정수 입력받아 누적하는 기능
// 2. 총합을 출력.

// Step 2) 각 기능별 함수 구현
// → 아직 함수 내부의 코드는 작성하지 않음.

// Step 3) 각 함수 내부의 코드 구현
//→ 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트 해줌.

// Step 4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해줌.

fun main() {
    val total = getTotal()
    printResult(total)
}

// 1. 정수 입력받아 누적하는 기능
fun getTotal(): Int {
    val scanner = Scanner(System.`in`)

    // 누적값을 담을 변수
    var total = 0

    // 입력받은 숫자를 담을 변수
    var inputNum: Int

    do {
        // 정수 입력받음
        print("숫자를 입력해주세요 : ")
        inputNum = scanner.nextInt()

        // 누적함.
        total += inputNum
    } while(inputNum != 0)

    return total
}

// 2. 총합을 출력.
fun printResult(total: Int) {
    println("총합은 ${total}입니다.")
}