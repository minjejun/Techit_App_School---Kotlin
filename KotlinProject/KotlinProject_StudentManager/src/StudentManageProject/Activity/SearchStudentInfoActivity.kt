package StudentManageProject.Activity

import StudentManageProject.Controller.MainController
import StudentManageProject.Dao.UserInfoDAO
import StudentManageProject.Model.StudentModel
import StudentManageProject.util.ProgramState
import java.util.Scanner

class SearchStudentInfoActivity(var mainController: MainController) : BaseActivity() {

    // 학생들의 정보를 담을 ArrayList
    var studentList: ArrayList<StudentModel> ?= null
    // 검색할 학생의 이름
    lateinit var searchName: String
    // 입력을 위한 스캐너
    lateinit var scanner: Scanner

    override fun initActivity() {
        // 학생들의 정보 가져옴
        studentList = UserInfoDAO.getStudentInfoList()
        // 스캐너 생성
        scanner = Scanner(System.`in`)
    }

    override fun processActivity() {

    }

    override fun showActivity() {
        println()
        println("[ 학생 정보 검색 ]")
        // 저장된 학생 정보가 없다면
        if (studentList == null) {
            println("저장된 학생 정보가 없습니다. ")
        } else {
            // 검색어를 입력받음
            inputSearchName()
            // 검색 결과를 출력.
            printSearchResult()
        }
    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 검색할 학생 이름 입력받는 기능
    fun inputSearchName() {
        print("검색할 학생 이름 : ")
        searchName = scanner.next()
    }

    // 검색된 학생들의 정보를 출력하는 기능
    fun printSearchResult() {
        // 검색된 학생의 수
        var findCnt = 0
        // ArrayList가 관리하는 객체의 수만큼 반복.
        studentList?.forEach {
            // 현재 반복번째 학생의 이름이 검색어와 같다면 출력.
            if(it.name == searchName) {
                println()
                it.printStudentInfo()
                // 검색된 학생 수 증가
                findCnt++
            }
        }
        // 검색된 학생이 없다면
        if(findCnt == 0) {
            println("검색된 학생이 없습니다. ")
        }
    }

    // 학생 정보가 없을 경우 안내 문구를 출력하는 메소드
    fun printNotExistStudentInfo() {

    }
}