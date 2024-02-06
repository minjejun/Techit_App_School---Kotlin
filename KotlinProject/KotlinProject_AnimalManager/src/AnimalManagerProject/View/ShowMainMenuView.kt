package AnimalManagerProject.View

// 0번
class ShowMainMenuView: BaseView() {
    override fun showView() {
        println("[ 메인 메뉴 ]")
        println()

        println("1. 동물 정보 입력")
        println("2. 동물 이름 검색")
        println("3. 동물 타입 검색")
        println("4. 모든 동물의 정보 출력.")
        println("5. 동물 삭제")
        println("6. 프로그램 종료")
    }
}