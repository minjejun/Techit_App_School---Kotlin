package AnimalManagerProject.Activity

import AnimalManagerProject.Controller.MainController
import AnimalManagerProject.Dao.AnimalInfoDao
import AnimalManagerProject.Model.AnimalModel
import AnimalManagerProject.Util.AnimalType
import AnimalManagerProject.Util.ProgramState
import AnimalManagerProject.View.ShowAnimalInfoAllView

class ShowAnimalInfoAllActivity(var mainController: MainController): BaseActivity() {

    // View 객체 생성
    lateinit var showAnimalInfoAllView: ShowAnimalInfoAllView

    // 동물 정보 담을 리스트
    var animalList: ArrayList<AnimalModel> ?= null

    override fun initActivity() {
        showAnimalInfoAllView = ShowAnimalInfoAllView()

        animalList = AnimalInfoDao.getAnimalInfoList()
    }

    override fun beforeProcessActivity() {

    }

    override fun showActivity() {
        showAnimalInfoAllView.showView()
    }

    override fun afterProcessActivity() {
        if(animalList == null) {
            println("저장된 동물 정보가 없습니다.")
        } else {
            printAnimalCount()

            printAnimalInfoAll()
        }
    }

    override fun finishActivity() {
        // 수행이 끝나면 메인 메뉴로 돌아가게 함.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MAIN_MENU)
    }

    fun printAnimalCount() {
        var tigerCount = 0
        var lionCount = 0
        var elephantCount = 0

        println("전체 동물의 수 : ${animalList?.size}마리")

        animalList?.forEach {
            when(it.animalType) {
                AnimalType.ANIMAL_TYPE_TIGER.num -> tigerCount++
                AnimalType.ANIMAL_TYPE_LION.num -> lionCount++
                AnimalType.ANIMAL_TYPE_ELEPHANT.num -> elephantCount++
            }
        }

        println("호랑이 : ${tigerCount}마리")
        println("사자 : ${lionCount}마리")
        println("코끼리 : ${elephantCount}마리")
    }

    fun printAnimalInfoAll() {
        animalList?.forEach {
            it.printAnimalInfo()
        }
    }
}