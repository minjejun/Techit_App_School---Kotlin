import jdk.incubator.vector.VectorOperators.Test

fun main() {
    // null을 허용하지 않는 프로퍼티
    // var a1 : TestClass1 = null

    // null을 허용하는 프로퍼티
    var a2: TestClass1 ?= null // 무조건 타입 지정해주고 ?=를 해줌.

    // 변수에 null 값이 들어있는 상태에서 메소드를 호출함.
    // a2!!.testMethod1() // NullPointerException 에러 발생.

    // !! : null을 허용하는 변수에 저장되어 있는 값을 null을 허용하지 않는 형태로 변환.
    // Null을 허용하는 변수에 저장되어 있는 값을 null을 허용하지 않는 변수에 담을 때 사용.
    // 이 때, null 값이 들어있디면 오류가 발생.
    val t1 : TestClass1 = TestClass1()
    val t2 : TestClass1? = TestClass1()
    val t3 : TestClass1? = null

    // null을 허용하지 않는 타입 변수에 null을 허용하지 않는 타입의 변수의 값을 넣어줌.
    val t4 : TestClass1 = t1
    // null을 허용하는 타입의 변수 뒤에 !!을 붙혀서 null을 허용하지 않는 타입의 값으로 변경.
    // 이 때, null 값이 아닌 객체의 주소값이 들어 있으므로 정상 변환됨.
    val t5 : TestClass1 = t2!!
    println("t4 : $t4")
    println("t5 : $t5")

    // null을 허용하는 타입의 변수 뒤에 !!을 붙혀서 null을 허용하는 타입의 값으로 변경.
    // 이 때, null 값이 들어 있으므로 변환 때 오류 발생.
    // 변수에 null이 아닌 객체의 주소값이 들어있다는 것을 100% 보장할 수 있을 경우에만 사용.
    // val t6 : TestClass1 = t3!!
    // println("t6 : $t6")

    // 변수 ?: 기본값 : 객체가 가지고 있는 프로퍼티나 메소드를 호출해서 값을 반환받을 경우 사용.
    // 변수에 null 값이 들어가 있으면 기본값으로 설정된 값이 반환됨.

    // 변수 ?: 기본값 : null 값을 허용하는 변수를 사용할 때 null이 들어가 있을 경우
    // 객체 대신에 기본값으로 설정되어 있는 것을 전달해 줌.
    // 변수에 null 값이 들어가 있을 경우 객체를 생성해서 반환해주는 작업을 할 때 사용.
    var t7: TestClass1? = null
    var t8: TestClass1? = TestClass1()
    // null 허용

    var t9 : TestClass1 = t7 ?: TestClass1()
    var t10 : TestClass1 = t8 ?: TestClass1()
    // null 허용하지 않음.

    println("t7 : ${t7}, t9 : ${t9}")
    println("t8 : ${t8}, t10 : ${t10}")

    // ? : 객체가 가지고 있는 프로퍼티나 메소드를 사용할 때 사용하는 연산자
    // 변수에 null이 들어가 있다면 수행이 무시됨.
    // 변수에 객체의 주소값이 들어가 있다면 객체에 접근해 프로퍼티나 메소드를 사용.
    val t11 : TestClass1? = null
    val t12 : TestClass1? = TestClass1()

    // 프로퍼티
    // 객체를 가지고 있는 변수에 null이 들어가 있으면 프로퍼티 접근이 중단되고 null을 반환.
    println("t11.testValue1 : ${t11?.testValue1}")
    println("t12.testValue1 : ${t12?.testValue1}")

    // 메소드
    // null이 들어가 있으면 메소드 호출 취소됨.
    t11?.testMethod1() // 아무 일도 일어나지 않음
    t12?.testMethod1() // 메소드 호출함.
}

class TestClass1 {

    var testValue1 = 100

    fun testMethod1() {
        println("TestClass1의 testMethod1")
    }

    // 값을 반환하는 메소드
    fun testMethod2() : Int {
        return 100
    }
}