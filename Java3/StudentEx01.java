import pack1.Student;

public class StudentEx01 {
    public static void main(String[] args) {
        // pack1.Student st = new pack1.Student();
        Student st = new Student();

        st.setHakbun("1001");
        st.setName("홍길동");

        System.out.println(st.getHakbun());
        System.out.println(st.getName());
    }
}

/*
 * 미 import 시
 * javac -encoding utf-8 -d . StudentEx01.java
 * java StudentEx01
 * 
 * import 시
 * javac -encoding utf-8 StudentEx01.java
 * java StudentEx01
 */