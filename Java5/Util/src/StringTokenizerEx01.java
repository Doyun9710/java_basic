import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 구분자 단위로 분리
		String strData1 = "사과 참외 수박 딸기";
		
		// 방법 1
		String[] arrData = strData1.split(" ");
		System.out.println(arrData[0]);
		
		// 요소 개수 확인
		StringTokenizer st1 = new StringTokenizer( strData1 );
		System.out.println( st1.countTokens() );
		
		// 전체 토큰 출력
		/*
		 * System.out.println( st1.nextToken() ); System.out.println( st1.nextToken() );
		 * System.out.println( st1.hasMoreTokens() ); // true System.out.println(
		 * st1.nextToken() ); System.out.println( st1.hasMoreTokens() ); // true
		 * System.out.println( st1.nextToken() ); System.out.println(
		 * st1.hasMoreTokens() ); // false
		 */	
		while( st1.hasMoreTokens() ) {
			System.out.println( st1.nextToken() );
		}
		
		
		
		String strData2 = "사과&참외&수박&딸기";
		StringTokenizer st2 = new StringTokenizer( strData2, "&" );
		while( st2.hasMoreTokens() ) {
			System.out.println( st2.nextToken() );
		}
	}

}
