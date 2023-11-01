public class ArrayEx06 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        // 가변배열
        int[][] arr1 = {
            {10, 20, 30},
            {40, 50},
            {60}
        };


        
        int[][] arr2 = new int[3][];

        // 생성만
        // arr2[0] = new int[3];
        // arr2[1] = new int[2];
        // arr2[2] = new int[1];

        //생성, 초기화 한번에
        arr2[0] = new int[] {10, 20, 30};
        arr2[1] = new int[] {40, 50};
        arr2[2] = new int[] {60};

        System.out.println( arr2[2][0]);

        System.out.println( "끝" );
    }
}
