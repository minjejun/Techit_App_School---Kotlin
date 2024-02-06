package AnimalManagerProject.View

import java.util.Scanner
import AnimalManagerProject.Activity.InputAnimalInfoActivity
import AnimalManagerProject.Model.AnimalModel
import AnimalManagerProject.Model.ElephantModel
import AnimalManagerProject.Model.LionModel
import AnimalManagerProject.Model.TigerModel

// 1번 메뉴
class InputAnimalInfoView(): BaseView() {

    lateinit var inputAnimalInfoActivity: InputAnimalInfoActivity

    override fun showView() {
        println()
        println("[ 동물 정보 입력 ]")
        println("입력된 동물의 수 : ${inputAnimalInfoActivity.animalCnt}")
    }
}