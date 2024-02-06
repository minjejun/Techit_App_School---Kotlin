// 배열 : 다수의 기억장소를 하나로 묶어서 관리하는 개념
// 배열은 다수의 기억장소를 하나로 묶어서 관리하고 배열의 주소값을 가지고 있는 변수를 통해
// 배열에 접근하여 배열이 관리하는 기억장소를 사용할 수 있다.
fun main() {
    // 배열 생성
    // 배열이 관리하는 값들을 지정.
    // 지정한 값 만큼의 기억 장소가 생성되고 그 기억장소들을 관리하는 배열이 생성됨.
    // 배열이 관리하는 기억장소의 개수는 변경될 수 없음.
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println("array1: $array1")

    // 배열이 관리하는 값을 모아 문자열로 만들어 반환받을 수 있음.
    // 이를 통해 객체가 관리하는 값들을 출력해볼 수 있음.
    println("array1: ${array1.contentToString()}")

    // 배열은 다양한 타입의 값을 담을 수 있음.
    val array2 = arrayOf(100, 11.11, "answkd", true)
    println("array2: $array2")
    println("array2: ${array2.contentToString()}")

    // 특정 타입의 값만 담는 배열을 생성함.
    // 000ArrayOf
    val array3 = intArrayOf(10, 20, 30, 40, 50) // 정수값만 담을 수 있는 배열
    val array4 = doubleArrayOf(11.11, 22.22, 33.33, 44.44, 55.55) // 실수값만 담을 수 있는 배열
    val array5 = arrayOf<String>("a", "b", "c")

    println("array3: ${array3.contentToString()}")
    println("array4: ${array4.contentToString()}")
    println("array5: ${array5.contentToString()}")

    // 람다식을 통한 배열 생성
    // 람다식 내부의 코드를 수행하여 얻어진 결과를 배열에 담아줌.
    // Array(기억장소의 개수)
    // 지정된 숫자 만큼 기억장소가 만들어지고 람다식의 제일 마지막에 작성한 값을 담아줌.

    // 주어진 람다식을 지정한 갯수만큼 반복함. 첫 번째 기억장소에 담을 값을 결정하기 위해
    // 람다식을 수행하고 람다식의 제일 마지막에 작성한 값이 첫 번째 기억장소에 담기게 됨.
    // 이런식으로 모든 기억 장소의 수 만큼 람다식이 수행되고 람다식이 전달하는 값은 각각의 기억장소에 담기게 됨.
    var array6 = Array(5){
        1

    }
    println("array6: ${array6.contentToString()}")

    // 람다식에 있는 it에는 0부터 1씩 증가되는 값이 들어옴.
    val array7 = Array(5) {
        it
    }
    println("array7: ${array7.contentToString()}")

    // 3부터 3의 배수 10개를 가지고 있는 배열 생성
    val array8 = Array(10) {
        (it + 1) * 3
    }
    println("array8 : ${array8.contentToString()}")

    // 다차원 배열 생성
    // 배열 안에 배열들이 들어가 있는 것.
    val array9 = arrayOf(
        arrayOf(10, 20, 30),
        arrayOf(40, 50, 60),
        arrayOf(70, 80, 90)
    )
    println("array9: ${array9.contentToString()}")
    println("array9: ${array9.contentDeepToString()}")

    println("--------------------------------------------------")

    // 배열이 관리하는 기억장소는 0부터 1씩 증가하는 순서값을 사용.
    println("array1[0]: ${array1[0]}")
    println("array1[1]: ${array1[1]}")

    // get 메소드를 이용할 수 있음. [ ] 연산자를 사용 -> get 메소드를 호출하기 때문에
    // [ ] 를 사용한 것과 동일.
    println("array1.get(0) : ${array1.get(0)}")
    println("array1.get(1) : ${array1.get(1)}")

    // 다차원 배열 접근
    println(array9[2][1])

    println("--------------------------------------------------")

    println("array1 : ${array1.contentToString()}")

    // 0번째 기억 장소 새로운 값을 저장.
    array1[0] = 100
    println("0 번째에 100 설정 : ${array1.contentToString()}")

    // [ ] = 값의 문법을 사용하면 set을 호출.
    array1.set(1, 200)
    println("1 번째에 200 설정 : ${array1.contentToString()}")

    // 배열에 추가
    // 원본 배열에 1000이 추가된 새로운 배열을 생성하여 반환.
    // 배열은 절대 관리하는 기억장소의 개수를 변경시킬 수 없음.
    val array10 = array1.plus(1000)
    println("1000추가(원본) : ${array1.contentToString()}")
    println("1000추가(새롭게 생성된 배열) : ${array10.contentToString()}")

    // 일부분을 가져옴
    // 지정된 순서값 범위에 해당하는 값들을 가지고 새로운 배열을 생성.
    // 순서값 1 ~ 3 까지.
    val array11 = array1.sliceArray(1..3)
    println("array11 : ${array11.contentToString()}")

    // for문과 같이 사용
    for(a1 in array1) {
        println(a1)
    }

    println("--------------------------------------------------")
    // 배열이 제공하는 메소드들
    println("첫 번째 값 : ${array1.first()}")
    println("마지막 값 : ${array1.last()}")
    println("30의 위치(존재하는 값) : ${array1.indexOf(30)}")
    println("10000의 위치(없는 값) : ${array1.indexOf(10000)}")
    println("평균 : ${array1.average()}")
    println("총합 : ${array1.sum()}")
    println("관리하는 기억장소의 개수 : ${array1.count()}")
    println("관리하는 기억장소의 개수 : ${array1.size}")
    println("30을 포함하는가 : ${array1.contains(30)}")
    println("10000을 포함하는가 : ${array1.contains(10000)}")
    println("30을 포함하는가 : ${30 in array1}")
    println("10000을 포함하는가 : ${10000 in array1}")
    println("최대 : ${array1.max()}")
    println("최소 : ${array1.min()}")

    println("--------------------------------------------------")

    val array12 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // 배열이 관리하는 값의 순서를 랜덤하게 섞어줌.
    array12.shuffle()
    println(array12.contentToString())

    // 정렬(오름차순)
    // 정렬된 배열을 새롭게 생성해서 반환함.
    val array13 = array12.sortedArray()
    println(array13.contentToString())

    // 정렬(오름차순)
    // 정렬된 배열을 새롭게 생성해서 반환함.
    val array14 = array12.sortedArrayDescending()
    println(array14.contentToString())
}