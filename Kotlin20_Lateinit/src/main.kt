

fun main() {
    val t1 = TestClass1()
    println("t1:.a1 : ${t1.a1}")
    println("t1:.a2 : ${t1.a2}")
    println("t1:.a3 : ${t1.a3}")
    println("t1:.a4 : ${t1.a4}")

    t1.testMethod1()
}

class TestClass1 {
    // 프로퍼티 정의할 때 저장할 값 무조건 지정해야 함.
    // 안그러면 오류.
    var a1: Int = 100
    var a2 = 200
    // 예외 상황
    // 프로퍼티 정의 시 저장할 값을 지정하지 않았지만
    // init 블럭이나 생성자에서 값을 저장하는 코드를 작성해두면 오류가 발생하지 않음.
    // 이는 객체를 생성하면 무조건 init 블럭과 생성자으 코드가 동작하기 때문에
    // 프로퍼티에 값이 저장되는 것을 보장받을 수 있기 때문임.
    var a3: Int
    var a4: Int

    // 지연 초기화
    lateinit var a5: String

    // val property도 init이나 생성자에서 초기화해주는 코드를 넣어주면
    // property 정의시 저장할 값을 지정하지 않아도 됨.
    val a6: Int
    val a7: Int
    // lazy를 사용하면 property에 저장될 값을 어떠한 처리를 통해서 구한 것으로 저장할 수 있음.
    val a8: Int by lazy {
        val temp = 1 + 2 + 3 + 4 + 5
        // 마지막에 작성한 값이나 변수의 값이 property에 저장됨.
        temp
    }

    init {
        a4 = 400
        a6 = 600
    }

    constructor() {
        a3 = 100
        a7 = 700
    }

    fun testMethod1() {
        // lateinit property
        if(::a5.isInitialized) {
            println("step1 : $a5")
        }
        // lateinit property 에 값 저장.
        a5 = "안녕하세요"
        if(::a5.isInitialized) {
            println("step2 : $a5")
        }
    }
}