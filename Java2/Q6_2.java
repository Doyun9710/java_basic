
class Student6_2 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student6_2(String name, int ban, int no, int kor, int eng, int math) {
        // super();
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return Math.round(getTotal() / 3f * 10) / 10f;
    }

    public String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math+ ", " + getTotal() + ", " + getAverage();
    }
}

public class Q6_2 {
    public static void main(String args[]) {
        Student6_2 s = new Student6_2("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}
