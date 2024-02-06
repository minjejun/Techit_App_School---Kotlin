public class JavaMain {
    // 정적 변수
    public static int javaValue1 = 100;

    public static void javaMethod1() {
        System.out.println("javaMethod1");
    }

    // 자바 프로그램 시작 메소드
    public static void main(String[] args) {
        // 코틀린에서 정의한 companion object의 정적 멤버 사용
        int a1 = TestClass2.Companion.getKotlinValue1();
        System.out.println("a1 : " + a1);
        TestClass2.Companion.kotlinMethod();
    }
}
