import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al1 = new ArrayList();
		
		// 데이터 안정성 없음 : 하나의 ArrayList에 다양한 타입
		al1.add( "홍길동" );
		al1.add( "김철수" );
		al1.add( 1 );
		al1.add( 2 );
		
		System.out.println( al1.toString() );
		
		for( int i=0 ; i<al1.size() ; i++ ) {
//			String s = (String)al1.get(i);	// error
//			System.out.println( s );
		}
		
		
		
		// 입력 데이터에 대한 규정 : 제네릭
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add( "홍길동" );
		al2.add( "김철수" );
//		al2.add( 1 );	// error
		
		for( int i=0 ; i<al2.size() ; i++ ) {
			String s = (String)al2.get(i);
			System.out.println( s );
		}
	}

}
