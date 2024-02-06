package StudentManageProject.Activity

import kotlin.system.exitProcess

class TerminateActivity : BaseActivity() {
    override fun initActivity() {

    }

    override fun processActivity() {

    }

    override fun showActivity() {
        finishProgram()
    }

    override fun finishActivity() {

    }

    // 프로그램을 종료하는 기능
    fun finishProgram() {
        println("프로그램이 종료되었습니다.")
        exitProcess(0)
    }

    // 프로그램 종료 안내 문구를 출력하는 메서드
    fun showFinishMessage() {

    }
}