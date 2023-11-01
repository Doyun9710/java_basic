class Method5 {
    String str1;

    void doFunc1() {
        System.out.println( str1 );
        // this : 자기참조용 주소
        System.out.println( this ); // Method@372f7a8d
        System.out.println( this.str1 );

        // doFunc2();
        this.doFunc2();
    }

    void doFunc2() {
        System.out.println("doFunc2() 호출");
    }
}

public class MethodEx05 {
    public static void main(String[] args) {
        Method5 m1 = new Method5();
        Method5 m2 = new Method5();

        m1.doFunc1();
        System.out.println(m1);     // Method@372f7a8d

        m2.doFunc1();
        System.out.println(m2);
    }
}
