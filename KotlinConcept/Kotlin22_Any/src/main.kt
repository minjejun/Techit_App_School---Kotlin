

fun main() {
    // 코틀린에서 모든 클래스는 Any를 사옥받기 때문에 모드느 객체는
    // Any 타입 변수에 담을 수 있음.
    val a1: Any = TestClass1()
    val a2: Any = TestClass2()
    println("a1 : $a1")
    println("a2 : $a2")

    // 객체의 주소값을 가지고 있는 변수를 출력할 경우
    // toString 메소드를 호출하여 메소드가 반환하는 문자열을 출력.
    val s1 = a1.toString()
    val s2 = a2.toString()
    println("s1 : $s1")
    println("s2 : $s2")

    val t3 = TestClass3(100, 200)
    println("t3 : $t3")
}

// 상속 관계를 설정하지 않았지만 Any를 상속받음.
class TestClass1
class TestClass2

class TestClass3(var a1: Int, var a2: Int) {
    // toString 메소드를 overriding 함.
    // toString : 객체를 문자열로 변환하는 의미의 메소드
    // 객체의 주소값을 가지고 있는 변수를 출력하면 toString 메소드가 호출되고
    // 여기서 반환하는 문자열을 출력해줌.
    override fun toString(): String {
        // 강사님은 객체가 가지고 있는 프로퍼티들의 값을 출력해보는 코드를 넣어놓으심.
        // 나만의 방식은 자유.
        println("a1 : $a1")
        println("a2 : $a2")
        return "TestClass3을 통해 만든 객체입니다."
    }

}