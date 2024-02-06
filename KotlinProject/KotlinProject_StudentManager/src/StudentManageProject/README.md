# 프로젝트 작업 순서
### step 1. src 폴더에 각 역할에 대한 패키지 생성.
- Controller : 컨트롤러를 모아놓은 패키지
- Model : 모델들을 모아놓은 패키지
- View : 뷰들을 모아놓은 패키지
- Dao : 데이터를 저장하고 읽어오는 클래스들을 모아놓은 패키지
- Activity : 각 상태에 대한 클래스들을 모아놓은 패키지
- Util : 기타 역할을 수행하는 클래스나 인터페이스를 모아놓은 패키지

-------

### step 2. 프로그램의 상태를 정의하고 상태에 대한 열거형을 정의.
- 총 6가지의 상태로 구분
  - 메뉴를 보여주는 상태
  - 학생 정보를 입력하는 상태
  - 학생 정보를 검색하는 상태
  - 학생 정보 전체를 출력하는 상태
  - 각 과목별총점과 평균을 확인하는 상태
  - 종료 상태

### step 3. MainController 파일 생성 및 기본 코드 작성.

### step4. Activity에서 BaseActivity 코드 작성
abstract class BaseActivity {

    // 초기화 메소드
    abstract fun initActivity()

    // 데이터 처리 메소드
    abstract fun processActivity()

    // 화면에 그리는 처리
    abstract fun showActivity()

    // 수행이 끝났을 때 호출되는 메소드
    abstract fun finishActivity()
}

### step 5. main 함수에서 Controller에서의 run 메소드 호출.

fun main() {

    // Controller run 메소드 호출
    val mainController = MainController()
    mainController.run()
}

### step 6. 상태값을 담을 프로퍼티 정의.
MainController.kt

    // 상태값 담을 프로퍼티 정의
    val programState = ProgramState.PROGRAM_STATE_SHOW_MENU

### step 7. 상태별로 분기
MainController.kt

    // 상태값에 따라 객체를 생성해 반환하는 메소드
    fun getStateClass() = when(programState) {
    ProgramState.PROGRAM_STATE_SHOW_MENU -> null
    ProgramState.PROGRAM_STATE_INPUT_STUDENT_INFO -> null
    ProgramState.PROGRAM_STATE_SEARCH_STUDENT_INFO -> null
    ProgramState.PROGRAM_STATE_SHOW_STUDENT_INFO_ALL -> null
    ProgramState.PROGRAM_STATE_SHOW_POINT_TOTAL_AVG -> null
    ProgramState.PROGRAM_STATE_TERMINATE -> null
    }

### step 8. Activity에 기능 별로 클래스 구현. 
- InputStudentInfoActivity
- SearchStudentInfoActivity
- ShowStudentInfoAllActivity
- ShowPointTotalAvgActivity
- TerminateActivity

### step 9. Controller에 상태별로 분기한 것을 클래스 별로 분기.

    // 상태값에 따라 객체를 생성해 반환하는 메소드
    fun getStateClass() = when(programState) {
    ProgramState.PROGRAM_STATE_SHOW_MENU -> ShowMenuActivity()
    ProgramState.PROGRAM_STATE_INPUT_STUDENT_INFO -> InputStudentInfoActivity()
    ProgramState.PROGRAM_STATE_SEARCH_STUDENT_INFO -> SearchStudentInfoActivity()
    ProgramState.PROGRAM_STATE_SHOW_STUDENT_INFO_ALL -> ShowStudentInfoAllActivity()
    ProgramState.PROGRAM_STATE_SHOW_POINT_TOTAL_AVG -> ShowPointTotalAvgActivity()
    ProgramState.PROGRAM_STATE_TERMINATE -> TerminateActivity()
    }

### step 10, 11, 12. 클래스마다 출력되는 것 들 적기.

### step 13. 각 상태별로 필요한 기능들을 정리.

메뉴를 보여주는 상태
- 메뉴의 번호를 입력받는 기능

학생 정보를 입력하는 상태
- 현재 입력된 학생의 수를 보여주는 기능
- 학생의 정보를 입력하는 기능
- 입력받은 학생 정보를 저장하는 기능(잘못 입력된 경우를 대비한다)

학생 정보를 검색하는 상태
- 학생 이름을 입력받는 기능
- 입력받은 학생의 정보를 출력하는 기능(이름이 같은 학생들이 있을 경우 모두 출력한다)
- 학생 정보가 없을 경우에 안내 문구를 보여주는 기능

학생 전체 정보를 출력하는 상태
- 학생 한명의 정보를 출력하는 기능
- 모든 학생들의 정보를 출력하는 기능
- 입력한 학생 정보가 없을 경우 안내 문구를 보여주는 기능

