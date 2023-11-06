import java.util.StringJoiner;

public class StringJoinerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 결합
		// + 
		// concat()
		// String.format()
		// join()
		
		
		// 문자열 연결 format()
		String str1 = String.format("%s-%s-%s-%s", "사과", "수박", "딸기", "참외");
		System.out.println( str1 );				// 사과-수박-딸기-참외

		// 문자열 연결 join()
		String[] arrStr = { "사과", "수박", "딸기", "참외" };
		String str2 = String.join("-", arrStr);
		System.out.println( str2 );				// 사과-수박-딸기-참외
		
		// 문자열 연결 add()
		StringJoiner sj = new StringJoiner("-");
		sj.add( "사과" );
		sj.add( "수박" );
		sj.add( "딸기" );
		sj.add( "참외" );
		System.out.println( sj.toString() );	// 사과-수박-딸기-참외
	}

}
