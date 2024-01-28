// 반복문
// 코드의 일부분을 반복하고자 할 때 사용.

fun main() {
    // 숫자1 .. 숫자2 : 숫자1 부터 숫자2 까지 1씩 증가되는 값을 관리하는 요소 만듬.
    println((1..10).toList())
    // 숫자1 until 숫자2 or 숫자1 .. < 숫자2 : 숫자1 부터 숫자2 - 1 까지 1씩 증가되는 값을 관리하는 요소 만듬.
    println((1..< 10).toList())
    // step : step을 지정하면 증가폭을 설정할 수 있음.
    println((1..10 step 2).toList())
    // downTo : 1씩 감소되는 값을 관리할 수 있는 요소를 만들 수 있음.
    println((10 downTo 1).toList())
    // downTo도 step을 설정하면 감소 폭을 설정할 수 있음.
    println((10 downTo 1 step 2).toList())

    println("--------------------------------------------")

    // for : 데이터를 관리하는 요소를 통해 반복.
    // 반복 횟수가 결정되어 있을 때는 반복 횟수만큼의 데이터를 가진 요소를 통해 반복.
    // 최소와 최대 범위가 결정되어 있다면 결정되어 있는 최소와 최대 범위의 값을 가진 요소를 만들어 반복.

    for(v1 in 1..10) {
        println("v1 : $v1")
    }

    // while
    // 주어진 조건식이 true 인 경우에 관리하는 코드를 반복.

    var a1 = 0
    while(a1 < 10) {
        println("while - $a1")
        a1++
    }

    // do while
    // 주어진 조건식이 true인 경우에 관리하는 코드 반복.
    var a2 = 0
    do {
        println("do-while - $a2")
        a2++
    } while(a2 < 10)
}