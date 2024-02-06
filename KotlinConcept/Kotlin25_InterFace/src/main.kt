fun main() {
    val t1 = SubClass1()
    val t2 = SubClass2()

    testFunction1(t1)
    testFunction2(t2)

    val t10 = TestClass10()
    testFunction3(t10)
    testFunction4(t10)
}

// 추상 클래스
abstract class AbstractClass1 {
    abstract fun abstractMethod1()
}

abstract class AbstractClass2 {
    abstract fun abstractMethod2()
}

// 객체의 주소값을 받아 메소드를 호출하는 함수
fun testFunction1(t100 : AbstractClass1) {
    t100.abstractMethod1()
}

fun testFunction2(t200 : AbstractClass2) {
    t200.abstractMethod2()
}

// 코틀린(자바 포함) - 단일 상속만 지원 -> 여러 클래스 상속받을 수 없음.
// class SubClass1 : AbstractClass1(), AbstractClass2()

// 추상 클래스 하나당 하나의 자식 클래스를 만들어줘야 함.
class SubClass1 : AbstractClass1() {
    override fun abstractMethod1() {
        println("SubClass1의 abstractMethod1")
    }
}

class SubClass2 : AbstractClass2() {
    override fun abstractMethod2() {
        println("SubClass2의 abstractMethod2")
    }
}

// 인터페이스
interface Inter1 {
    fun interfaceMethod1()
}

// 인터페이스
interface Inter2 {
    fun interfaceMethod2()
}

fun testFunction3(inter1: Inter1) {
    inter1.interfaceMethod1()
}

fun testFunction4(inter2: Inter2) {
    inter2.interfaceMethod2()
}

// 인터페이스 구현한 클래스
class TestClass10 : Inter1, Inter2 {
    override fun interfaceMethod1() {
        println("TestClass10의 interfaceMethod1")
    }

    override fun interfaceMethod2() {
        println("TestClass10의 interfaceMethod2")
    }
}