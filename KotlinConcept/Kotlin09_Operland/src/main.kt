// 연산자
// 의미를 가지고 있는 특수 문자들.
// 하나 이상의 값을 가지고 특정 연산을 수행하기 위해 사용하는 키워드

fun main() {
    // 최우선 연산자
    // . 은 객체, [ ]는 배열할 때 살펴볼 예정.
    // ( ) : 수학과 같이 가장 먼저 계산할 부분이 있다면  ( ) 로 묶어줌.
    var a1 : Int = 10 + 2 * 4 // 18
    var a2 : Int = ( 10 + 2 ) * 4 // 48
    println("a1 : $a1")
    println("a2 : $a2")

    // 단항 연산자
    // 연산에 참여하는 값이 하나인 연산자
    // !(not) : true를 false로 false를 true로 바꿔줌.
    // 조건식의 결과를 반대로 부정하고 싶을 때 사용.
    var a3 = true
    var a4 = !a3
    var a5 = !a4
    println("a4 : $a4")
    println("a5 : $a5")

    // 부호 연산자
    // + : 그대로 / - : 양수를 음수로, 음수를 양수로
    var a6 = 100
    var a7 = +a6
    var a8 = -a6
    println("a7: $a7")
    println("a8: $a8")

    // 증감 연산자
    // 변수가 가지고 있는 값을 1증가하거나 1 감소함.
    // 변수 앞에 있는 것과 뒤에 있는 것이 조금 다름.
    var a9 = 100
    a9++
    println("a9 : $a9")

    var a10 = 100
    a10 = a10 + 1
    println("a10 : $a10")

    ++a9
    println("a9 : $a9")

    a9--
    println("a9 : $a9")

    --a9
    println("a9 : $a9")

    var a11 = 10
    var a12 = 10

    // 증감 연산자가 앞에 있는 경우
    // 최우선 연산자를 제외한 모든 연산자들보다 먼저 수행됨.
    var a13 = ++a11 // a11이 먼저 ++가 된 후 = 계산
    var a14 = --a12

    println("a11 : $a11, a13 : $a13")
    println("a12 : $a12, a14 : $a14")
    println()

    // 증감 연산자가 뒤에 있는 경우
    // 모든 연산자들보다 가장 마지막에 수행됨.
    a11 = 10
    a12 = 10

    a13 = a11++ // = 부터 계산된 후 ++ 계산.
    a14 = a12--

    println("a11 : $a11, a13 : $a13")
    println("a12 : $a12, a14 : $a14")
    println()

    // 산술 연산자
    // 곱하기, 나누기, 나머지 연산자가 더하기, 빼기 보다 먼저 수행됨.
    // 더하기
    var b1 = 10 + 3

    // 빼기
    var b2 = 10 - 3

    // 곱하기
    var b3 = 10 * 3

    // 나누기
    var b4 = 10 / 3

    // 나머지
    var b5 = 10 % 3
    println("b1 : $b1")
    println("b2 : $b2")
    println("b3 : $b3")
    println("b4 : $b4")
    println("b5 : $b5")
    // 정수와 정수를 나누면 -> 정수 / 실수와 실수를 나누면 -> 실수

    // 관계 연산자
    // 두 값의 관계를 보고 true나 false를 결과로 줌.
    // 좌측의 값이 우측의 값보다 작은가
    var b6 = 10 < 3
    var b7 = 10 < 20
    println("b6 : $b6")
    println("b7 : $b7")

    // 좌측의 값이 우측의 값보다 작거나 같은가
    b6 = 10 <= 3
    b7 = 10 <= 20
    var b8 = 10 <= 10
    println("b6 : $b6")
    println("b7 : $b7")
    println("b8 : $b8")
    println()

    // 좌측의 값이 우측의 값보다 큰가
    b6 = 10 > 3
    b7 = 10 > 20
    println("b6 : $b6")
    println("b7 : $b7")
    println()

    // 좌측의 값이 우측의 값보다 크거나 같은가
    b6 = 10 >= 3
    b7 = 10 >= 20
    b8 = 10 >= 10
    println("b6 : $b6")
    println("b7 : $b7")
    println("b8 : $b8")
    println()

    // 좌측의 값과 우측의 값이 같은가
    b6 = 10 == 10
    b7 = 10 == 20
    println("b6 : $b6")
    println("b7 : $b7")
    println()

    // 좌측의 값과 우측의 값이 다른가
    b6 = 10 != 10
    b7 = 10 != 20
    println("b6 : $b6")
    println("b7 : $b7")
    println()

    // 논리 연산자
    // 좌측과 우측의 값이 true와 false인 수식에서
    // 연산을 하는 연산자.
    // 논리 연산자 좌측과 우측에는 관계 연산자를 사용하는
    // 연산식이 들어가는 것이 일반적.
    // && : 둘 다 true - true / 하나라도 false - false (AND 연산자)
    var c1 = 10 > 2 && 10 < 20
    var c2 = 10 < 2 && 10 < 20
    var c3 = 10 > 2 && 10 > 20
    var c4 = 10 < 2 && 10 > 20
    println("c1 : $c1")
    println("c2 : $c2")
    println("c3 : $c3")
    println("c4 : $c4")
    println()

    // || : 둘 중 하나라도 true라면 - true / 둘 다 false라면 - false (OR 연산자)
    c1 = 10 > 2 || 10 < 20
    c2 = 10 < 2 || 10 < 20
    c3 = 10 > 2 || 10 > 20
    c4 = 10 < 2 || 10 > 20
    println("c1 : $c1")
    println("c2 : $c2")
    println("c3 : $c3")
    println("c4 : $c4")
    println()

    // 배정 대입 연산자
    // ++, --는 변수의 값을 1 증가하거나 1 감소하는 역할 수행.
    // 만약 증가 감소가 아닌 다른 연산을 하거나 1이 아닌 연산에 참여할 값을 직접 지정하고자 한다면
    // 배정대입 연산자 사용.
    // 산슐 연산자와 같이 사용하는 경우 많음.
    var d1 = 10
    var d2 = 10

    d1 = d1 + 10
    d2 += 10
    println("d1 : $d1")
    println("d2 : $d2")
}