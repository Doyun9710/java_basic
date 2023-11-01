public class ArrayEx09 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        // java 클래스 명
        // 2 ...

        /*
         * javac -encoding utf-8 ArrayEx09.java
         * java ArrayEx09 1 + 2
         */

        if(args.length != 3) {
            System.out.println( "입력이 잘못되었습니다" );
        } else {
            // string + string : 12
            // System.out.println( "결과 : " + args[0] + args[2] );

            // java 문자열 형변환
            // 문자열 -> 정수 : Integer.parseInt()
            // 문자열 -> 실수 : Float.parseFloat() / Double.parseDouble()
            System.out.println( "결과 : " + ( Integer.parseInt(args[0]) + Integer.parseInt(args[2]) ) );
        }

        System.out.println( "끝" );
    }
}
