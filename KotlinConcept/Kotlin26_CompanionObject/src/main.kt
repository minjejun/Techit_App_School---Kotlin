fun main() {
    // 일반 멤버 변수는 객체를 생성할 때마다 계속 속성됨.
    val t1 = TestClass1(100)
    val t2 = TestClass1(200)
    println("t1.a1 : ${t1.a1}")
    println("t2.a1 : ${t2.a1}")

    t1.a1 = 1000
    println("t1.a1 : ${t1.a1}")
    println("t2.a1 : ${t2.a1}")

    // 정적 멤버는 객체를 생성하지 않고 사용함.
    // 클래스명.멤버이름
    println("TestClass1.a2 : ${TestClass1.a2}")
    // 정적 멤버는 객체를 통한 접근이 불가능함.
    // println("t1.a1 : ${t1.a2}")
    // println("t2.a1 : ${t2.a2}")

    TestClass1.testMethod2()

    t1.testMethod1()

    // Java 파일에 정의된 static 멤버 활용
    // Java 파일에 정의된 정적 멤버 사용은 자유롭게 할 수 있음.
    println("JavaMain.javaValue1 : ${JavaMain.javaValue1}")
    JavaMain.javaMethod1()
}

class TestClass1 {
    // 일반 멤버 변수
    var a1 : Int

    // 정적 멤버 정의
    companion object {
        // 정적 멤버 변수
        var a2 : Int = 200 // 객체를 생성해야지만 메모리에 올라가짐.

        // 정적 멤버 메소드
        fun testMethod2() {
            // 정적 프로퍼티 사용
            println("testMethod2 - a2 : $a2")
            // 정적 메소드에서 일반 멤버 프로퍼티를 사용을 시도함.
            // 정적 멤버는 객체를 생성하지 않아도 사용할 수 있음,
            // 정적 프로퍼티 입장에서 객체가 생성되지 않았을 가능성,
            // 객체가 여러 개가 만들어져 있어서 어떤 객체의 멤버인지 알 수 없는 등의
            // 여러가지 이유 때문에 사용이 불가능 함.
            // println("testMethod2 - a1 : ${this.a1}")
        }
        // 객체를 생성하지 않아서 사용하지 못함.
    }

    constructor(a1: Int) {
        this.a1 = a1
    }

    // 일반 멤버 메소드
    fun testMethod1() {
        println("a1 : $a1")
        // 일반 멤버 메소드에서는 정적 멤버를 사용할 수 있음.
        // 정적 멤버들은 프로그램이 시작할 때 이미 메모리에 올라가져 있음.
        // 그 후에 개발자가 만든 코드가 동작하기 때문에 객체 생성 시점보다 정적 멤버들이
        // 메모리에 올라가는 시점이 더 앞서 있음. 이 때문에 사용이 가능함.
        // 같은 클래스에 있는 정적 멤버 접근시에는 클래스의 이름을 생략할 수 있음.
        println("a2 : $a2")
        testMethod2()
    }
}

class TestClass2 {
    companion object {
        var kotlinValue1 = 1000

        fun kotlinMethod() {
            println("kotlinMethod1")
        }
    }
}