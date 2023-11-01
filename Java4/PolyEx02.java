class Parent {
    String x = "김철수";

    Parent() {
        // System.out.println( "Parent 생성자 호출" );
    }

    void viewParent() {
        System.out.println( "Parent viewParent 호출" );
    }
}

class Child2 extends Parent {
    public String x =  "홍길동";

    Child2() {
        // System.out.println( "Child2 생성자 호출" );
    }

    void viewChild() {
        System.out.println( "Child viewChild 호출" );
    }

    @Override
    void viewParent() {
        System.out.println( "Child viewParent 호출" );
    }
}

public class PolyEx02 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println( p1.x );     // 김철수
        p1.viewParent();                // Parent viewParent();

        Child2 c1 = new Child2();
        System.out.println( c1.x );     // 홍길동
        c1.viewChild();                 // Child viewChild();
        c1.viewParent();                // Child viewParent();

        Parent p2 = new Child2();
        System.out.println( p2.x );     // 김철수
        p2.viewParent();                // 오버라이딩 시 : Child viewParent();
        // p2.viewChild();                 // error, 자식 자체의 메서드 호출 불가
    }
}