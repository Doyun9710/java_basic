public class ArrayEx08 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        /*
         * javac -encoding utf-8 ArrayEx08.java
         * java ArrayEx08 2 3 4
         */

        // 배열의 길이
        System.out.println( args.length );  // 0

        // 자료형 String
        System.out.println( args[0] );

        // 전체 파라메터(아규먼트)
        for( int i=0 ; i<args.length ; i++ ) {
            System.out.println( args[i] );
        }

        System.out.println( "끝" );
    }
}
