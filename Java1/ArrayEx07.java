public class ArrayEx07 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        // 삼차원 배열 선언, 출력
        int[][][] arr = {
            {
                {10, 20, 30},
                {30, 40, 50}
            },
            {
                {60, 70, 80},
                {90, 100, 110}
            }
        };

        for( int[][] row : arr ) {
            for( int[] col : row ) {
                for( int data : col ) {
                    System.out.println( data );
                }
            }
        }
        
        System.out.println( "끝" );
    }
}