각 과목별 총점과 평균을 보여주는 상태
- 각 과목별 총점 계산하는 기능
- 각 과목별 평균 계산하는 기능
- 입력한 학생 정보가 없을 경우 안내 문구를 보여주는 기능

프로그램을 종료하는 상태
- 프로그램을 종료하는 기능
- 종료 안내 문구를 출력하는 기능`


### step 14. 정리한 기능을 그룹으로 묶어줌.

메뉴를 보여주는 상태
- 메뉴의 번호를 입력받는 기능 -> 상태에 대한 기능
- 메뉴의 번호를 잘못 입력했을 경우 안내 문구를 보여주는 기능 -> 상태에 대한 기능.

학생 정보를 입력하는 상태
- 현재 입력된 학생의 수를 보여주는 기능 -> 상태에 대한 기능
- 학생의 정보를 입력하는 기능(이름, 나이, 점수들) -> 상태에 대한 기능, 학생 개별 데이터 입력은 학생.
- 입력받은 학생 정보를 저장하는 기능. (잘못된 정보를 입력했을 경우를 대비(예외 처리)) -> 상태에 대한 기능

학생 정보를 검색하는 상태
- 학생 이름 입력하는 기능 -> 상태에 대한 기능
- 학생 이름에 맞는 정보를 출력하는 기능(동명이인이 있을 경우 모두 출력.) ->상태에 대한 기능, 학생
- 학생 정보가 없을 경우, 안내 문구를 보여주는 기능. -> 상태에 대한 기능

학생 정보 모두 출력하는 상태
- 학생 한 명의 정보를 출력하는 기능 -> 학생
- 모든 학생들의 정보를 출력하는 기능 -> 상태에 대한 기능
- 입력한 학생 정보가 없을 경우 안내 문구를 보여주는 기능 -> 상태에 대한 기능

각 과목별 총점과 평균을 보여주는 상태
- 각 과목별 총점 계산하는 기능 -> 상태에 대한 기능
- 각 과목별 평균 계산하는 기능 -> 상태에 대한 기능
- 입력된 학생 정보가 없을 경우 안내 문구를 보여주는 기능. -> 상태에 대한 기능

종료하는 상태
- 프로그램 종료하는 기능. -> 상태에 대한 기능
- 종료 안내 문구 출력하는 기능 -> 상태에 대한 기능

<br>

------------------

<br>

### step 15. 필요한 데이터를 정리. 
1. 메뉴를 보여주는 상태
- 선택한 메뉴의 번호 
- 메뉴의 전체 번호

2. 학생 정보를 입력하는 상태
- 현재 입력된 학생 수 
- 학생의 정보(이름, 나이, 국어, 영어, 수학 점수)

3. 검색된 학생들의 정보를 출력하는 상태
- 검색할 학생 이름
- 학생들의 정보. 이름...
- 검색된 학생의 정보

4. 학생 전체 정보를 출력하는 상태
- 학생 개인의 이름, 나이, 국어, 영어, 수학
- 전체 학생의 수
- 학생 전체의 정보

5. 각 과목별 총점과 평균을 보여주는 상태
- 전체 학생의 국어 영어 수학 점수
- 전체 학생의 수
- 과목별 총점
- 과목별 평균

6. 프로그램을 종료하는 상태
- 종료만 시키면 됨.

------

### step16. 정리한 데이터 묶어줌
1. 메뉴를 보여주는 상태
- 선택한 메뉴의 번호 -> 상태
- 메뉴의 전체 번호 -> 상태

2. 학생 정보를 입력하는 상태
- 현재 입력된 학생의 수 -> 상태
- 학생의 이름 -> 학생
- 학생의 나이 -> 학생
- 학생의 국어 점수 -> 학생
- 학생의 영어 점수 -> 학생
- 학생의 수학 점수 -> 학생

3. 학생 정보를 검색하는 상태
- 검색할 학생 이름 -> 상태
- 학생들의 정보. 이름... -> 상태
- 검색된 학생의 정보 -> 학생

4. 학생 전체 정보를 출력하는 상태
- 학생 개인의 이름, 나이, 국어, 영어, 수학 -> 학생
- 전체 학생의 수 -> 상태
- 학생 전체의 정보 -> 상태

5. 각 과목별 총점과 평균을 보여주는 상태
- 전체 학생의 국어 영어 수학 점수 -> 상태
- 전체 학생의 수 -> 상태
- 과목별 총점 -> 상태
- 과목별 평균 -> 상태

6. 프로그램을 종료하는 상태