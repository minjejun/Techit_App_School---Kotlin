import java.util.*

// 문제 7) 사용자에게 정수를 입력받고 1부터 입력받은 숫자까지의 총합을 구한다.

// Step 1) 기능 정리
// 1. 정수를 입력받는 기능
// 2. 1부터 입력받은 숫자까지의 총합을 구함
// 3. 출력.

// Step 2) 각 기능별 함수 구현
// → 아직 함수 내부의 코드는 작성하지 않음.

// Step 3) 각 함수 내부의 코드 구현
//→ 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트 해줌.

// Step 4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해줌.

fun main() {
    // inputNumber 함수 테스트
//    val a1 = inputNumber()
//    println("a1 : $a1")

    // getTotal 함수 테스트
//    val a1 = getTotal(100)
//    println("a1 : $a1")

    // printResult 함수 테스트
    // printResult(100, 5050)

    // 숫자 입력받음
    val num = inputNumber()

    val sum = getTotal(num)

    printResult(num, sum)

}

// 1. 정수를 입력받는 기능
fun inputNumber(): Int {
    val scanner = Scanner(System.`in`)
    print("숫자를 입력해주세요 : ")
    val num = scanner.nextInt()

    return num
}

// 2. 1부터 입력받은 숫자까지의 총합을 구함
fun getTotal(number : Int): Int { // 숫자를 입력받기에 int 타입으로 Number를 주고, 반환 타입도 Int로 지정.
    // 누적 값을 담을 변수
    var total = 0

    // 1부터 입력받은 숫자까지 반복
    for (i in 1..number) {
        total += i
    }

    // 누적한 값 리턴.
    return total
}

// 3. 출력.
fun printResult(num: Int, total: Int) {
    println("1부터 ${num}까지의 총합은 ${total}입니다.")
}