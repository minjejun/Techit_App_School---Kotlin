package StudentManageProject.Activity

import StudentManageProject.Controller.MainController
import StudentManageProject.Dao.UserInfoDAO
import StudentManageProject.Model.StudentModel
import StudentManageProject.util.ProgramState

class ShowStudentInfoAllActivity(var mainController: MainController) : BaseActivity() {
    // 학생들의 정보를 담을 ArrayList
    private var studentList: ArrayList<StudentModel> ?= null

    override fun initActivity() {
        // 학생들의 정보 가져옴
        studentList = UserInfoDAO.getStudentInfoList()
    }

    override fun processActivity() {

    }

    override fun showActivity() {
        println()
        println("[ 학생 전체 정보 ]")
        // 학생 정보 없을 때
        if(studentList.isNullOrEmpty()) {
            printNotExistStudentInfo()
        } else {
            // 학생 정보 있을 때
            printStudentInfoAll()
        }
    }

    override fun finishActivity() {
        // 기능이 끝나면 다시 메인 메뉴로 돌아가게.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 모든 학생들의 정보를 출력하는 기능
    private fun printStudentInfoAll() {
        // 학생 객체 수만큼 반복.
        studentList?.forEach {
            it.printStudentInfo()
        }
    }

    // 학생정보가 없을 경우 안내 문구를 출력하는 메서드
    private fun printNotExistStudentInfo(){
        println("저장된 학생의 이름이 없습니다. ")
    }
}