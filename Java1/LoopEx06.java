public class LoopEx06 {
    public static void main( String[] args ) {
        // 중첩
        char c = 'A';
        for( int i=0 ; i<=10 ; i++ ) {
            for( int j=0 ; j<=10 ; j++ ) {
                if( i>j ) {
                    System.out.print( c++ );
                }
            }
            c = 'A';
            System.out.println();
        }
    }
}
