class Parent {
    Parent() {
        System.out.println( "Parent 생성자 호출" );
    }
}

class Child1 {
    Child1() {
        System.out.println( "Child1 생성자 호출" );
    }
}

class Child2 extends Parent {
    Child2() {
        System.out.println( "Child2 생성자 호출" );
    }
}

public class PolyEx01 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        // 형변환
        // Parent p1 = c1; // error
        Parent p2 = c2;
        Parent p3 = new Child2();

        // Object
        // 모든 클래스는 object로 형변환 가능
        Object obj1 = new Parent();
        Object obj2 = new Child2();
    }
}