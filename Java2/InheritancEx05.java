class Parent5 {
    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child5 extends Parent5 {
    void viewChild() {
        System.out.println("viewChild() 호출");
    }

    void viewParent() {
        // 부모 viewParent() 호출
        super.viewParent();

        System.out.println("child viewParent() 호출");
    }
}

public class InheritancEx05 {
    public static void main(String[] args) {
        Child5 c = new Child5();

        c.viewChild();
        c.viewParent();
    }
}
