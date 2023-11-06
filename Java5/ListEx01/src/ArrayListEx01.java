import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본 버퍼
		ArrayList al1 = new ArrayList();
		// 10 크기 버퍼
		ArrayList al2 = new ArrayList(10);
		

//		String str1 = new String( "홍길동" );
//		Object obj1 = str1;
//		al1.add( obj1 );
		al1.add( "홍길동" );
		al1.add( "김철수" );
		al1.add( "임꺽정" );
		
		System.out.println( al1.size() );	// 3
		System.out.println( al1 );
		
		
		// 값 가져오기
//		Object obj = al1.get(0);
//		String str = (String)obj;
		String str = (String)al1.get(0);
		
		System.out.println( str );
		
		
		// 전체 데이터 가져오기 for문
		for( int i=0 ; i<al1.size() ; i++ ) {
			String s = (String)al1.get(i);
			System.out.println( s );
		}
		
		// 향상된 for문
		for( Object obj : al1 ) {
			String s = (String)obj;
			System.out.println( s );
		}
	}

}
