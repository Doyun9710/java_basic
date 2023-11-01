class Parent6 {
    // Parent6() {
    //     System.out.println("Parent 생성자 호출");
    // }

    Parent6(String name) {
        System.out.println("Parent 생성자 호출");
    }
}

class Child6 extends Parent6 {
    Child6() {
        // 부모 생성자 명시적 호출
        super("홍길동");
        
        System.out.println("Child 생성자 호출");
    }
}

public class InheritancEx06 {
    public static void main(String[] args) {
        Child6 c = new Child6();


    }
}
