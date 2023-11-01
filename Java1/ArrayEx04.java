public class ArrayEx04 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        int[] arr1 = { 10, 20, 30 };
        char[] arr2 = { 'a', 'b', 'c' };
        for( char data : arr2 ) {
            System.out.println( data );
        }

        String[] arr3 = { "abc", "bcd", "cde" };
        for( String data : arr3 ) {
            System.out.println( data );
        }

        System.out.println( "끝" );
    }
}
