public class ArrayEx05 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        // 다차원 배열

        // 이차원 배열
        // 메모리 구조 교제 149p
        int[][] arr1;
        arr1 = new int[3][2];

        arr1[0][0] = 10;
        arr1[0][1] = 10;
        arr1[1][0] = 10;
        arr1[1][1] = 10;
        arr1[2][0] = 10;
        arr1[2][1] = 10;

        System.out.println( arr1[0][0] );
        System.out.println( arr1[2][1] );


        
        int[][] arr2 = new int[3][2];
        int[][] arr3 = new int[][]{ {10, 20}, {30, 40}, {50, 60} };
        int[][] arr4 = { {10, 20}, {30, 40}, {50, 60} };

        System.out.println( arr4 );         // [[I@372f7a8d
        System.out.println( arr4[0] );      // [I@2f92e0f4
        System.out.println( arr4[0][0] );   // 10

        System.out.println( "끝" );
    }
}
