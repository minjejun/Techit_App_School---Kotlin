package AnimalManagerProject.Activity

import AnimalManagerProject.Controller.MainController
import AnimalManagerProject.Dao.AnimalInfoDao
import AnimalManagerProject.Model.AnimalModel
import AnimalManagerProject.Util.ProgramState
import AnimalManagerProject.View.SearchAnimalTypeView
import java.util.Scanner

class SearchAnimalTypeActivity(var mainController: MainController): BaseActivity() {

    lateinit var searchAnimalTypeView: SearchAnimalTypeView

    lateinit var scanner: Scanner

    var inputAnimalType = 0

    var animalList: ArrayList<AnimalModel> ?= null


    override fun initActivity() {
        searchAnimalTypeView = SearchAnimalTypeView()
        scanner = Scanner(System.`in`)

        // dao에서 정보 가져옴
        animalList = AnimalInfoDao.getAnimalInfoList()
    }

    override fun beforeProcessActivity() {

    }

    override fun showActivity() {
        searchAnimalTypeView.showView()
    }

    override fun afterProcessActivity() {
        if (animalList == null) {
            println("저장된 동물 정보가 없습니다.")
        } else {
            inputSearchAnimalType()

            printSearchAnimalInfo()
        }
    }

    override fun finishActivity() {
        // 수행이 끝나면 메인 메뉴로 돌아가게 함.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MAIN_MENU)
    }

    fun inputSearchAnimalType() {
        println("[ 동물 타입 검색 ]")

        println("다음 중 동물의 타입을 선택해주세요")

        println("1. 호랑이")
        println("2. 사자")
        println("3. 코끼리")

        println("동물 타입 선택 : ")
        inputAnimalType = scanner.nextInt()
    }

    fun printSearchAnimalInfo() {
        // 동물의 수 만큼 반복한다.
        animalList?.forEach {
            // 동물의 타입이 선택한 타입과 같으면 출력한다.
            if(it.animalType == inputAnimalType){
                it.printAnimalInfo()
            }
        }
    }
}