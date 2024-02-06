import jdk.incubator.vector.VectorOperators.Test
import kotlin.reflect.KClass

// 프로그램 실행 중 객체에 대한 다양한 정보를 파악할 수 있음.

fun main() {
    // 클래스 타입
    // KClass<클래스 타입> - 지정된 클래스의 타입을 파악(코틀린 클래스)
    val v1: KClass<String> = String::class
    println("String의 코틀린에서의 타입 : $v1")

    // Class<클래스 타입> - 지정된 클래스 타입을 파악함(자바 클래스)
    val v2: Class<String> = String::class.java
    println("String의 자바에서의 타입 : $v2")

    // 변수를 통해 접근할 수 있는 객체의 클래스 타입을 파악함.
    val str1 = "안녕하세요"
    val a3: KClass<out String> = str1::class
    println("str1을 통해 접근할 수 있는 객체의 클라스 타입(코틀린) : $a3")

    val a4: Class<out String> = str1::class.java
    println("str1을 통해 접근할 수 있는 객체의 클라스 타입(자바) : $a4")

    val test1 = TestClass()

    val a7 = test1::class
    val a8 = test1::class.java
    println("test1의 클래스 타입(코틀린) : $a7")
    println("test1의 클래스 타입(자바) : $a8")

    // 클래스 정보 분석
    println("추상 클래스 인가 ? : ${test1::class.isAbstract}")
    println("Companion 클래스 인가? : ${test1::class.isCompanion}")
    println("Data 클래스 인가? : ${test1::class.isData}")
    println("Final 클래스 인가? : ${test1::class.isFinal}")
    println("Open 클래스 인가? : ${test1::class.isOpen}")
    println("중첩 클래스 인가? : ${test1::class.isInner}")
    println("Sealed 클래스 인가? : ${test1::class.isSealed}")
}

class TestClass