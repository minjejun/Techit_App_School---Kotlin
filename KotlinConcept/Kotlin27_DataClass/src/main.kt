

fun main() {
    // 일반 클래스의 객체를 생성
    val obj1 = TestClass1(100, 200)
    val obj2 = TestClass1(100, 200)

    // 데이터 클래스의 객체 생성
    val obj3 = TestClass2(100, 200)
    val obj4 = TestClass2(100, 200)

    // 일반 클래스를 통해 생성한 객체 비교
    // 코틀린에서 == 연산
    if(obj1 == obj2) {
        println("obj1와 obj2는 같은 객체입니다.")
    } else {
        println("obj1와 obj2는 다른 객체입니다.")
    }

    if(obj3 == obj4) {
        println("obj3와 obj4는 같습니다.")
    } else {
        println("obj3와 obj4는 다릅니다.")
    }

    // copy
    val obj5 = obj3.copy()
    println("obj5 : ${obj5.hashCode()}")
    println("obj3 : ${obj3.hashCode()}")

    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")
    println("obj3.a1 : ${obj3.a1}")
    println("obj3.a2 : ${obj3.a2}")

    obj5.a1 = 1000
    println("obj5.a1 : ${obj5.a1}") // 1000
    println("obj3.a1 : ${obj3.a1}") // 100
    // 서로 다르게 나옴 -> 객체가 서로 다름.

    // toString
    println("obj1 : $obj1")
    println("obj3 : $obj3")

    // componentN
    val num1 = obj3.component1()
    val num2 = obj3.component2()

    println("num1 : $num1")
    println("num2 : $num2")

    // 첫번째 변수인 num3 에는 component1을 호출하여 반환하는 값이 저장되고
    // 두번째 변수인 num4 에는 component2를 호출하여 반환하는 값이 저장됨.
    val (num3, num4) = obj3
    println("num3 : $num3")
    println("num4 : $num4")
}

// 일반 클래스
class TestClass1(var a1 : Int, var a2 : Int)


// 데이터 클래스
data class TestClass2(var a1 : Int, var a2 : Int)
