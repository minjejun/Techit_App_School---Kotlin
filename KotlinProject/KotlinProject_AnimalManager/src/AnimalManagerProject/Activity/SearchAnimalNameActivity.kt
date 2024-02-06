package AnimalManagerProject.Activity

import AnimalManagerProject.Controller.MainController
import AnimalManagerProject.Dao.AnimalInfoDao
import AnimalManagerProject.Model.AnimalModel
import AnimalManagerProject.Util.ProgramState
import AnimalManagerProject.View.SearchAnimalNameView
import java.util.Scanner

class SearchAnimalNameActivity(var mainController: MainController): BaseActivity() {

    lateinit var searchAnimalNameView: SearchAnimalNameView

    lateinit var scanner: Scanner

    lateinit var searchKeyword: String

    var animalList: ArrayList<AnimalModel> ?= null

    override fun initActivity() {
        searchAnimalNameView = SearchAnimalNameView()
        scanner = Scanner(System.`in`)

        // 동물들의 정보를 가져옴
        animalList = AnimalInfoDao.getAnimalInfoList()
    }

    override fun beforeProcessActivity() {

    }

    override fun showActivity() {
        searchAnimalNameView.showView()
    }

    override fun afterProcessActivity() {
        // 만약 저장된 동물이 없다면 없다고 출력
        // 동물 이름 입력 후 동물 정보 출력하는 함수 호출
        if(animalList == null) {
            println("저장된 동물 정보가 없습니다.")
        } else {
            inputSearchAnimalName()

            printSearchAnimalInfo()
        }
    }

    override fun finishActivity() {
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MAIN_MENU)
    }

    fun inputSearchAnimalName() {
        print("검색할 동물의 이름을 입력해주세요 : ")
        searchKeyword = scanner.next()
    }

    fun printSearchAnimalInfo() {
        // 검색된 동물의 수
        var findCnt: Int = -1

        animalList?.forEach {
            if(it.name == searchKeyword) {
                it.printAnimalInfo()
            }  else {
                println("검색된 동물이 존재하지 않습니다.")
            }
        }

        if(findCnt == null) {
            println("검색된 동물이 존재하지 않습니다.")
        }
    }
}