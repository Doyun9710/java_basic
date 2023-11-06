import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		
		Person p1 = new Person("001", "홍길동");
		Person p2 = new Person("002", "김철수");
		Person p3 = new Person("003", "임꺽정");
		
		al.add( p1 );
		al.add( p2 );
		al.add( p3 );
		
		System.out.println( al.size() );
		System.out.println( al.toString() );
		
		Person p = (Person)al.get(0);
		System.out.println( p.getId() );
		System.out.println( p.getName() );
		
		
		// 전체 데이터 가져오기 for문
		for( int i=0 ; i<al.size() ; i++ ) 	{
			Person s = (Person)al.get(i);
			System.out.println( s.getId() );
			System.out.println( s.getName() );
		}
		
		
		
		// ArrayListEx05 응용
		ArrayList<Person> al2 = new ArrayList<Person>();
		al2.add( p1 );
		al2.add( p2 );
		al2.add( p3 );
		for( Person person : al2 ) {
			System.out.println( person.getId() );
			System.out.println( person.getName() );
		}
	}

}
