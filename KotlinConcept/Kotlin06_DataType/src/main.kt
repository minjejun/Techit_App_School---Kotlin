// 기억장소은 리터럴 작성 문법에 맞춰서 값을 작성하면 작성한 값을 저장하기 위해
// 기억장소가 만들어짐.
// 이 때, 위치는 VM이 알아서 정해주고 용도와 크기는 작성해준 값의 문법을 보고 결정해줌.
// 이러한 값들은 프로그램 실행 중 변경될 수 없음.
// 만약 프로그램 실행 중 어떠한 의미의 값이 변한다면 기억장소를 개발자에 의해 만들고
// 기억장소에 접근하여 값을 저장하고 가져다 사용할 수 있는 변수를 사용해야 함.
// 변수라는 것을 생성할 때 위치는 VM이 알아서 정해주고 용도와 크기는 개발자가 정해줘야 하는데
// 이를 자료형이라 함.

fun main() {
    // 정수 자료형
    println("Byte 용량 : " + Byte.SIZE_BYTES) // 1
    println("Byte 최소 값 : " + Byte.MIN_VALUE) // -128
    println("Byte 최대 값 : " + Byte.MAX_VALUE) // 127
    println()

    println("Short 용량 : " + Short.SIZE_BYTES) // 2
    println("Short 최소 값 : " + Short.MIN_VALUE) // -32768
    println("Short 최대 값 : " + Short.MAX_VALUE) // 32767
    println()

    // 정수 입력 -> 4byte 기억공간 생김 -> Int를 정수의 기본 자료형이라고 부름.
    println("Int 용량 : " + Int.SIZE_BYTES) // 4
    println("Int 최소 값 : " + Int.MIN_VALUE) // -2147483648
    println("Int 최대 값 : " + Int.MAX_VALUE) // 2147483647
    println()

    println("Long 용량 : " + Long.SIZE_BYTES) // 8
    println("Long 최소 값 : " + Long.MIN_VALUE) // -9223372036854775808
    println("Long 최대 값 : " + Long.MAX_VALUE) // 9223372036854775807
    println()

    // 부호가 없는 정수형
    // 저장공간에 저장할 수 있는 값의 가지수를 절반 짤라서 양수와 음수로 나눠서 사용하는데
    // 부호가 없는 자료형을 쓰면 0부터의 범위가 된다.
    // 양수쪽으로 더 큰 범위의 숫자를 저장할 수 있다.
    println("UByte 용량 : " + UByte.SIZE_BYTES)
    println("UByte 최소 값 : " + UByte.MIN_VALUE)
    println("UByte 최대 값 : " + UByte.MAX_VALUE)
    println()

    println("UShort 용량 : " + UShort.SIZE_BYTES)
    println("UShort 최소 값 : " + UShort.MIN_VALUE)
    println("UShort 최대 값 : " + UShort.MAX_VALUE)
    println()

    println("UInt 용량 : " + UInt.SIZE_BYTES)
    println("UInt 최소 값 : " + UInt.MIN_VALUE)
    println("UInt 최대 값 : " + UInt.MAX_VALUE)
    println()

    println("ULong 용량 : " + ULong.SIZE_BYTES)
    println("ULong 최소 값 : " + ULong.MIN_VALUE)
    println("ULong 최대 값 : " + ULong.MAX_VALUE)
    println()

    // 실수
    println("Float 용량 : " + Float.SIZE_BYTES)
    println("Float 최소 값 : " + Float.MIN_VALUE)
    println("Float 최댓 값 : " + Float.MAX_VALUE)
    println()

    // 실수 리터럴을 작성하면 8 바이트 기억공간이 만들어져서 저장된다.
    // 이에, Double을 실수의 기본 자료형이라고 부른다.
    println("Double 용량 : " + Double.SIZE_BYTES)
    println("Double 최소 값 : " + Double.MIN_VALUE)
    println("Double 최댓 값 : " + Double.MAX_VALUE)
    println()

    // 논리
    // 논리형은 1바이트 사용 (참, 거짓)

    // 문자(2 byte)
    println("Char 용량 : " + Char.SIZE_BYTES)
    println("Char 최소 값 : " + Char.MIN_VALUE)
    println("Char 최댓 값 : " + Char.MAX_VALUE)
    println()

    // 문자열 : 정확히는 자료형이 아님.
    // 문자열 타입이라고 생각하면 됨.
    // String

}