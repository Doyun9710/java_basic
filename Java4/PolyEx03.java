class Parent {
    void viewParent() {
        System.out.println( "Parent viewParent 호출" );
    }
}

class Child1 extends Parent {
    void viewParent() {
        System.out.println( "Child1 viewParent 호출" );
    }
}

class Child2 extends Parent {
    void viewParent() {
        System.out.println( "Child2 viewParent 호출" );
    }
}

public class PolyEx03 {
    public static void main(String[] args) {
        Parent p1 = new Child1();
        p1.viewParent();

        Parent p2 = new Child2();
        p2.viewParent();
    }
}