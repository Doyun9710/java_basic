class Method {
    void doFunc1() {
        System.out.println("doFunc1() 호출");
    }

    static void doFunc2() {
        System.out.println("doFunc2() 호출");
    }
}

public class MethodEx03 {
    public static void main(String[] args) {
        Method m1 = new Method();
        Method m2 = new Method();
        m1.doFunc1();
        m1.doFunc2();

        Method.doFunc2();

        m2.doFunc1();
        Method.doFunc2();
    }
}
