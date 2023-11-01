class Student1 {
    String hakbun;
    String name;

    Student1() {
        // this.hakbun = "0000";
        // this.name = "아무개";

        // Student1("0000", "아무개");  // error

        /*
         * 생성자의 이름으로 클래스이름 대신 this를 사용한다.
         * 한 생성자에서 다른 생성자를 호출할 때는
         * 반드시 첫 줄에서만 호출이 가능하다.
         */
        this("0000", "아무개");
    }

    Student1( String name ) {
        // this.hakbun = "0000";
        // this.name = name;

        this("0000", name);
    }

    Student1( String hakbun, String name ) {
        this.hakbun = hakbun;
        this.name = name;
    }

    void viewStudent() {
        System.out.printf("%s\t%s\n", this.hakbun, this.name);
    }
}

public class StudentEx01 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.viewStudent();

        Student1 s2 = new Student1("홍길동");
        s2.viewStudent();

        Student1 s3 = new Student1("1001", "홍길동");
        s3.viewStudent();
    }
}
