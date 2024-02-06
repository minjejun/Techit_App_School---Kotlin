package StudentManageProject.Activity

import StudentManageProject.Controller.MainController
import StudentManageProject.Dao.UserInfoDAO
import StudentManageProject.Model.StudentModel
import StudentManageProject.util.ProgramState
import java.util.Scanner

class InputStudentInfoActivity(var mainController: MainController) : BaseActivity() {

    // 입력된 학생의 수 담을 변수 정의.
    // 입력된 학생의 정보를 담을 객체
    var studentList: ArrayList<StudentModel> ?= null

    // 학생의 정보를 입력받을 객체
    lateinit var studentModel: StudentModel

    // 정보를 입력받기 위한 스캐너
    lateinit var scanner: Scanner


    override fun initActivity() {
        scanner = Scanner(System.`in`)
        // 학생 정보를 가져옴
        studentList = UserInfoDAO.getStudentInfoList()
    }

    override fun processActivity() {
        // 현재 학생 수 출력
        showStudentCnt()
        // 현재 학생 정보 입력받음
        inputStudentInfo()
        // 학생 정보를 파일에 씀
        saveStudentInfo()
    }

    override fun showActivity() {
        println()
        println("[ 학생 정보 입력 ]")
        processActivity()
    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 현재 입력된 학생의 수를 보여주는 기능
    fun showStudentCnt() {
        if(studentList != null) { // 학생 수가 0이 아니라면
            println("현재 입력된 학생 수 : ${studentList?.size}명")
        } else { // 학생 수가 0이라면
            println("현재 입력된 학생 수 : 0명")
        }
    }

    // 학생의 정보를 입력받는 기능.
    fun inputStudentInfo() {
        var name = ""
        // 정상 범위를 0부터.
        var age = -1
        var kor = -1
        var eng = -1
        var math = -1

        print("학생 이름 : ")
        name = scanner.next()

        do {
            try {
                print("학생 나이 : ")
                age = scanner.nextInt()

                if (age !in 0..200) {
                    println("나이는 0에서 200까지의 숫자를 넣어야합니다.")
                }
            } catch(e: Exception) {
                println("나이는 숫자로만 입력할 수 있습니다.")
            }
        } while (age !in 0..200)

        do {
            try {
                print("국어 점수 : ")
                kor = scanner.nextInt()

                if (kor !in 0..100) {
                    println("국어 점수는 0에서 100까지의 숫자를 넣어야합니다.")
                }
            } catch(e: Exception) {
                println("점수는 숫자로만 입력할 수 있습니다.")
            }
        } while (kor !in 0..100)

        do {
            try {
                print("영어 점수 : ")
                eng = scanner.nextInt()

                if (eng !in 0..100) {
                    println("영어 점수는 0에서 100까지의 숫자를 넣어야합니다.")
                }
            } catch(e: Exception) {
                println("점수는 숫자로만 입력할 수 있습니다.")
            }
        } while (eng !in 0..100)

        do {
            try {
                print("수학 점수 : ")
                math= scanner.nextInt()

                if (math !in 0..100) {
                    println("수학 점수는 0에서 100까지의 숫자를 넣어야합니다.")
                }
            } catch(e: Exception) {
                println("점수는 숫자로만 입력할 수 있습니다.")
            }
        } while (math !in 0..100)

        studentModel = StudentModel(name, age, kor, eng, math)
    }

    // 입력받은 학생의 정보를 저장하는 기능
    fun saveStudentInfo() {
        // ArrayList가 null -> 객체 생성
        if(studentList == null) {
            studentList = ArrayList<StudentModel>()
        }

        // 객체를 ArrayList에 담아줌.
        studentList?.add(studentModel)
        // 파일에 저장
        UserInfoDAO.saveStudentInfoList(studentList!!)
    }
}