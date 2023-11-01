public class ConditionEx02 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        for( int i=0 ; i<10 ; i++ ) {
            if( i >= 5 && i <=10 ) {
                System.out.println( "영역내" );
            }
            else {
                System.out.println( "영역외" );
            }
        }

        System.out.println( "끝" );
    }
}
