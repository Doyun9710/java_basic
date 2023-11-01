class Parent1 {
    Parent1() {
        System.out.println( "Parent1 생성자 호출" );
    }

    // 정상 메서드
    void viewParent1() {};
    // abstract void viewParent2();
}

abstract class Parent2 {
    Parent2() {
        System.out.println( "Parent2 생성자 호출" );
    }

    // 추상 메서드
    abstract void viewParent2();
}

class Child2 extends Parent2 {
    Child2() {
        System.out.println( "Child2 생성자 호출" );
    }

    void viewParent2() {
        System.out.println( "Child2 viewParent2" );
    }
}

public class AbstractEx01 {
    public static void main(String[] args) {
        // 인스턴스화
        Parent1 p1 = new Parent1();

        // Parent2 p2 = new Parent2();     // error
        Child2 c2 = new Child2();
    }
}
