interface InterA {
    // 상수선언
    public static final String STR1 = "홍길동";
    
    // 추상메서드 선언
    public abstract void methodA();
    void methodB();
}

// 인터페이스 구현
class ClassA implements InterA {
    public void methodA() {
        System.out.println( "methodA 호출" );
    }

    public void methodB() {
        System.out.println( "methodB 호출" );
    }
}

public class AbstractEx03 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
    }
}
