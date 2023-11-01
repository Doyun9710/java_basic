class Method {
    // 메서드의 선언
    void doFunc1() {
        // 지역변수
        // 제어문
        // 실행문
        System.out.println("doFunc1() 호출");
    }

    void doFunc2( int data1 ) {
        System.out.println( "doFunc2() 호출 : " + data1 );
    }

    void doFunc3( int data1, int data2 ) {
        int data0;
        data0 = 30;
        System.out.println( "doFunc3() 호출 : " + data1 + ", " + data2 + ", " + data0 );
    }

    int doFunc4( int data1, int data2 ) {
        int sum = data1 + data2;
        return sum;
    }
}

public class MethodEx01 {
    public static void main(String[] args) {
        Method m1 = new Method();
        m1.doFunc1();
        m1.doFunc2( 10 );
        m1.doFunc3(10, 20);

        int result = m1.doFunc4(100, 200);
        System.out.println( "doFunc4() sum : " + result );

        Method m2 = new Method();
        m2.doFunc1();
    }
}
