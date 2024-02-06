package AnimalManagerProject.Activity

import AnimalManagerProject.Controller.MainController
import AnimalManagerProject.Util.MenuNum
import AnimalManagerProject.Util.ProgramState
import AnimalManagerProject.View.ShowMainMenuView
import java.util.Scanner

// 0번
class ShowMainMenuActivity(private var mainController: MainController) : BaseActivity() {
    // 메뉴 번호 담을 프로퍼티
    private var menuNum = 0

    // 입력받기 위한 스캐너
    private lateinit var scanner: Scanner

    val showMainMenuView = ShowMainMenuView()

    override fun initActivity() {
        scanner = Scanner(System.`in`)
    }

    override fun beforeProcessActivity() {

    }

    override fun showActivity() {
        showMainMenuView.showView()
    }

    override fun afterProcessActivity() {
        // 메뉴 번호를 입력받는다.
        inputMenuNumber()
    }

    override fun finishActivity() {
        when (menuNum) {
            // 동물 정보 입력
            MenuNum.PROGRAM_STATE_INPUT_ANIMAL_INFO.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_INPUT_ANIMAL_INFO)
            // 동물 정보 이름으로 검색
            MenuNum.PROGRAM_STATE_SEARCH_ANIMAL_NAME.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_SEARCH_ANIMAL_NAME)
            // 동물 정보 종류로 검색
            MenuNum.PROGRAM_STATE_SEARCH_ANIMAL_TYPE.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_SEARCH_ANIMAL_TYPE)
            // 모든 동물 정보 출력
            MenuNum.PROGRAM_STATE_SHOW_ANIMAL_INFO_ALL.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_ANIMAL_INFO_ALL)
            // 동물 삭제
            MenuNum.PROGRAM_STATE_DELETE_ANIMAL_INFO.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_DELETE_ANIMAL_INFO)
            // 프로그램 종료
            MenuNum.PROGRAM_STATE_FINISH.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_FINISH)
        }
    }

    // 메뉴의 번호를 입력받는 메소드
    private fun inputMenuNumber() {
        do {
            println()
            print("번호를 입력해주세요 : ")
            menuNum = scanner.nextInt()

            if (menuNum !in 1..6) { // 1 ~ 6에 포함되지않는다면
                println("메뉴 번호는 1부터 6까지의 숫자 중 하나를 입력해주세요 ")
            }
        } while (menuNum !in 1..6)
    }
}