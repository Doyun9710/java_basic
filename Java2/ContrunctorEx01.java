class Contrunctor1 {
    // 메서드명 = 클래스명
    Contrunctor1() {
        System.out.println("생성자 호출");
    }
}

public class ContrunctorEx01 {
    public static void main(String[] args) {
        // new Contrunctor1();
        // -> 생성자 호출
        Contrunctor1 c1 = new Contrunctor1();
        // c1.Contrunctor1();  // error
    }
}