class Variable {
    // 인스턴스 멤버필드
    String str1;
    // 클래스 멤버필드
    static String str2;
}

public class VariableEx01 {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();


        v1.str1 = "홍길동";
        v1.str2 = "박문수";
        System.out.println( v1.str1 );
        System.out.println( v1.str2 );


        System.out.println( Variable.str2 );
        Variable.str2 = "임꺽정";
        System.out.println( Variable.str2 );

        
        v2.str1 = "강감찬";
        System.out.println( v2.str1 );
        System.out.println( v2.str2 );
    }
}
