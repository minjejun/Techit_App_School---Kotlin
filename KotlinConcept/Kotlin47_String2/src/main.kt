

fun main() {
    // 문자열 생성

    // String 클래스의 생성자에
    // StringBuffer, StringBuilder, ByteArray, CharArray
    // 를 넣어주면 가지고 있는 글자 데이터를 이용해
    // 문자열을 생성한다.
    val array1 = CharArray(5){
        'a'
    }
    val str1 = String(array1)
    println("str1: $str1")

    // ""로 묶어준 것도 String 객체를 생성한 것.
    val str2 = "안녕하세요"

    // 원하는 번째의 글자를 가져올 수 있음.
    println("str1[0]: ${str1[0]}")
    println("str1[1]: ${str1[1]}")
}