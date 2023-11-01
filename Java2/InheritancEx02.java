class Parent2 {
    String p = "부모";
    // private String p = "부모";  // error
    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child21 extends Parent2 {
    String c = "자식 1";
    void viewChild1() {
        System.out.println("viewChild1() 호출");
    }
}

class Child22 extends Parent2 {
    String c = "자식 2";
    void viewChild2() {
        System.out.println("viewChild2() 호출");
    }
}

public class InheritancEx02 {
    public static void main(String[] args) {

        Parent2 p1 = new Parent2();
        p1.viewParent();

        Child21 c1 = new Child21();
        c1.viewChild1();
        c1.viewParent();
        System.out.println(c1.p);
        System.out.println(c1.c);

        Child22 c2 = new Child22();
        c2.viewChild2();
        c2.viewParent();
        System.out.println(c2.p);
        System.out.println(c2.c);
    }
}
