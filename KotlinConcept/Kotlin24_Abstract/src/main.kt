import jdk.incubator.vector.VectorOperators.Test

fun main() {
    // 추상 클래스의 객체 생성
    // 추상 클래스는 완벽한 클래스가 아니기 때문에 객체를 생성하는 것이 불가능함.
    // val t1 = TestClass1()

    // 추상 클래스를 상속 받은 클래스의 객체를 생성
    val sub1 = SubClass1()
    sub1.testMethod1()
    sub1.testMethod2()
    sub1.testMethod3()
}

// 추상 클래스는 abstract 키워드를 붙혀줘야 함.
// 추상 클래스는 상속이 가능해야 하기 때문에 open 키워드를 붙혀줘야 함.
abstract class TestClass1 { // 어짜피 추상 클래스는 상속밖에 방법이 없기에 open을 생략해도 되겠끔 제공.
    fun testMethod1() {
        println("TestClass1의 testMethod1")
    }

    fun testMethod2() {
        println("TestClass1의 testMethod2")
    }

    // 추상 메소드
    // 추상 메소드는 추상 메소드임을 알리기 위해 abstract 라는 키워드를 붙혀줘야 함.
    // 추상 메소드는 overriding이 가능해야 하기 때문에 반드시 open을 붙여줘야 함.
    abstract fun testMethod3() // 중괄호가 있으면 완벽한 메소드.
    // 자식 클래스에서 오버라이딩을 무조건 해야하기 때문에 open 키워드를 생략하도 되겠끔 제공.
}

// 추상 클래스를 상속 받은 클래스
class SubClass1 : TestClass1() {
    // 추상 메소드 구현. (오버라이드 해서)
    override fun testMethod3() {
        println("SubClass1에서 구현한 testMethod3")
    }
}