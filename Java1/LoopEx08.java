public class LoopEx08 {
    public static void main( String[] args ) {
        System.out.println( "시작" );

        int n = 0;
        while( n<= 5 ) {
            n++;

            if( n == 3 ) {
                // break;
                continue;
            }

            System.out.println( n );
        }

        System.out.println( "끝" );
    }
}
