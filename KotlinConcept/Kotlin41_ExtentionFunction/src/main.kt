// 확장 함수 : 클래스에 메소드를 추가하는 개념

fun main() {
    val str1 = "abcd"
    str1.printString()
}

// 확장 함수
// 클래스 이름.함수 이름
fun String.printString() {
    println("관리하는 문자열은 ${this} 입니다.")
    // 확장함수 안에서 this를 통해 객체 자체에 접근할 수 있다.
}