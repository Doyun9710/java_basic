public class LoopEx09 {
    public static void main( String[] args ) {
        System.out.println( "시작" );

        int n = 0;
        // 라벨
        outer :
        while( n<= 5 ) {
            n++;

            int m = 0;
            while( m<=5 ) {
                m++;

                if( m == 3 ) {
                    break outer;
                }

                System.out.println( n + " / " + m );
            }
        }

        System.out.println( "끝" );
    }
}
