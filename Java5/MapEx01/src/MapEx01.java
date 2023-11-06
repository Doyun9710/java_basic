import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// K : key, V : value
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put( "a", "홍길동" );
		hm.put( "b", "김철수" );
		hm.put( "c", "임꺽정" );
		
		System.out.println( hm );
		System.out.println( hm.size() );
		
		hm.put( "d", "장길산" );
		System.out.println( hm );
		
		// 중복 시 수정
		hm.put( "c", "이몽룡" );
		System.out.println( hm );
		
		System.out.println( hm.get( "c" ) );
		
		hm.remove( "c" );
		System.out.println( hm );
		
		hm.clear();
		System.out.println( hm );
	}

}
