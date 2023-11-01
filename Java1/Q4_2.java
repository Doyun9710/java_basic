public class Q4_2 {
    public static void main(String[] args) {

        int count = 0;
        for( int i=1 ; i<=20 ; i++ ) {
            if( i % 2 == 0 || i % 3 == 0 ) {
                continue;
            }
            count += i;
        }
        System.out.println( count );    // 73
    }
}
