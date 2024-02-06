package StudentManageProject.Dao

import StudentManageProject.Model.StudentModel
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class UserInfoDAO {
    companion object {
        // 파일이 있는지 확인하는 메소드.
        fun isExistUserInfoFile() : Boolean{
            // File 객체 생성
            val saveFile = File("userData.dat")
            // 파일이 존재하는지 확인
            // 파일이 있으면 true, 없으면 false를 반환.
            return saveFile.exists()
        }

        // 파일에서 데이터를 읽어와 ArrayList에 담고 반환하는 메소드.
        fun getStudentInfoList(): ArrayList<StudentModel>? { // Null 허용
            // file이 없다면 Null 반환.
            if(!isExistUserInfoFile()) {
                return null
            }

            // 파일에서 데이터를 읽어올 기본 스트림 생성
            val fileInputStream = FileInputStream("userData.dat")
            // 읽어온 데이터를 객체로 복원하는 필터 스트림 생성
            val objectInputStream = ObjectInputStream(fileInputStream)
            // 읽어옴
            val resultList = objectInputStream.readObject() as ArrayList<StudentModel>
            // 파일을 닫아줌
            objectInputStream.close()
            fileInputStream.close()

            // 객체 반환
            return resultList
        }

        // 데이터를 파일에 씀.
        fun saveStudentInfoList(dataList: ArrayList<StudentModel>) {
            // 파일에 데이터를 쓰기 위해 기본 스트림을 생성.
            // 쓰기를 할 때 파일이 없을 경우 파일이 생성되므로 존재 여부를 확인할 필요 없음.
            val fileOutputStream = FileOutputStream("userData.dat")
            // 객체를 파일에 쓸 수 있는 형태로 가공하는 필터스트림 생성하여 연결.
            val objectOutputStream = ObjectOutputStream(fileOutputStream)
            // 객체를 파일에 씀
            objectOutputStream.writeObject(dataList)
            // 파일을 닫음.
            objectOutputStream.flush()
            objectOutputStream.close()
            fileOutputStream.close()

        }
    }
}