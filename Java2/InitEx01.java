class Init1 {
    // 멤버필드 자동 초기화
    String str1;    // 초기값 null
    int i1;         // 초기값 0

    void doFunc() {
        // 지역변수
        String str2 = "str2";
        System.out.println(str2);   // 미초기화 시 error
    }
}
public class InitEx01 {
    public static void main(String[] args) {
        Init1 i = new Init1();
        System.out.println(i.str1);
        // 인스턴스 변수 x는 초기화를 해주지 않아도 
        // 자동적으로 int형의 기본값인 0으로 초기화
        System.out.println(i.i1);

        i.doFunc();
    }
}
