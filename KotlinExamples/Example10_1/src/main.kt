// 철수가 저금을 한다. 첫 날 100원을 저금한다. 두 번째 날 부터는 전 날 잔고액의 3배를 저금한다.
// 1일차부터 30일차까지의 통장 잔고액을 모두 출력한다. -> 잔고액이 4배가 됨
// 조건 : 변수는 Int 타입의 변수만 사용한다.

// Step 1) 기능 정리
// 1. 통장 잔고액을 구해 출력.

// Step 2) 각 기능별 함수 구현
// → 아직 함수 내부의 코드는 작성하지 않음.

// Step 3) 각 함수 내부의 코드 구현
// → 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트 해줌.

// Step 4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해줌.

fun main() {
    getBanking()
}

// 1. 통장 잔고액을 구해 출력.
fun getBanking() {
    // 첫 날은 100원 저금
    var bankingMoney1: Int = 100
    var bankingMoney2: Int = 0
    var bankingMoney3: Int = 0

    printBanking(1, bankingMoney3, bankingMoney2, bankingMoney1)

    // 2일차부터 30일까지 반복
    for(date in 2..30) {
        bankingMoney1 *= 4
        bankingMoney2 *= 4
        bankingMoney3 *= 4

        // Int 변수가 가질 수 있는 값의 범위를 넘어가는 것을 방지하기 위해
        // 변수의 값을 0 ~ 99,999,999로 제한.

        bankingMoney2 += (bankingMoney1 / 100000000)
        bankingMoney1 %= 100000000 // 덮어씌움

        bankingMoney3 += (bankingMoney2 / 100000000)
        bankingMoney2 %= 100000000 // 덮어씌움

        printBanking(date, bankingMoney3, bankingMoney2, bankingMoney1)
    }

}

fun printBanking(date: Int, m1: Int, m2: Int, m3: Int) {
    if(m1 == 0 && m2 == 0) {
        // format : 출력 서식을 이용해 문자열을 만들 수 있음.
        // 정수 : %d, 실수 : %f, 문자열 : %s, 문자 : %c
        // %숫자d, %숫자s : 숫자만큼 자리를 확보한 다음 우측 정렬로 출력.
        // 비어있는 공간은 공백으로 채워줌.
        // %.숫자.f : 소숫점 이하의 값을 숫자만큼만 표시.
        // %0숫자d : 숫자 만큼 자리를 확보한 다음 우측 정렬로 출력, 비어있는 공간은 0으로 채워줌.
        val a1 = "%2d일차 : %8s%8s%8d원".format(date, "", "", m3)
        println(a1)
    } else if(m1 == 0) {
        var a1 = "%2d일차 : %8s%8d%08d원".format(date, "", m2, m3)
        println(a1)
    } else {
        var a1 = "%2d일차 : %8s%08d%08d원".format(date, m1, m2, m3)
        println(a1)
    }
}