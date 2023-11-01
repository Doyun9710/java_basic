class Overload {
    void doFunc() {
        System.out.println( "doFunc() 호출");
    }

    void doFunc(int a) {
        System.out.println( "doFunc(int a) 호출");
    }

    void doFunc(String s) {
        System.out.println( "doFunc(String s) 호출");
    }

    void doFunc(String s, int a) {
        System.out.println( "doFunc(String s, int a) 호출 ");
    }

    void doFunc(int a, String s) {
        System.out.println( "doFunc(int a, String s) 호출 ");
    }
}

public class OverloadEx01 {
    public static void main(String[] args) {
        Overload o1 = new Overload();
        o1.doFunc();
        o1.doFunc(10);
        o1.doFunc("10");
        o1.doFunc("10", 10);
        o1.doFunc(10, "10");
    }
}
