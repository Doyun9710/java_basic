class Parent1 {
    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child1 {
    void viewChild1() {
        System.out.println("viewChild1() 호출");
    }
}

class Child1_2 extends Parent1 {
    void viewChild2() {
        System.out.println("viewChild2() 호출");
    }
}

public class InheritancEx01 {
    public static void main(String[] args) {

        Parent1 p1 = new Parent1();
        p1.viewParent();

        Child1 c1 = new Child1();
        c1.viewChild1();
        // c1.viewParent(); // error

        Child1_2 c2 = new Child1_2();
        c2.viewChild2();
        c2.viewParent();
    }
}
