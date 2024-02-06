// 열거형
// 프로그램 개발 시 특정 그룹안의 구성 요소를 정의하는 값이 필요하고자 할 때 사용.
// 월을 나타내는 단어들, 혈액형, 방향, 성별 등등..

// 값 자체는 중요하지 않고 다르기만 하면 되는 경우 사용.

fun main() {
    printDirection(Direction2.SOUTH)

    printDirection2(Direction.NORTH)

    val r1 = printDirection(Direction2.SOUTH)

    val r2 = printDirection2(Direction.WEST)

    println("r1 : $r1")
    println("r2 : $r2")
}

// 열거형 정의
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}


// 정적 멤버 정의.
class Direction2 {
    companion object {
        val NORTH = 0
        val SOUTH = 1
        val WEST = 2
        val EAST = 3
    }
}

// 매개변수로 들어오는 값으로 분기하여 출력하는 함수를 만듬.
// 정적 멤버 사용.
fun printDirection(dir : Int) {
    // 정적 멤버로 정의된 변수들은 서로 간에 어떠한 관계가 있는 것이 아니기 때문에
    // 몇가지 경우를 빼더라도 문제 발생이 안됨.
    when(dir) {
        Direction2.WEST -> println("서쪽입니다.")
        Direction2.SOUTH -> println("남쪽입니다.")
        Direction2.NORTH -> println("북쪽입니다.")
        Direction2.EAST -> println("동쪽입니다.")
    }
}

// 열거형 사용
fun printDirection2(dir : Direction) {
    // 열거형에 정의된 값들은 하나의 열거형 안에 정의된 값이라는 관계를 갖기 때문에
    // 모든 경우를 다 적어주거나 빠진 것에 대한 처리를 할 수 있도록 relse 문을 넣어줘야 함.
    when(dir) {
        Direction.WEST -> println("서쪽입니다.")
        Direction.SOUTH -> println("남쪽입니다.")
        Direction.NORTH -> println("북쪽입니다.")
        Direction.EAST -> println("동쪽입니다.")
    } // enum 클래스에 있는 만큼 무조건 전부 정의해줘야 함.
}

// 매개변수로 들어오는 값에 따라 값을 반환하는 함수
// 정적 멤버 사용
fun getValue1(a1 : Int) = when(a1) {
    Direction2.WEST -> "서쪽"
    Direction2.EAST -> "동쪽"
    Direction2.SOUTH -> "남쪽"
    Direction2.NORTH-> "북쪽"
    // 각각이 독립적인 변수들이기 때문에 "더 있을수도 있지 않을까?"라는 이유 때문에
    // 반드시 else를 넣어줘야 함.
    else -> "모든 방향"
}

// 열거형 사용
// 하나의 열거형 안에 정의되어 있는 모든 경우에 대해 작성해주면
// else는 작성 안해줘도 됨. 만약 빠진게 있다면 else를 넣음.
fun getValue2(a1:Direction) = when(a1) {
    Direction.EAST -> "동쪽"
    Direction.WEST -> "서쪽"
    Direction.NORTH -> "북쪽"
    Direction.SOUTH -> "남쪽"
}

// 열거형을 정의할 때 값도 설정할 수 있음
// 열거형 클래스의 주 생성자는 열거형 하나를 만드는 양식을 의미.
// 변수의 개수는 무제한

// 하낭 대해 여러가지 값으로 표현할 수 있는 경우에 사용.
enum class Number(val num: Int, val str: String) {
    ONE(1, "일"),
    TWO(2, "이"),
    THREE(3, "삼")
}

fun printValue3(v1 : Number) {
    when(v1){
        Number.ONE -> println("1 입니다")
        Number.TWO -> println("2 입니다")
        Number.THREE -> println("3 입니다")
    }

    when(v1.num){
        1 -> println("1 입니다")
        2 -> println("2 입니다")
        3 -> println("3 입니다")
    }

    when(v1.str){
        "일" -> println("1입니다")
        "이" -> println("2입니다")
        "삼" -> println("3입니다")
    }
}