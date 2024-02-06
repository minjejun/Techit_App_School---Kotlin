import kr.co.lion.pkg1.TestClass2
import kr.co.lion.pkg3.TestClass3
import kr.co.lion.pkg3.TestClass4
import java.awt.List
import java.util.ArrayList
import java.util.Scanner

// import kr.co.lion.pkg2.TestClass2

fun main() {
    // 다른 패키지의 클래스를 사용.
    var obj1 = kr.co.lion.pkg1.TestClass1()
    println("obj1.t1 : ${obj1.t1}")
    obj1.t1Method()

    // TestClass2는 import로 명시하였기에 패키지명 생략할 수 있음.
    var obj2 = TestClass2()
    println("obj2.t2 : ${obj2.t2}")
    obj2.t2Method()

    var obj22 = kr.co.lion.pkg2.TestClass2()
    println("obj22.t22 : ${obj22.t22}")
    obj22.t22Method()

    val obj3 = TestClass3()
    val obj4 = TestClass4()
    obj3.t3Method()
    obj4.t4Method()
}

    // 개발도구가 제공하는 자동완성 기능 잘 쓰기
//    val obj5 = List()
//    val obj6 = ArrayList()