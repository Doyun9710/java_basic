class Parent4 {
    String p = "부모";
    // private String p = "부모";  // error

    Parent4() {
        System.out.println("Parent 생성자 호출" + this);
    }

    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child4 extends Parent4 {
    String c = "자식 1";

    Child4() {
        System.out.println("Child 생성자 호출" + this);
    }

    void viewChild() {
        System.out.println("viewChild1() 호출");
    }

    /* 
     * 오버라이딩, 재정의
     * 조상 클래스의 메서드를 자손 클래스에서 오버라이딩할 때
     * 1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
     * 2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
     * 3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
     */
    void viewParent() {
        System.out.println("child viewParent() 호출");
    }
}

public class InheritancEx04 {
    public static void main(String[] args) {
        Child4 c = new Child4();

        c.viewChild();
        c.viewParent();
    }
}
