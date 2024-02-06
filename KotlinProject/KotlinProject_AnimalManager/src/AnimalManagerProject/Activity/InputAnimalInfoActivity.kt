package AnimalManagerProject.Activity

import AnimalManagerProject.Controller.MainController
import AnimalManagerProject.Dao.AnimalInfoDao
import AnimalManagerProject.Model.AnimalModel
import AnimalManagerProject.Model.ElephantModel
import AnimalManagerProject.Model.LionModel
import AnimalManagerProject.Model.TigerModel
import AnimalManagerProject.Util.AnimalType
import AnimalManagerProject.Util.ProgramState
import AnimalManagerProject.View.InputAnimalInfoView
import java.util.Scanner

// 1번
class InputAnimalInfoActivity(var mainController: MainController) : BaseActivity() {

    lateinit var inputAnimalInfoView: InputAnimalInfoView

    var animalList: ArrayList<AnimalModel>? = null

    var animalCnt = 0

    lateinit var animalModel: AnimalModel

    lateinit var scanner: Scanner

    override fun initActivity() {
        scanner = Scanner(System.`in`)

        inputAnimalInfoView = InputAnimalInfoView()
        inputAnimalInfoView.inputAnimalInfoActivity = this

        animalList = AnimalInfoDao.getAnimalInfoList()

    }

    override fun beforeProcessActivity() {
        // 동물들의 수 담음
        if (animalList != null) {
            animalCnt = animalList!!.size
        }
    }

    override fun showActivity() {

        inputAnimalInfoView.showView()
    }


    override fun afterProcessActivity() {
        // 동물 종류 입력받음
        inputAnimalType()

        // 파일에 저장
        AnimalInfoDao.saveAnimalInfoList(animalList!!)
    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MAIN_MENU)
    }

    fun inputAnimalType() {
        print("동물 종류(1. 호랑이, 2. 사자, 3. 코끼리) : ")
        val animalType = scanner.nextInt()

        animalModel = when(animalType) {
            AnimalType.ANIMAL_TYPE_TIGER.num -> TigerModel()
            AnimalType.ANIMAL_TYPE_LION.num -> LionModel()
            AnimalType.ANIMAL_TYPE_ELEPHANT.num -> ElephantModel()
            else -> AnimalModel()
        }
        animalModel.inputAnimalInfo(scanner, animalType)
        // ArrayList에 담는다.
        if(animalList == null){
            animalList = ArrayList<AnimalModel>()
        }
        animalList?.add(animalModel)
    }
}