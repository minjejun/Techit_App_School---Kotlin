package AnimalManagerProject.Activity

import kotlin.system.exitProcess

class FinishProgramActivity: BaseActivity() {
    override fun initActivity() {

    }

    override fun beforeProcessActivity() {

    }

    override fun showActivity() {
        finishProgram()
    }

    override fun afterProcessActivity() {

    }

    override fun finishActivity() {

    }

    // 프로그램을 종료하는 기능
    fun finishProgram() {
        println("프로그램이 종료되었습니다.")
        exitProcess(0)
    }
}