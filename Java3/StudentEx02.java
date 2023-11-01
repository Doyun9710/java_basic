import com.naver.Student;

public class StudentEx02 {
    public static void main(String[] args) {
        // pack1.Student st = new pack1.Student();
        Student st = new Student();

        st.setHakbun("1001");
        st.setName("홍길동");
        st.setAge(20);
        st.setHeight(180);

        System.out.println(st.getHakbun());
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st.getHeight());
    }
}

/*
 * javac -encoding utf-8 StudentEx02.java
 * java StudentEx02
 */