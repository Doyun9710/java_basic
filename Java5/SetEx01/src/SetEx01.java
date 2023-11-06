import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs1 = new HashSet<String>();
		Set<String> hs2 = new HashSet<String>();
		
		hs1.add( "홍길동" );
		hs1.add( "김철수" );
		hs1.add( "임꺽정" );
		
		System.out.println( hs1.toString() );
		System.out.println( hs1.size() );
		
		// 중복제거
		hs1.add( "김철수" );
		System.out.println( hs1.toString() );
		
		hs1.add( "장길산" );
		System.out.println( hs1.toString() );
		
//		System.out.println( hs1.get() );	// 순서가 없기 때문에 쓸 수 없다
		
		
		
		// 전체 데이터 접근 시 일반 for문 사용 불가
		for( String str : hs1 ) {
			System.out.println( str );
		}
		
		// Iterator 반복자
		Iterator<String> i = hs1.iterator();
		while( i.hasNext() ) {
			System.out.println( i.next() );
		}
	}

}
