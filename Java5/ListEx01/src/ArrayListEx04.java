import java.util.List;
import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		
		al.add( "홍길동" );
		al.add( "김철수" );
		al.add( "임꺽정" );
		
		System.out.println( al.toString() );
		
		
		// 삽입
		al.add( 2, "장길산" );
		System.out.println( al.toString() );
		
		// 변경
		al.set( 0, "이몽룡" );
		System.out.println( al.toString() );
		
		// 제거
//		al.remove(0);
//		System.out.println( al.toString() );
//		
//		al.remove( "장길산" );
//		System.out.println( al.toString() );
//		
//		al.clear();
//		System.out.println( al.toString() );
		
		System.out.println( al.indexOf( "김철수" ) );		// 1
		System.out.println( al.lastIndexOf( "김철수" ) );	// 1
		
		List l = al.subList(1, 3);
		System.out.println( l.toString() );
	}

}
