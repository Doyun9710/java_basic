
class Student6_3 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return Math.round(getTotal() / 3f * 10) / 10f;
    }
}

public class Q6_3 {
    public static void main(String args[]) {
        Student6_3 s = new Student6_3();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름 :" + s.name);
        System.out.println("총점 :" + s.getTotal());
        System.out.println("평균 :" + s.getAverage());
    }
}
