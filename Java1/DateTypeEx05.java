public class DateTypeEx05 {
    public static void main(String[] args) {
        // 숫자 : 정수 / 실수
        
        // 정수
        int i = 1;      // 4byte
        System.out.println(i);

        byte b = 1;
        short s = 1;
        // long l = 1;     // 8byte
        long l = 1L;    // long type 명시 : 숫자 뒤 L
        System.out.println( b );
        System.out.println( s );
        System.out.println( l );
        System.out.println();



        // 진법
        int i2 = 0b1010;
        int i8 = 030;
        int i16 = 0xA4;
        System.out.println( i2 );
        System.out.println( i8 );
        System.out.println( i16 );
        System.out.println();

        // 10진수 -> 각 진수
        int i10 = 100;
        System.out.printf( "%o\n", i10 );
        System.out.printf( "%x\n", i10 );
        System.out.println();

        // 높은 단위 
        int i3 = 1_000_000;
        System.out.println( i3 );   // 1000000
        System.out.println();



        // float, double
        // float f1 = 10.1;    // Error
        float f1 = 10.1f;
        System.out.println(f1);
        double d1 = 10.1;
        System.out.println(d1);
        System.out.println();



        // 1000 - 지수
        double d2 = 1.0e3;
        System.out.println(d2); // 1000.0
    }
}
