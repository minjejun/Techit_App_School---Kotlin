fun main() {
    val sum = getSum()
    printSum(sum)
}

fun getSum(): Int {

    var sum = 0

    // step을 이용해 2 차이가 나는 숫자들만 더하는 것.
    for (i in 1..100 step 2) {
        sum += i
    }

    // i를 2로 나눈 나머지가 1인 것들만 더하는 것.
    for (i in 1..100) {
        if( i % 2 == 1 ) {
            sum += i
        }
    }
    return sum
}

fun printSum(sum: Int) {
    println("1부터 100까지의 홀수들의 총합은 ${sum}입니다.")
}