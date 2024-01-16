import java.util.*

// 키보드로부터 입력 받아 출력하는 프로그램


fun main() {
    // 키보드로부터 입력을 받음.
    val n1 = inputNumber()
    // 출력함.
    printNumber(n1)
}

fun inputNumber(): Int {
    val scanner = Scanner(System.`in`) // 입력
    // 키보드로 부터 정수값 입력
    print("숫자를 입력해주세요 : ")
    val number = scanner.nextInt()
    // 입력받은 값 반환.
    return number
}

fun printNumber(number : Int) {
    println("입력받은 숫자 : $number")
}