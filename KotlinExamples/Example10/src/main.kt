// 철수가 저금을 한다. 첫 날 100원을 저금한다. 두 번째 날 부터는 전 날 잔고액의 3배를 저금한다.
// 1일차부터 30일차까지의 통장 잔고액을 모두 출력한다.
// 조건 : 변수는 Int 타입의 변수만 사용한다.

// Step 1) 기능 정리

// Step 2) 각 기능별 함수 구현
// → 아직 함수 내부의 코드는 작성하지 않음.

// Step 3) 각 함수 내부의 코드 구현
// → 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트 해줌.

// Step 4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해줌.

fun main() {
    accumulateSaveMoney()
}

// 저금하는 금액을 저장하는 함수 - 2번째 날부터는 전 날 잔고액의 3배를 저금.
fun accumulateSaveMoney() {

    // 저금 금액 정의 - 첫 날 100원을 넣으므로 100원으로 정의.
    var saveMoney = 100

    // 현재 잔고액 정의
    var currentBalance = 0

    // for 문으로 1 ~ 30까지 반복하게 함.
    for ( i in 1..30) {
        if ( i == 1 ) { // 첫 날은 저금 금액을 100원 넣어야 하고, 저금 금액과 현재 통장잔고액이 같아야 함.
            currentBalance += saveMoney
        } else { // 두 번째 날부터는 전 날 잔고액의 3배를 저금해야 함.
            saveMoney = currentBalance * 3
            currentBalance += saveMoney
        }
        // 현재 잔고액을 return 하여 메인 함수로 이동.
        printAccountBalance(i, currentBalance)
    }
}

// 통장 잔고액을 출력하는 함수 - 1일부터 30일까지 전부 출력해야 함.
fun printAccountBalance(day: Int, balance: Int) {
    println("${day}일차 잔고액: ${balance}원")
}
