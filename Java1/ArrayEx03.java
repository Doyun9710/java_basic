public class ArrayEx03 {
    public static void main(String[] args)  {
        // 선언, 생성 분리
        int[] arr1;
        arr1 = new int[3];

        // 선언, 생성 통합
        int[] arr2 = new int[3];

        // 선언, 생성, 초기화 통합
        int[] arr3 = new int[] { 10, 20, 30 };
        int[] arr4 = { 10, 20, 30 };

        // All 3
        System.out.println( arr1.length );
        System.out.println( arr2.length );
        System.out.println( arr3.length );
        System.out.println( arr4.length );

        // 전체 데이터 읽어오기
        for( int i=0 ; i<arr4.length ; i++ ) {
            System.out.println( arr4[i] );
        }

        // 향상된 for
        for( int data : arr4 ) {
            System.out.println( data );
        }
    }
}
