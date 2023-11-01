public class OperatorEx01 {
    public static void main(String[] args) {
        System.out.println( 10 + 4 );
        System.out.println( 10 - 4 );
        System.out.println( 10 * 4 );

        // 10 / 4 = 2.5, 정수끼리의 나눗셈 결과는 정수
        System.out.println( 10 / 4 );           // 2
        System.out.println( 10 / (double)4 );   // 2.5
        System.out.println( 10 / 4. );          // 2.5
        System.out.println();
        
        System.out.println( 1 % 2 );
        System.out.println( 2 % 2 );
        System.out.println( 3 % 2 );
        System.out.println( 4 % 2 );
        System.out.println();



        // 오버플로우
        int i1 = 1_000_000;
        int i2 = 2_000_000;

        // int product = i1 * i2;                  // -1454759936
        long product = (long)i1 * i2;
        System.out.println( product );
        System.out.println();



        // java 산술연산 최소 단위 : int
        int i3 = 10;
        int i4 = 20;
        int sum1 = i3 + i4;
        System.out.println( sum1 );

        short s3 = 10;
        short s4 = 20;
        // short sum2 = s3 + s4;
        int sum2 = s3 + s4;         // or short sum2 = (short)( s3 + s4 );
        System.out.println( sum2 );
    }
}
