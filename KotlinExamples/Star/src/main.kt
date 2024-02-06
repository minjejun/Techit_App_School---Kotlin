fun main() {
    // 1번 문제
    for(i in 1..5) {
        repeat(i) {
            print("*")
        }
        println("")
    }

    println("-------------------------")

    // 2번 문제
    for(i in 5 downTo 1) {
        for ( j in 0..i - 1 ) {
            print("*")
        }
        println()
    }

    for(i in 5 downTo 1) {
        repeat(i) {
            print("*")
        }
        println()
    }

    println("-------------------------")

    // 3번 문제
    for(i in 5 downTo 1) {
        for(j in 1..5) {
            if (j < i) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }

    println("-------------------------")

    // 4번 문제
    for(i in 5 downTo 1) {
        for (j in 5 downTo 1) {
            if (j <= i) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }

    println("-------------------------")

    // 5번 문제

    var height = 5

    for (i in 1 .. height) {
        for (j in height downTo i) {
            print(" ")
        }

        for (k in 1 until i * 2) {
            print("*")
        }
        println()
    }

    println("-------------------------")
    // 6번 문제

    for(i in height downTo 1) { // 5 ~ 1
        for ( j in height downTo  i) { //  5 ~ 1
            print(" ")
        }

        for ( k in 1 until i * 2) { // 1 ~ (i * 2) - 1
            print("*")
        }
        println()
    }

}