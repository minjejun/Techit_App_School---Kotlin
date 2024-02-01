// TestFile1.kt
// 같은 모듈, 같은 패키지, 다른 파일
open private class PrivateClass2
open public class PublicClass2
// 클래스에는 protected를 붙일 수 없음.
// protected class ProtectedClass2
open internal class InternalClass2

open class SuperClass2 {
    private var a20 = 100
    public var a21 = 200
    protected var a22 = 300
    internal  var a23 = 400
}