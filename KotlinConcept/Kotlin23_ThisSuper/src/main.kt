

fun main() {
    val t1 = TestClass1()
    t1.testMethod1(200)

    val t2 = TestClass2()
    println("t2 : $t2")

    t1.testMethod2()

    val sub1 = SubClass1()
    sub1.subMethod1(300)

    sub1.subMethod2()
}

class TestClass1 {
    // 프로퍼티
    var value1 = 100

    // 매개변수
    fun testMethod1(value1: Int) {
        println("value1 : $value1")

        println("this.value1 : ${this.value1}")
    }
    // 프로퍼티와 매개변수의 이름이 같을 때 둘 중 무엇으로 쓰이는가를 봄.
    // 매개변수를 사용하게 됨.
    // 프로퍼티의 이름과 매개변수의 이름이 같을 경우
    // 매개변수가 아닌 프로퍼티를 사용하겠다면 this를 통해 객체에 접근해 사용하면 됨.

    // Kotlin은 (외부)메소드 안에 (내부)메소드를 만들 수 있음.
    // (외부)메소드내의 (내부)메소드는 (외부)메소드에서만 사용 가능함.
    fun testMethod2() {
        fun innerMethod1() {
            println("innerMethod1 호출")
        }

        innerMethod1()

        // 클래스의 멤버 메소드와 동일한 메소드를 내부에 만들어줌.
        fun testMethod3() {
            println("testMethod2 메소드의 내부 메소드 testMethod3 호출")
        }

        // 메소드 내부에 만든 메소드가 호출.
        testMethod3()
        // 만약 멤버 메소드를 호출하고 싶다면 this를 이용하면 호출할 수 있음.
        this.testMethod3()
    }

    fun testMethod3() {
        println("TestClass1의 testMethod3 호출")
    }
}

class TestClass2 {

    // this() : 다른 생성자를 호출.
    // 만약 클래스에 주 생성자가 정의되어 있다면 무조건 주 생성자를 반드시 호출하도록 해야 함.
    constructor() : this(100){
        println("매개변수가 없는 생성자 호출")
    }

    constructor(a1: Int) {
        println("매개변수가 있는 생성자 호출")
        println("a1 : $a1")
    }
}

open class SuperClass1 {
    // 자식 클래스에서 동일한 이름의 프로퍼티를 만드는 것을 허용하겠다면
    // open을 붙혀줌.
    open var superValue1 = 100

    // 생성자
    constructor(){
        println("SuperClass1의 생성자")
    }

    // 생성자
    constructor(a1: Int){
        println("매개변수를 가지고 있는 SuperClass1의 생성자")
        println("a1 : $a1")
    }

    // 자식 클래스에서 메소드를 재구현을 허용하겠다면 open을 붙혀줌.
    open fun superMethod2() {
       println("SuperClass1의 superMethod2")
    }

}

class SubClass1 : SuperClass1 {
    // 부모 클래스에 정의된 프로퍼티와 동일한 이름의 프로퍼티를 만들고자 한다면,
    // 부모가 가지고 있는 프로퍼티 중 open 프로퍼티만 가능하며,
    // 앞에 override 키워드를 붙혀줘야 함.
    override var superValue1 = 200

    constructor() : super(1000) {
        println("SubClass1의 생성자 호출.")
    }

    fun subMethod1(superValue1: Int) {
        // 매개변수 사용
        println("superValue1 : $superValue1")
        // 매개변수의 이름과 프로퍼티 이름이 같기 때문에 프로퍼티에 접근하려면 this 사용.
        // 만약 동일 명의 매개변수가 없다면 this는 생략 가능함.
        println("this.superValue1 : ${this.superValue1}")
        // 매개변수 이름이나 멤버 프로퍼티 이름이 부모 프로퍼티 이름과 동일할 경우
        // super를 통해 부모의 프로퍼티에 접근.
        println("super.superValue1 : ${super.superValue1}")
    }

    // 부모 클래스의 메서드를 overriding 한다.
    override fun superMethod2() {
        println("SubClass1의 superMethod2")
    }

    fun subMethod2() {

        superMethod2()
        // 부모의 메소드를 자식에서 재구현한 경우 부모 메소드를 호출하고자 한다면
        // super를 사용.
        super.superMethod2()
    }
}