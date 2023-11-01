public class ArrayEx01 {
    public static void main(String[] args)  {
        // 배열의 선언
        int[] arr1;

        // 배열의 생성
        arr1 = new int[3];          // 참조자료형
        System.out.println( arr1 ); // [I@372f7a8d : 저장주소

        // 배열의 초기화
        arr1[0] = 10;
        arr1[1] = 10;
        arr1[2] = 10;

        System.out.println( arr1[0] );
        System.out.println( arr1[1] );
        System.out.println( arr1[2] );

        int a = 10;
        System.out.println( a );    // 기본자료형
    }
}
