// final class Parent7 {   // 조상이 될 수 없는 클래스
class Parent7 {
    // final String DATA;
    String DATA;
    
    Parent7() {
        System.out.println("Parent 생성자 호출");
        this.DATA = "10";
        this.DATA = "20";   // final String DATA; 시 Error

        System.out.println(this.DATA);
    }

    // class Child7 overrides final method Parent7.viewParent()
    // final void viewParent() {
    void viewParent() {
        System.out.println("Parent viewParent() 호출");
    }
}

class Child7 extends Parent7 {
    Child7() {
        System.out.println("Child 생성자 호출");
    }

    void viewParent() {
        System.out.println("Child viewParent() 호출");
    }
}

public class InheritancEx07 {
    public static void main(String[] args) {
        Child7 c = new Child7();

        c.viewParent();
    }
}
