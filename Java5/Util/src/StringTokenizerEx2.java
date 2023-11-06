import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "사과&참외&&수박&&&딸기";
		
		StringTokenizer st = new StringTokenizer(str, "&");
		System.out.println( st.countTokens() );		// 4
		while( st.hasMoreTokens() ) {
			System.out.println( st.nextToken() );	// 사과 참외 수박 딸기
		}
		
		String[] arr = str.split("&");
		System.out.println( arr.length );			// 7
		for( int i=0 ; i<arr.length ; i++ ) {
			System.out.println( arr[i] );			// 사과 참외   수박     딸기
		}
	}

}
