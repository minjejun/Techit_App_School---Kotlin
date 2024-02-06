

fun main() {
    // 객체 생성
    // 부모 클래스 형 타입에 담음
    val obj1: SuperClass1 = SubClass1()

    // 구현한 인터페이스 형 타입에 담음
    val obj2: Inter1 = SubClass2()

    // 객체의 주소값을 가지고 있는 변수의 타입이 부모클래스 타입이므로
    // 부모가 가지고 있는 메소드이거나 자식에서 overriding한 메소드만 호출할 수 있음.
    obj1.superMethod1()
    // obj.subMethod1()

    // 객체의 주소값을 가지고 있는 변수의 타입이 구현한 인터페이스 타입이므로
    // overriding한 메소드만 호출할 수 있음.
    // obj2.subMethod2()
    obj2.interMethod1()

    println("---------------------------------------")

    // as : 객체의 주소값을 가지고 있는 변수의 타입을 다른 클래스 타입으로 변환하는 키워드.
    // 또한

    // obj1의 타입을 SuperClass1에서 SubClass1로 변환하고 obj1에 담긴 값을 obj3에 넣어줌.
    val obj3 = obj1 as SubClass1
    obj1.superMethod1()
    obj1.subMethod1()

    obj3.superMethod1()
    obj3.subMethod1()

    // 위의 클래스는 obj1에 SuBClass1을 가지고 만든 객체의 주소값이 담겨져 있기에 가능한 것
    // 만약 다른 클래스 타입으로 변환할 경우 오류 발생.
    // ClassCastExceptinon 예외 발생
    // val obj4 = obj1 as String

    // is : 객체를 생성했을 때 사용한 클래스가 무엇인지 확인할 수 있음.
    // 또한, 객체를 생성했을 때 사용한 클래스의 부모클래스도 확인할 수 있음.
    // 의미는 객체에 지정한 클래스 부분이 있는지를 확인하는 것
    val obj5 = SuperClass1()
    val chk1 = obj5 is SubClass1
    val chk2 = obj5 is SuperClass1
    val chk3 = obj5 is Inter1

    println("chk1 : $chk1")
    println("chk2 : $chk2")
    println("chk3 : $chk3")

    println("---------------------------------------")

    // ⭐️ 스마트 캐스팅 : 특정 조건을 만족하면 자동으로 형변환이 이루어지는 것.
    val obj6: SuperClass1 = SubClass1()
    // SubClass1 부분이 있는지 검사
    // 아래와 같이 객체에 특정 클래스 부분이 이쓴ㄴ지르 검사하는 코드는'
    // 해당 타입으로 형변환한 다음, 메소드나 프로퍼티를 호출하려고 하는 경우가 많음
    // 이제 코틀린은 검사 대상 타입으로 변환까지 해줌.

    if(obj6 is SubClass1) { // 검사 후 형변환
        obj6.subMethod1()
    }
    // 위의 if 문이 끝나면 원래의 타입으로 돌아옴.

    // 매개변수가 Any인 함수 호출
    // Any - 모든 클래스의 최상위 부모 / 기본 자료형도 사실 클래스 타입이기에 Any 타입에 담을 수 있음.
    anyFunction(obj1)
    anyFunction(obj2)
    anyFunction(100)
    anyFunction("안녕하세요")

    // 코틀린에서 사용하는 모든 기본 자료형들은 사실 클래스임.
    // 코틀린은 모든 값들을 객체로 관리한다고 생각하면 됨.

    val str1 = "100"
    val number1 = str1.toInt()
    if(number1 is Int) {
        println("정수로 변환되었습니다.")
    }

    val str2 = number1.toString()
    if(str2 is String) {
        println("문자열로 변환되었습니다.")
    }
}

open class SuperClass1 {
    fun superMethod1() {
        println("SuperClass1의 superMethod1")
    }
}

interface Inter1 {
    fun interMethod1()
}

class SubClass1 : SuperClass1() {
    fun subMethod1() {
        println("SubClass1의 subMethod1")
    }
}

class SubClass2 : Inter1 {
    fun subMethod2() {
        println("SubClass2의 interMethod1")
    }

    override fun interMethod1() {
        println("SubClass2의 interMethod1")
    }
}

// 매개변수로 Any 타입을 가지고 있는 함수
fun anyFunction(obj : Any) {
    // is를 통해 클래스 타입 확인
    // 스마트 캐스팅을 이용해 메소드 호출 가능.
    if (obj is SubClass1) {
        obj.subMethod1()
    }
    if (obj is SubClass2) {
        obj.subMethod2()
    }
    if (obj is Int) {
        println("정수입니다")
    }
    if (obj is String) {
        println("문자열입니다")
    }
}