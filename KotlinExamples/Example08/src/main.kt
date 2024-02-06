import java.util.Scanner

// 문제 8) 사용자에게 정수를 입력받아 누적한다.
// 사용자가 0을 입력하면 입력을 중단하고 그 때까지의 총합을 출력한다.

// Step 1) 기능 정리

// Step 2) 각 기능별 함수 구현
// → 아직 함수 내부의 코드는 작성하지 않음.

// Step 3) 각 함수 내부의 코드 구현
//→ 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트 해줌.

// Step 4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해줌.

// 키보드로부터 정수를 입력받는 함수
// 입력을 반복하는 함수
// 입력받은 정수를 누적하는 함수
// 사용자가 0을 입력하면 입력을 중단하는 함수
// 입력받은 정수들을 합하는 함수
// 입력받은 총합을 출력하는 함수.

fun main() {
    val sum = repeatInputAndSum()
    printResult(sum)
}

// 키보드로부터 정수를 입력받는 함수.
fun getInteger(): Int {
    // 입력 받음
    val scanner = Scanner(System.`in`)
    // 사용자에게 보일 입력 요청 메시지 출력
    print("숫자를 입력하세요 : ")
    // 사용자가 입력한 변수 변수 선언 안하고 바로 return.
    return scanner.nextInt()
}

// 그 정수를 누적하는 함수
fun accumulateNumber(input: Int, sum: Int): Int {
    // 입력 + 총합으로 계속 누적됨
    return sum + input
}

// 사용자가 0을 입력하면 입력을 중단하는 함수
fun cancelInput(input: Int): Boolean {
    // input이 0이 아닌지 검사.
    return input != 0
}

// 입력을 반복하고 입력했던 정수들을 더하는 함수
fun repeatInputAndSum(): Int {
    // 총합 정의.
    var sum = 0

    // 0을 입력하기 전까지는 계속 누적하다가 0을 입력하면 반복문 벗어나는 반복문.
    while(true) {
        // 입력 함수를 이용해 정수 입력받음.
        val input = getInteger()

        // 입력이 0이라면 반복문 빠져나가고 -> (입력 종료)
        if (!cancelInput(input)) break

        // 지금까지 입력했던 정수를 더함.
        sum = accumulateNumber(input, sum)
    }
    // 총합을 return 해서 main 함수로 이동.
    return sum
}

// 입력받은 총합을 출력하는 함수
fun printResult(sum: Int) {
    println("지금까지 입력한 수의 총합은 ${sum}입니다.")
}