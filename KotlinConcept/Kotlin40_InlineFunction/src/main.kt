// 인라인 함수 - 장점도 명확하고 단점도 명확.
// 함수가 Java 파일로 변경될 때 함수를 호출하는 코드가 함수의 내부 코드로 변경됨.
// 자주 사용하는 함수를 inline 함수로 만들어주면 Java 코드로 변경될 때 코드의 양이 매우 많이 늘어나는
// 단점 가지고 있음. 함수를 호출해 코드의 흐름이 이동하는 작업을 하지 않기 때문에 수행속도가 좋아진다.
// 자주 사용하지 않는 함수를 inline 함수로 정의해 쓰면 된다.
// 장점 -
// 단점 -

fun main() {
    testFunction1()
    testFunction1()

    testFunction2()
    testFunction2()
}

fun testFunction1() {
    println("----------------------")
    println("testFunction1")
    println("-----------------------")
}

inline fun testFunction2() {
    println("----------------------")
    println("testFunction2")
    println("-----------------------")
}