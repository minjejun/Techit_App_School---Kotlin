package AnimalManagerProject.Activity

import AnimalManagerProject.Controller.MainController
import AnimalManagerProject.Dao.AnimalInfoDao
import AnimalManagerProject.Model.AnimalModel
import AnimalManagerProject.Util.ProgramState
import AnimalManagerProject.View.DeleteAnimalInfoView
import java.util.Scanner

class DeleteAnimalInfoActivity(var mainController: MainController): BaseActivity() {
    lateinit var deleteAnimalInfoView: DeleteAnimalInfoView

    lateinit var scanner: Scanner

    var deleteAnimalNumber = 0

    var animalList: ArrayList<AnimalModel> ?= null

    override fun initActivity() {
        scanner = Scanner(System.`in`)
        deleteAnimalInfoView = DeleteAnimalInfoView()

        animalList = AnimalInfoDao.getAnimalInfoList()
    }

    override fun beforeProcessActivity() {

    }

    override fun showActivity() {
        deleteAnimalInfoView.showView()
    }

    override fun afterProcessActivity() {
        if ( animalList == null ) {
            println("저장된 동물 정보가 없습니다")
        } else {
            showAllAnimalAnmeAndType()

            inputAnimalNumber()

            deleteSelectedAnimal()
        }
    }

    override fun finishActivity() {
        // 수행이 끝나면 메인 메뉴로 돌아가게 함.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MAIN_MENU)
    }

    // 모든 동물들의 이름과 타입을 출력하는 메소드.
    fun showAllAnimalAnmeAndType() {
        var animalIndex = 0

        animalList?.forEach {
            animalIndex++
            println()
            println("${animalIndex}번째 동물")
            println("동물 종류 : ${it.animalType}")
            println("동물 이름 : ${it.name}")
        }
    }

    // 삭제할 동물의 번호를 입력하는 메소드
    fun inputAnimalNumber() {
        println()
        print("삭제할 동물의 번호를 입력해주세요 : ")
        deleteAnimalNumber = scanner.nextInt()
    }

    // 선택한 동물을 삭제하는 메소드.
    fun deleteSelectedAnimal() {
        animalList?.removeAt(deleteAnimalNumber - 1)

        AnimalInfoDao.saveAnimalInfoList(animalList!!)
    }
}