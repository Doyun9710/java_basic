class Parent3 {
    String p = "부모";
    // private String p = "부모";  // error

    Parent3() {
        System.out.println("Parent 생성자 호출" + this);
    }

    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child3 extends Parent3 {
    String c = "자식 1";

    Child3() {
        System.out.println("Child 생성자 호출" + this);
    }

    void viewChild1() {
        System.out.println("viewChild1() 호출");
    }
}

class GrandChild extends Child3 {
    String gc = "손자";
    
    GrandChild() {
        System.out.println("GrandChild 생성자 호출" + this);
    }

    void viewGrandChild() {
        System.out.println("viewGrandChild() 호출");
    }
}

public class InheritancEx03 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();

        System.out.println( "gc : " + gc );

        gc.viewGrandChild();
        gc.viewChild1();
        gc.viewParent();

        System.out.println(gc.p);
        System.out.println(gc.c);
        System.out.println(gc.gc);
    }
}
