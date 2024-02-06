package AnimalManagerProject.Activity

abstract class BaseActivity {
    // 초기화 메소드
    abstract fun initActivity()

    // 출력 전 데이터 처리 메소드
    abstract fun beforeProcessActivity()

    // 보여주는 메소드
    abstract fun showActivity()

    // 출력 후 데이터 처리 메소드
    abstract fun afterProcessActivity()

    // 수행이 끝났을 때 호출되는 메소드.
    abstract fun finishActivity()
}