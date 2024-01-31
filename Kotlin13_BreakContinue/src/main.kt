// break : 가장 가까운 반복문의 수행을 중단시킴.
// continue : 다음 반복으로 넘어감.

fun main() {
    for(i1 in 1..10) {
        if(i1 > 5) {
            break
        } // break문은 반복문에만 중단을 시키기 때문에 조건이 있다면 그 반복문을 중단시킴.
        println("i1 : $i1")
    }

    for(i2 in 1..10) {
        if(i2 % 2 == 0) {
            continue
        } // 남은 코드가 있더라도 다음 반복문으로 넘어감.
        println("i2 : $i2")
    }
}