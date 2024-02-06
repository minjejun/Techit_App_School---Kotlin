package StudentManageProject.Activity

import StudentManageProject.Controller.MainController
import StudentManageProject.util.MenuNumber
import StudentManageProject.util.ProgramState
import java.util.Scanner

class ShowMenuActivity(var mainController: MainController): BaseActivity() {
    // 메뉴 번호 담을 프로퍼티
    var menuNum = 0

    // 입력받기 위한 스캐너
    lateinit var scanner : Scanner

    override fun initActivity() {
        scanner = Scanner(System.`in`)
    }

    override fun processActivity() {

    }

    override fun showActivity() {
        println()
        println("[메인 메뉴]")
        println("1. 학생 정보 입력")
        println("2. 학생 정보 검색")
        println("3. 학생 정보 전체 출력")
        println("4. 각 과목 별 총점 및 평균 확인")
        println("5. 종료")

        // 메뉴 번호를 입력받음.
        inputMenuNumber()
    }

    override fun finishActivity() {
        // 사용자가 입력한 메뉴 번호에 따라 프로그램의 상태를 변경함.
        when (menuNum) {
            // 학생 정보 입력
            MenuNumber.MAIN_MENU_STUDENT_INFO.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_INPUT_STUDENT_INFO)
            // 학생 정보 검색
            MenuNumber.MAIN_MENU_SEARCH_STUDENT_INFO.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_SEARCH_STUDENT_INFO)
            // 모든 학생의 정보 출력
            MenuNumber.MAIN_MENU_SHOW_STUDENT_INFO_ALL.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_STUDENT_INFO_ALL)
            // 과목별 총점과 평균 출력
            MenuNumber.MAIN_MENU_SHOW_POINT_TOTAL_AVG.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_POINT_TOTAL_AVG)
            // 종료
            MenuNumber.MAIN_MENU_TERMINATE.num ->
                mainController.setProgramState(ProgramState.PROGRAM_STATE_TERMINATE)
        }
    }

    // 메뉴의 번호를 입력받는 메소드
    fun inputMenuNumber() {
        do {
            print("번호를 입력해주세요 : ")
            menuNum = scanner.nextInt()

            if (menuNum !in 1..5) { // 1 ~ 5에 포함되지않는다면
                println("메뉴 번호는 1부터 5까지의 숫자 중 하나를 입력해주세요 ")
            }
        } while (menuNum !in 1..5)
    }
}