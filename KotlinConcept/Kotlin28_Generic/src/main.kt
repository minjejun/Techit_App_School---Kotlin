

fun main() {
    // 제네릭 타입은 객체를 생성할 때 타입을 결정해줘야 함.
    // T 타입으로 정의된 변수의 타입이 Int로 결정됨.
    val t1 = TestClass1<Int>()
    t1.testMethod1(100)

    val t2 = TestClass1<String>()
    t2.testMethod1("헤헤")

    val t3 = TestClass2<Int, Double, Boolean, String>(100, 11.11)
    t3.testMethod3(true, "임세나 귀여워")

    val t4 = TestClass2<Double, String, Boolean, String>(3.141592, "임세나 사랑해")
    t4.testMethod3(true, "임세나 귀여워")

    // 불변성 : 객체를 생성할 때 설정한 제네릭과 같은 변수에 담을 수 있다.
    // 클래스간의 상속 관계에 상관없이 제네릭에 설정한 클래스 타입이 다르면 오류가 발생한다.
    val t5:TestClass3<SubClass1> = TestClass3<SubClass1>()

    // 공변성 : 변수에 설정한 제네릭이 객체를 생성했을 때 사용한 제네릭과 같거나 부모 클래스인 경우에
    // 담을 수 있다.
    val t8:TestClass4<SubClass1> = TestClass4<SubClass1>()
    val t9:TestClass4<SuperClass1> = TestClass4<SubClass1>()
    // val t10:TestClass4<SubClass2> = TestClass4<SubClass1>()

    // 반 공변성 : 변수에 설정한 제네릭이 객체를 생성했을 때 사용한 제네릭과 같거나
    // 자식 클래스인 경우에 담을 수 있음.
    val t11 : TestClass5<SubClass1> = TestClass5<SubClass1>()
    // val t12 : TestClass5<SubClass1> = TestClass5<SubClass1>()
    val t13 : TestClass5<SubClass2> = TestClass5<SubClass1>()
}

//  < > : 안액 알파벳 문자를 넣어줌. 보통 대문자 한 글자를 작성.
// 이 알파벳은 아직 겨렂ㅇ되지 않은 타입을 의미
// 어떠한 타입인지 결정되지 않았지만 이 타입의 변수들을 정의하여 클래스를 작성하고
// 향후, 객체를 생성할 때 타입을 결정할 수 있음.
class TestClass1<T> {
    fun testMethod1(a1: T) {
        println("a1 : $a1")
    }
}

// 제네릭을 여러 개 생성할 수 있고, 타입을 무조건 정의해줘야 함.
class TestClass2<A, B, C, D>(var a1 : A, var a2: B) {
    fun testMethod3(a3: C, a4: D) {
        println("a1 : $a1")
        println("a2 : $a2")
        println("a3 : $a3")
        println("a4 : $a4")
    }
}

open class SuperClass1

open class SubClass1 : SuperClass1()

class SubClass2 : SubClass1()

// 불변성 (제네릭에 키워드를 붙히지 않음.) : 객체를 생성할 때 설정한 제네릭과 같은 변수에 담을 수 있음.
// 클래스간의 상속 관계 상관 없이 제네릭에 설정한 클래스 타입이 다르면 오류가 발생함.
class TestClass3<T>
// 공변성
class TestClass4<out A>()

// 반 공변성
class TestClass5<in A>()



