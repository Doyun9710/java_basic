class Contrunctor2 {
    String str1;

    // 생성자 오버로딩
    Contrunctor2() {
        System.out.println("생성자 호출");
        str1 = "홍길동";
    }

    Contrunctor2(String str1) {
        this.str1 = str1;
    }
}

public class ContrunctorEx02 {
    public static void main(String[] args) {
        Contrunctor2 c1 = new Contrunctor2();
        Contrunctor2 c2 = new Contrunctor2("김철수");
        System.out.println(c1.str1);
        System.out.println(c2.str1);
    }
}