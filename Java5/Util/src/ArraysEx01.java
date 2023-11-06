import java.util.Arrays;

public class ArraysEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrs = { "aaa", "bbb", "ccc" };
		
		// 배열의 내용 확인
		// 향상된 for문
		for( String data : arrs ) {
			System.out.println( data );
		}
		
		// util.Arrays
		System.out.println( Arrays.toString( arrs ));
		String strArr = Arrays.toString( arrs );
		
		
		
		// 배열의 초기화
		Arrays.fill( arrs, "xxx" );
		// System.out.println( arrs );
		for( String data : arrs ) { System.out.println ( data + " " ); }
		
		Arrays.fill( arrs, 0, 2, "yyy" );
		for( String data : arrs ) { System.out.println ( data + " " ); }
		
		
		
		// 배열의 비교
		String[] arr1 = { "aaa", "bbb", "ccc" };
		String[] arr2 = { "aaa", "bbb", "ccc" };
		
		// 참조값 비교
		System.out.println( arr1 == arr2 );					// false
		// 내용 비교
		System.out.println( Arrays.equals(arr1, arr2) );	// true
		
		
		
		// 데이터 정렬, Int
		int[] arrNum1 = { 5, 2, 3, 1, 4 };
		
		// Integer : 기본 자료형
		// Integer[] arrNum2 = { Integer.valueOf(5), Integer.valueOf(2), Integer.valueOf(3) };
		Integer[] arrNum2 = { 5, 2, 3, 1, 4 };
		
		Arrays.sort( arrNum1 );
		Arrays.sort( arrNum2 );
		System.out.println( Arrays.toString( arrNum1 ));
		System.out.println( Arrays.toString( arrNum2 ));
		
		
		
		// 데이터 정렬, String
		String[] names = { "xMan", "Alex", "xMen", "Bob", "Curl", "flex", "alex" };
		Arrays.sort( names );
		System.out.println( Arrays.toString( names ));
	}

}
