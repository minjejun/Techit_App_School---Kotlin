package StudentManageProject.Activity

import StudentManageProject.Controller.MainController
import StudentManageProject.Dao.UserInfoDAO
import StudentManageProject.Model.StudentModel
import StudentManageProject.util.ProgramState

class ShowPointTotalAvgActivity(var mainController: MainController) : BaseActivity() {
    // 학생들의 정보를 담을 ArrayList
    var studentList: ArrayList<StudentModel> ?= null
    // 총점들을 담을 프로퍼티
    var korTotal = 0
    var engTotal = 0
    var mathTotal = 0
    // 평균들을 담을 프로퍼티
    var korAvg = 0
    var engAvg = 0
    var mathAvg = 0

    // 초기화 메소드
    override fun initActivity() {
        // DAO에서 저장된 학생 목록 불러옴
        studentList = UserInfoDAO.getStudentInfoList()
    }

    override fun processActivity() {
        if(studentList != null) {
            // 각 과목별 총점을 구함
            getPointTotal()

            getPointAvg()
        }
    }

    // 화면에 보여지는 메소드
    override fun showActivity() {
        println()
        println("[ 점수 통계 ]")

        if(studentList == null) {
            println("저장된 학생 정보가 없습니다.")
        } else {
            // 총점, 평균 출력.
            println()
            println("국어 총점 : $korTotal")
            println("영어 총점 : $engTotal")
            println("수학 총점 : $mathTotal")
            println()
            println("국어 평균 : $korAvg")
            println("영어 평균 : $engAvg")
            println("수학 평균 : $mathAvg")
        }
    }

    // 진행이 끝났을 때 실행되는 메소드
    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 과목별 총점 구하는 메소드
    fun getPointTotal() {
        studentList?.forEach{
            korTotal += it.kor
            engTotal += it.eng
            mathTotal += it.math
        }
    }

    // 과목별 평균을 구하는 메서드
    fun getPointAvg() {
        korAvg = korTotal / studentList!!.size
        engAvg = engTotal / studentList!!.size
        mathAvg = mathTotal / studentList!!.size
    }

    // 학생정보가 없을 경우 안내 문구를 출력하는 메서드
    fun printNotExistStudentInfo(){
        println("학생 정보가 존재하지 않습니다.")
    }
}