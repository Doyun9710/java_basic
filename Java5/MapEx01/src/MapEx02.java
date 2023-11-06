import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put( "a", "홍길동" );
		hm.put( "b", "김철수" );
		hm.put( "c", "임꺽정" );
		
		// key 추출
		Set<String> keys = hm.keySet();
		System.out.println( keys );
		
		// value 추출
		Collection<String> values = hm.values();
		System.out.println( values );
	}

}
