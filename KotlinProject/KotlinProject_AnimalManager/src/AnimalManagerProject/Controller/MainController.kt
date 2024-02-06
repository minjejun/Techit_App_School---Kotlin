package AnimalManagerProject.Controller

import AnimalManagerProject.Activity.*
import AnimalManagerProject.Util.ProgramState

class MainController {

    private var programStateValue = ProgramState.PROGRAM_STATE_SHOW_MAIN_MENU

    lateinit var activity: BaseActivity

    fun start() {
        while (true) {
            // 상태에 따른 객체를 생성.
            activity = getStateClass()

            // 초기화 메소드 호출
            activity.initActivity()

            // 처리 메소드 호출
            activity.beforeProcessActivity()

            // 화면을 출력하는 메소드를 호출.
            activity.showActivity()

            // 초기화 메소드 호출
            activity.afterProcessActivity()

            // 현재 상태 종료하는 메소드 호출.
            activity.finishActivity()
        }
    }

    fun getStateClass() = when(programStateValue) {
        ProgramState.PROGRAM_STATE_SHOW_MAIN_MENU -> ShowMainMenuActivity(this)
        ProgramState.PROGRAM_STATE_INPUT_ANIMAL_INFO -> InputAnimalInfoActivity(this)
        ProgramState.PROGRAM_STATE_SEARCH_ANIMAL_NAME -> SearchAnimalNameActivity(this)
        ProgramState.PROGRAM_STATE_SEARCH_ANIMAL_TYPE -> SearchAnimalTypeActivity(this)
        ProgramState.PROGRAM_STATE_SHOW_ANIMAL_INFO_ALL -> ShowAnimalInfoAllActivity(this)
        ProgramState.PROGRAM_STATE_DELETE_ANIMAL_INFO -> DeleteAnimalInfoActivity(this)
        ProgramState.PROGRAM_STATE_FINISH -> FinishProgramActivity()
    }

    // 상태 값을 변경하는 메소드
    fun setProgramState(programState: ProgramState) {
        this.programStateValue = programState
    }
}