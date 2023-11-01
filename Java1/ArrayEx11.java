import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        /*
         * javac -encoding utf-8 ArrayEx11.java
         * java ArrayEx11 1 2 3 4 5 6 7 8 9 10
         * 
         * 시작
         * 최대값 : 10
         * 최소값 : 1
         * 끝
         */

        // int max, min;
        int[] arr = new int[10];

        // 숫자 10개 입력 -> 최대값, 최소값 출력
        if( args.length != 10 ) {
            System.out.println("잘못 입력했습니다.");
        }
        else {
            for( int i=0 ; i<10 ; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            System.out.println( "최대값 : " + Arrays.stream(arr).max().getAsInt());
            System.out.println( "최소값 : " + Arrays.stream(arr).min().getAsInt());
        }

        System.out.println( "끝" );
    }
}
