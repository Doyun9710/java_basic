interface InterA {
    // 상수선언
    public static final String STR1 = "홍길동";
    public abstract void methodA();
}

interface InterB {
    // 상수선언
    String STR2 = "김철수";
    void methodB();
}

// extends
interface InterC extends InterA {
    void methodC();
}

// 다중상속
class ClassA implements InterB, InterC {
    public void methodA() {
        System.out.println( "methodA 호출" );
    }

    public void methodB() {
        System.out.println( "methodB 호출" );
    }

    public void methodC() {
        System.out.println( "methodC 호출" );
    }
}

public class AbstractEx04 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
        a.methodC();
    }
}
