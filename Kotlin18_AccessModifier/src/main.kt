import kr.co.lion.pkg1.*
import kr.co.lion.pkg2.*

fun main() {
    // 같은 파일에 있는 클래스 사용
    // 접근 제한자에 관계없이 모두 사용 가능.
    val obj10 = PrivateClass1()
    val obj11 = PublicClass1()
    val obj12 = InternalClass1()
    println("obj10 : $obj10")
    println("obj11 : $obj11")
    println("obj12 : $obj12")

    // 같은 모듈, 같은 패키지, 다른 파일
    // private는 파일이 다르면 사용이 불가
    // val obj20 = PrivateClass2()
    // public은 무조건 사용 가능
    val obj21 = PublicClass2()
    // 모듈이 같다면 public과 동일
    val obj22 = InternalClass2()
    // println("obj20 : $obj20")
    println("obj21 : $obj21")
    println("obj22 : $obj22")

    // 같은 모듈, 다른 패키지
    // 파일이 다르므로 사용 불가.
    // val obj30 = PrivateClass3()
    // public은 무조건 사용 가능
    val obj31 = PublicClass3()
    // 모듈이 같다면 public과 동일
    val obj32 = InternalClass3()
    // println("obj30 : $obj30")
    println("obj31 : $obj31")
    println("obj32 : $obj32")

    // 다른 모듈
    // 파일이 다르므로 사용 불가.
    // val obj40 = PrivateClass4()
    // public은 무조건 사용 가능
    val obj41 = PublicClass4()
    // 모듈이 다르기에 오류.
    // val obj42 = InternalClass4()

    // 같은 파일에 있는 클래스의 객체를 생성해 변수나 메소드에 접근.
    val obj50 = SuperClass1()
    // private는 절대 사용 불가
    // println("obj50.a10 : ${obj50.a10}")
    println("obj50.a11 : ${obj50.a11}")
    // protected 객체 생성을 통한 사용에는 접근이 불가
    // println("obj50.a12 : ${obj50.a12}")
    println("obj50.a13 : ${obj50.a13}")

    // 같은 모듈, 같은 패키지, 다른 파일
    var obj60 = SuperClass2()
    // println("obj60.a20 : ${obj60.a20}")
    println("obj60.a21 : ${obj60.a21}")
    // println("obj60.a22 : ${obj60.a22}")
    println("obj60.a23 : ${obj60.a23}")

    // 같은 모듈, 다른 패키지
    var obj70 = SuperClass3()
    // println("obj70.a30 : ${obj70.a30}")
    println("obj70.a31 : ${obj70.a31}")
    // println("obj70.a32 : ${obj70.a32}")
    println("obj70.a33 : ${obj70.a33}")

    // 다른 모듈
    var obj80 = SuperClass4()
    // println("obj80.a40 : ${obj80.a40}")
    println("obj80.a41 : ${obj80.a41}")
    // println("obj80.a42 : ${obj80.a42}")
    // println("obj80.a43 : ${obj80.a43}")
}

// 같은 파일에 있는 클래스

open private class PrivateClass1
open public class PublicClass1
// 클래스에는 protected를 붙일 수 없음.
// protected class ProtectedClass1
open internal class InternalClass1

// 같은 파일에 있는 클래스 상속 시 자식 클래스는 부모 클래스의 접근 제한자를 따라야 함
// 같은 파일에 있는 모든 클래스들은 상속이 자유로움
private class TestClass1 : PrivateClass1()
public class TestClass2 : PublicClass1()
internal class TestClaass3 : InternalClass1()

// 같은 파일의 클래스
open class SuperClass1 {
    private var a10 = 100
    public var a11 = 101
    protected var a12 = 102
    internal  var a13 = 103
}

// 같은 파일의 클래스 상속
class SubClass1 : SuperClass1() {
    fun subMethod1(){
        // println("a10 : $a10")
        println("a11 : $a11")
        println("a12 : $a12")
        println("a13 : $a13")
    }
}

// 같은 모듈, 같은 패키지, 다른 파일
class SubClass2 : SuperClass2() {
    fun subMethod2(){
        // println("a20 : $a20")
        println("a21 : $a21")
        println("a22 : $a22")
        println("a23 : $a23")
    }
}

// 같은 모듈, 다른 패키지
class SubClass3 : SuperClass3() {
    fun subMethod3(){
        // println("a30 : $a30")
        println("a31 : $a31")
        println("a32 : $a32")
        println("a33 : $a33")
    }
}