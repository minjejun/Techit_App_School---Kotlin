package AnimalManagerProject.Util

enum class ProgramState {
    // 메뉴 보여주는 상태
    PROGRAM_STATE_SHOW_MAIN_MENU,
    // 동물 정보 입력하는 상태
    PROGRAM_STATE_INPUT_ANIMAL_INFO,
    // 동물 이름 검색하는 상태
    PROGRAM_STATE_SEARCH_ANIMAL_NAME,
    // 동물 타입 검색하는 상태
    PROGRAM_STATE_SEARCH_ANIMAL_TYPE,
    // 모든 동물 정보 출력하는 상태
    PROGRAM_STATE_SHOW_ANIMAL_INFO_ALL,
    // 동물 삭제하는 상태
    PROGRAM_STATE_DELETE_ANIMAL_INFO,
    // 프로그램 종료하는 상태
    PROGRAM_STATE_FINISH
}

enum class MenuNum(var num : Int) {
    PROGRAM_STATE_INPUT_ANIMAL_INFO(1),
    PROGRAM_STATE_SEARCH_ANIMAL_NAME(2),
    PROGRAM_STATE_SEARCH_ANIMAL_TYPE(3),
    PROGRAM_STATE_SHOW_ANIMAL_INFO_ALL(4),
    PROGRAM_STATE_DELETE_ANIMAL_INFO(5),
    PROGRAM_STATE_FINISH(6)
}

// 동물 종류
enum class AnimalType(var num:Int){
    // 호랑이
    ANIMAL_TYPE_TIGER(1),
    // 사자
    ANIMAL_TYPE_LION(2),
    // 코끼리
    ANIMAL_TYPE_ELEPHANT(3)
}
