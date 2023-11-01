public class LoopEx05 {
    public static void main( String[] args ) {
        // 중첩
        for( int i=0 ; i<=10 ; i++ ) {
            for( int j=0 ; j<=10 ; j++ ) {
                if( i>j ) {
                    System.out.print( "*" );
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for( int i=0 ; i<=10 ; i++ ) {
            for( int j=0 ; j<=10 ; j++ ) {
                if( i<j ) {
                    System.out.print( "*" );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println();
        }
    }
}
