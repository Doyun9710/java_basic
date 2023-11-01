class Parent {
    Parent() {
        System.out.println( "Parent 생성자 호출" );
    }

    void viewParent() {
        System.out.println( "Parent viewParent 호출" );
    }
}

class Child extends Parent {
    Child() {
        System.out.println( "Child 생성자 호출" );
    }

    @Override
    void viewParent() {
        System.out.println( "Child viewParent 호출" );
    }
}

public class PolyEx04 {
    public static void main(String[] args) {
        // 자동 형변환
        Parent p1 = new Child();
        p1.viewParent();        // Child viewParent 호출

        // 강제 형변환
        Child c1 = (Child)p1;   // 가능
        c1.viewParent();        // Child viewParent 호출

        // Parent p2 = new Parent();
        // Child c2 = (Child)p2;   // error
    }
}