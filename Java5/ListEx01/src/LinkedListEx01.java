import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add( "홍길동" );
		ll.add( "김철수" );
		ll.add( "임꺽정" );
		
		System.out.println( ll.toString() );
		
		System.out.println( ll.size() );
		
		System.out.println( ll.get(0) );
	}

}
