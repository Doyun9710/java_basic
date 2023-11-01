class Method {
    String str1 = "데이터 1";
    static String str2 = "데이터 2";

    void doFunc1() {
        System.out.println( str1 );
        // System.out.println( str2 );

        System.out.println(Method.str2);
    }

    static void doFunc2() {
        System.out.println(Method.str2);
    }
}

public class MethodEx04 {
    public static void main(String[] args) {
        Method m = new Method();
        m.doFunc1();

        Method.doFunc2();
    }
}
