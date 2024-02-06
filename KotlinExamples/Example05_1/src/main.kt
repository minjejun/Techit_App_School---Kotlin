// 문제 2) 1부터 100까지의 총합을 출력하세요.

// step1) 기능 정리

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {
    val sum = getTotal()
    printTotal(sum)
}

// 1. 1부터 100까지의 총합을 구한다.
fun getTotal(): Int {
    var sum = 0

    for( i in 1..100) {
        sum += i
    }

    return sum
}

// 2. 총합을 출력한다.
fun printTotal(sum: Int) {
    println("1부터 100까지의 총합은 ${sum}입니다.")
}